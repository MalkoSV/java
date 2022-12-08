package Hw7;

public class MonthUtils {
    public static final Month[] JANUARY = {
            new Month("January", 31, 22)};

    public static IEmployee viva = new Worker("Vidovik", 1000);
    public static IEmployee michael = new Manager("Michael", 12_000, 1997, 'M',
            1_000, 3);
    public static IEmployee mary = new Manager("Mary", 12_000, 2000, 'F',
            2_000, 30);
    public static IEmployee boss = new Director("Boss", 12_000, 1980, 'M',
            1_000, 3);
    public static IManager bogdana = new Manager("Bogdana", 12_000, 2000, 'F',
            2_000, 30);
    public static IManager taras = new Director("Taras", 12_000, 1980, 'M',
            3_000, 3);

    public static void main(String[] args) {
//        viva.getSalary(january);
//        michael.getSalary(ALL_YEAR_MONTHS);
//        boss.getSalary(january);
        System.out.println(EmployeeUtils.getMaxSalary(new IEmployee[]{michael, boss}, JANUARY ));
//        System.out.println(EmployeeUtils.getMaxSalary(new IEmployee[]{boss}, ALL_YEAR_MONTHS ));
//        System.out.println(EmployeeUtils.getMinSalary(new IEmployee[]{viva},
//                new Month[]{new Month("December", 31, 23)}));
//        System.out.println(EmployeeUtils.getSubordinatesMax(new IManager[]{taras, bogdana}));
//        System.out.println(EmployeeUtils.getSubordinatesMin(new IManager[]{taras, bogdana}));
//        for (Month month: Month.GetHalfYearMonths(2)) {
//            System.out.println(month.getName() + " " + month.getWorkingDaysNumber());
//        }
    }

}
