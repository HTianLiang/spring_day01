package soft.demo5_1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理
public class UserProxyFactory implements InvocationHandler {

    private User us;

    public UserProxyFactory(User us) {
        super();
        this.us = us;
    }

    public User getUserProxy(){
        //生成动态代理
        User user = (User) Proxy.newProxyInstance(
                UserProxyFactory.class.getClassLoader(),
                UserImpl.class.getInterfaces(),
                this
        );
        return user;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("打开事务");
        Object invoke = method.invoke(us, args);
        System.out.println("提交事务");
        return invoke;
    }
}
