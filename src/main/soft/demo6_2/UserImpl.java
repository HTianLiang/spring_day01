package soft.demo6_2;

import org.springframework.stereotype.Repository;

@Repository("userImpl")
public class UserImpl implements UserInterface {
    @Override
    public void getInfo(User user) {
        System.out.println(" id:"+user.getId()+",\n name:"+user.getName()+",\n age:"+user.getAge());
    }
}
