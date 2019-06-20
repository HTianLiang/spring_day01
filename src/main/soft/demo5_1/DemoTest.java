package soft.demo5_1;

import org.junit.Test;

public class DemoTest {

    @Test
    //动态代理
    public void test1(){
        User user = new UserImpl();
        UserProxyFactory factory = new UserProxyFactory(user);
        User usProxy = factory.getUserProxy();
        usProxy.update();

        //代理对象与被代理对象实现了相同的接口
        //代理对象与被代理对象没有继承关系
        System.out.println(usProxy instanceof UserImpl); //--->false
    }

    @Test
    //CGLIB代理
    public void test2(){
        UserCGLIBFactory factory = new UserCGLIBFactory();
        User userGBLIB = factory.getUserGBLIB();
        userGBLIB.delete();

        //判断代理对象是否属于被代理对象类型
        //代理对象继承了被代理对象--->true
        System.out.println(userGBLIB instanceof UserImpl); //--->true
    }

}
