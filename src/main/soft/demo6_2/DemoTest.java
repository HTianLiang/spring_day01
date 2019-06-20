package soft.demo6_2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:soft/demo6_2/applicationContext.xml")
public class DemoTest {

    @Resource(name = "user")
    private User user;
    @Resource(name = "userImpl")
    private UserInterface uf;

    @Test
    public void test(){
        uf.getInfo(user);
        System.out.println("--------------------------------");
        user=null;
        uf.getInfo(user);
    }

}
