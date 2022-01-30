package AbstractFactoryMode;

public class SQLServerDepartment implements IDepartment {
    @Override
    public void Insert(Department department) {
        System.out.println("在SQLServer 中给Department表添加一条记录");
    }

    @Override
    public Department GetDepartment(Integer id) {
        System.out.println("在SQLServer 中根据ID得到Department表一条记录");
        return null;
    }
}
