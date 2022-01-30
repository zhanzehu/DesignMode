package AbstractFactoryMode;

public class SQLServerUser implements IUser {
    @Override
    public void Insert(User user) {
        System.out.println("在SQL Server中给User表增加一条记录");
    }

    @Override
    public User GetUser(Integer id) {
        System.out.println("在SQLServer中根据ID得到User表一条记录");
        return null;
    }
}
