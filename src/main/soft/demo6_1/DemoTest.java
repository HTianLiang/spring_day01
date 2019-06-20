package soft.demo6_1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:soft/demo6_1/applicationContext.xml")
public class DemoTest {

    @Resource(name = "user")
    private User user;

    @Test
    public void test(){
        user.delete();
    }

}
