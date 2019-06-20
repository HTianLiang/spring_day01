package soft.demo6_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("user")
public class User {
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    @Value("1")
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Value("张三")
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @Value("22")
    public void setAge(Integer age) {
        this.age = age;
    }
}
