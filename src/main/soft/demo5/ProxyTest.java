package soft.demo5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {

        //真实对象--即目标对象
        final UserImpl targetUser = new UserImpl();

        //动态创建代理对象
        /*
         * 把生成的动态代理对象挂在接口下
         * 显然UserImpl对象的接口是User
         */
        User user= (User) Proxy.newProxyInstance(
                targetUser.getClass().getClassLoader(),
                targetUser.getClass().getInterfaces(),
                new InvocationHandler() {
                    //代理对象调用接口相应方法 都是调用invoke
                    /*
                     * proxy:是代理对象
                     * method:代表的是目标方法的字节码对象
                     * args:代表是调用目标方法时参数
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("调度前");
                        //反射知识点
                        Object invoke = method.invoke(targetUser, args);//目标对象的相应方法
                        System.out.println("调度后");
                        return invoke;
                    }
                }
        );
        user.insert();//调用invoke---Method:目标对象的save方法  args：null 返回值null

    }
}
