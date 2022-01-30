package AbstractFactoryMode;

public class AccessDepartment implements IDepartment {
    @Override
    public void Insert(Department department) {
        System.out.println("在Access 中给Department表添加一条记录");
    }

    @Override
    public Department GetDepartment(Integer id) {
        System.out.println("在Access中根据ID得到Department表一条记录");
        return null;
    }
}
