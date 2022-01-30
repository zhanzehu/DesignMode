package AbstractFactoryMode;

public class SQLServerFactory implements IFactory {
    @Override
    public IUser CreateUser() {
        return new SQLServerUser();
    }

    @Override
    public IDepartment CreateDepartment() {
        return new SQLServerDepartment();
    }
}
