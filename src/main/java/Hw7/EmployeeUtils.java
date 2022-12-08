package Hw7;

import java.util.Arrays;

import static java.lang.Integer.*;

public class EmployeeUtils {
    static int salarySum;
    static int minSalary;
    static int maxSalary;
    static int subsMin = MAX_VALUE;
    static int subsMax = 0;
    static int minAdd = MAX_VALUE;
    static int maxAdd = 0;

    public static int getSum(Manager[] managersArray, Month[] months) {
        salarySum = 0;
        for (Manager manager : managersArray) {
            String[][] array = manager.getSalary(months);
            for (int i = 0; i < array.length; i++) {
                salarySum += parseInt(array[i][1]);
            }
        }
        return salarySum;
    }

    public static int getMinSalary(IEmployee[] managersArray, Month[] months) {
        minSalary = MAX_VALUE;
        for (IEmployee manager : managersArray) {
            String[][] array = manager.getSalary(months);
            for (int i = 0; i < array.length; i++) {
                minSalary = min(parseInt(array[i][1].replace(".0", "")), minSalary);
            }
        }
        return minSalary;
    }

    public static int getMaxSalary(IEmployee[] managersArray, Month[] months) {
        maxSalary = 0;
        for (IEmployee manager : managersArray) {
            String[][] array = manager.getSalary(months);
            for (int i = 0; i < array.length; i++) {
                maxSalary = max(parseInt(array[i][1].replace(".0", "")), maxSalary);
            }
        }
        return maxSalary;
    }

    public static BaseEmployee[] findEmployee(BaseEmployee[] myArr, String text) {
        return Arrays.stream(myArr)
                .filter(employee -> employee.getName().contains(text)).toArray(BaseEmployee[]::new);
    }

    public static int getSubordinatesMin(IManager[] managersArray) {
        if (managersArray == null || managersArray.length == 0) {
            return -1;
        }
        for (IManager manager : managersArray) {
            subsMin = min(manager.getNumberOfSubordinates(), subsMin);
        }
        return subsMin;
    }
    public static int getSubordinatesMax(IManager[] managersArray) {
        if (managersArray == null || managersArray.length == 0) {
            return -1;
        }
        for (IManager manager : managersArray) {
            subsMax = max(manager.getNumberOfSubordinates(), subsMax);
        }
        return subsMax;
    }
    public static int getSalaryAddMax(Manager[] managersArray) {
        for (Manager manager : managersArray) {
            maxAdd = max((int) (manager.getNumberOfSubordinates() * manager.SALARY_PERCENT), maxAdd);
        }
        return maxAdd;
    }
    public static int getSalaryAddMin(Manager[] managersArray) {
        for (Manager manager : managersArray) {
            minAdd = min((int) (manager.getNumberOfSubordinates() * manager.SALARY_PERCENT), minAdd);
        }
        return minAdd;
    }
}