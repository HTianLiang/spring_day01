package soft.demo4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository("usercar") //等效@Component
@Component("usercar")
public class Car {
    private String name;
    private String color;

    public String getName() {
        return name;
    }
    //通过set方法赋值
    @Value("保时捷")
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    @Value("宝石黑")
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
