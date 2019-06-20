package soft.demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//帮我们创建容器
@RunWith(SpringJUnit4ClassRunner.class)
//指定创建容器时使用哪个配置文件
@ContextConfiguration("classpath:soft/demo4/applicationContext.xml")
public class DemoTest {

    //将名为user的对象注入到u变量中
    @Resource(name = "user")
    private User u;

    @Test
    public void test(){
        System.out.println(u);
    }

}
