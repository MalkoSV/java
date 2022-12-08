package Hw7;

import java.time.Year;

public abstract class BaseEmployee implements IEmployee{
    private String name;
    private int baseSalary;
    private int yearOfBirth;
    private char sex;
    private int salaryPerDay;

    public BaseEmployee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public BaseEmployee(String name, int baseSalary, int yearOfBirth, char sex, int salaryPerDay) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
    }
    public int getAge() {
        return Year.now().getValue() - this.yearOfBirth;
    }

    public void setAge(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
}