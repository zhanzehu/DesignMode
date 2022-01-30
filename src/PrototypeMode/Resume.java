package PrototypeMode;

public class Resume implements Cloneable{

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name){
        this.name = name;
    }

    //设置个人信息
    public void SetPersonalInfo(String sex,String age){
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void SetWorkExperience(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    //显示
    public void Display(){
        System.out.println(name+" "+sex+" "+age);
        System.out.println("工作经历："+timeArea+" "+company);
    }

    public Object Clone() throws CloneNotSupportedException {
        return (Object)this.clone();
    }
}
