package soft.demo1;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

    @Test
    //空参构造
    public void test1(){
        //创建容器对象
        ApplicationContext acx = new ClassPathXmlApplicationContext("soft/demo1/applicationContext.xml");
        //向容器“要”User
        User user = (User) acx.getBean("username");
        //打印user对象
        System.out.println(user);
    }
    @Test
    //测试生命周期方法
    public void test2(){
        //创建容器对象
        ClassPathXmlApplicationContext acx = new ClassPathXmlApplicationContext("soft/demo1/applicationContext.xml");
        //向容器“要”User
        User user = (User) acx.getBean("username");
        //打印usr对象
        System.out.println(user);
        //关闭容器，触发销毁方法
        acx.close();
    }

}
