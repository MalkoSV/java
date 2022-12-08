package Hw7;

public class Manager extends BaseEmployee implements IManager {
    private int numberOfSubordinates = 0;
    public static final Double SALARY_PERCENT = 0.01;

    public Manager(String name, int baseSalary, int yearOfBirth, char sex,
                   int salaryPerDay, int numberOfSubordinates) {
        super(name, baseSalary, yearOfBirth, sex, salaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Manager(String name, int baseSalary) {
        super(name, baseSalary);
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getKoef(){
        return 1 + getNumberOfSubordinates() * Manager.SALARY_PERCENT;
    }
    public String[][] getSalary(Month[] monthArray) {
        String[][] salary = new String[monthArray.length][2];
        double koef = (1 + getNumberOfSubordinates() * SALARY_PERCENT);
        for (int i = 0; i < monthArray.length; i++) {
            salary[i][0] = monthArray[i].getName();
            salary[i][1] = String.valueOf(getSalaryPerDay() * monthArray[i].getWorkingDaysNumber() * getKoef());
            System.out.println(String.format("%s: %s - %s", getName(), salary[i][0], salary[i][1]));
        }
//        System.out.println("Manager.GetSalary " + getName());
        return salary;
    }
}