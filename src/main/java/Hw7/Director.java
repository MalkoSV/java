package Hw7;

public final class Director extends Manager{
    public static final Double SALARY_PERCENT = 0.09;
    public Director(String name, int baseSalary, int yearOfBirth, char sex, int salaryPerDay,
                    int numberOfSubordinates) {
        super(name, baseSalary, yearOfBirth, sex, salaryPerDay, numberOfSubordinates);
    }

    public double getKoef(){
        return 1 + getNumberOfSubordinates() * Director.SALARY_PERCENT;
    }
    
}

