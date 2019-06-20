package soft.demo4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Repository("user")
public class User {
    private String name;
    private String age;
    private Car car;

    public String getName() {
        return name;
    }
    @Value("张三")
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }
    @Value("24")
    public void setAge(String age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }
    //手动注入，指定注入哪个名称的对象
    @Resource(name = "usercar")
    public void setCar(Car car) {
        this.car = car;
    }
    @PostConstruct //在构造方法和init方法（如果有的话）之间得到调用，且只会执行一次
    public void init(){
        System.out.println("我是初始化方法");
    }
    @PreDestroy //注解的方法在destroy()方法调用后得到执行。
    public void destroy(){
        System.out.println("我是销毁方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", car=" + car +
                '}';
    }
}
