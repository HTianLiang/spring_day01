package soft.demo6_1;

public class UserImpl implements User {
    @Override
    public void insert() {
        System.out.println("新增用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }

    @Override
    public void delete() {
        //int i = 1/0;
        System.out.println("删除用户");
    }

    @Override
    public void find() {
        //int i = 1/0;
        System.out.println("查找用户");
    }
}
