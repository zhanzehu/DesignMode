package AbstractFactoryMode;

public interface IFactory {

    IUser CreateUser();

    IDepartment CreateDepartment();
}
