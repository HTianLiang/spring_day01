package soft.demo6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//帮我们创建容器
@RunWith(SpringJUnit4ClassRunner.class)
//指定创建容器时使用哪个配置文件
@ContextConfiguration("classpath*:soft/demo6/applicationContext.xml")
public class DemoTest {

    @Resource(name = "user")
    private User user;

    @Test
    public void test(){
        user.find();
    }

}
