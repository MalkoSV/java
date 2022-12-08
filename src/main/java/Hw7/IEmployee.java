package Hw7;

public interface IEmployee {
    public int getAge();

    public void setAge(int yearOfBirth);

    public char getSex();

    public void setSex(char sex);
    public int getSalaryPerDay();

    public void setSalaryPerDay(int salaryPerDay);

    public String getName();

    public void setName(String name);

    public int getBaseSalary();

    public void setBaseSalary(int baseSalary);

    String[][] getSalary(Month[] monthArray);

}
