package soft.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

    @Test
    //set方式注入
    public void test1(){
        ApplicationContext acx = new ClassPathXmlApplicationContext("soft/demo2/applicationContext.xml");
        User user = (User) acx.getBean("username");
        System.out.println(user);
    }
    @Test
    //构造函数注入
    public void test2(){
        ApplicationContext acx = new ClassPathXmlApplicationContext("soft/demo2/applicationContext.xml");
        User1 user = (User1) acx.getBean("username1");
        System.out.println(user);
    }
    @Test
    //复杂类型注入
    public void test3(){
        ApplicationContext acx = new ClassPathXmlApplicationContext("soft/demo2/applicationContext.xml");
        CollectionBean cb = (CollectionBean) acx.getBean("CB");
        System.out.println(cb);
    }

}
