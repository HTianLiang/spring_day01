package soft.demo3;

import org.springframework.beans.factory.annotation.Autowired;

public class Boss {
    @Autowired
    private User user;

    /*public Boss(User user) {
        this.user = user;
    }*/

    public void hello(){
        System.out.println("你好！"+user.getName());
    }

    @Override
    public String toString() {
        return "Boss{" +
                "user=" + user.getName() +
                '}';
    }
}
