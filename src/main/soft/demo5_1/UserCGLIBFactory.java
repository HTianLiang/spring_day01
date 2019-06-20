package soft.demo5_1;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//CGLIB代理
public class UserCGLIBFactory implements MethodInterceptor {

    public User getUserGBLIB(){
        Enhancer en = new Enhancer();//帮我们生成代理对象
        en.setSuperclass(UserImpl.class);//设置对谁进行代理
        en.setCallback(this);//设置代理要做什么
        User user = (User) en.create();//创建代理对象
        return user;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("打开事务");
        //调用原有方法
        Object invoke = methodProxy.invokeSuper(proxy, args);
        System.out.println("提交事务");
        return invoke;
    }
}
