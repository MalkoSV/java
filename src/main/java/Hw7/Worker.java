package Hw7;

public final class Worker extends BaseEmployee implements IEmployee {

    public Worker(String name, int baseSalary) {
        super(name, baseSalary);
    }

    public Worker(String name, int baseSalary, int yearOfBirth, char sex, int salaryPerDay) {
        super(name, baseSalary, yearOfBirth, sex, salaryPerDay);
    }

    @Override
    public String[][] getSalary(Month[] monthArray) {
        String baseSalary = Integer.toString(getBaseSalary());
        String[][] salary = new String[monthArray.length][2];
        for (int i = 0; i < monthArray.length; i++) {
            salary[i][0] = monthArray[i].getName();
            salary[i][1] = baseSalary;
//            System.out.println(String.format("%s: %s - %s", getName(), salary[i][0], salary[i][1]));
        }
        System.out.println("Worker.GetSalary " + getName());
        return salary;
    }
}