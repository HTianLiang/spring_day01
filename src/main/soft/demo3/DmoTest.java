package soft.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DmoTest {
    @Test
    //@Autowired注解注入测试
    public void test1(){
        ApplicationContext acx = new ClassPathXmlApplicationContext("soft/demo3/applicationContext.xml");
        Boss boss = (Boss) acx.getBean("boss");
        System.out.println("@Autowired注解注入测试-----");
        System.out.println(boss);
        boss.hello();
    }
}
