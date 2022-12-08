package Hw7;

public final class Month {
    private String name;
    private int daysNumber;
    private int workingDaysNumber;
    public static final Month[] ALL_YEAR_MONTHS = {
            new Month("January", 31, 22),
            new Month("February", 28, 20),
            new Month("March", 31, 23),
            new Month("April", 30, 24),
            new Month("May", 31, 22),
            new Month("June", 30, 22),
            new Month("July", 31, 23),
            new Month("August", 31, 23),
            new Month("September", 30, 21),
            new Month("October", 30, 24),
            new Month("November", 30, 22),
            new Month("December", 31, 23)};

    public Month(String name, int daysNumber, int workingDaysNumber) {
        this.name = name;
        this.daysNumber = daysNumber;
        this.workingDaysNumber = workingDaysNumber;
    }

    public static Month[] getAllYearMonths() {
        return ALL_YEAR_MONTHS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysNumber() {
        return daysNumber;
    }

    public void setDaysNumber(int daysNumber) {
        this.daysNumber = daysNumber;
    }

    public int getWorkingDaysNumber() {
        return workingDaysNumber;
    }

    public void setWorkingDaysNumber(int workingDaysNumber) {
        this.workingDaysNumber = workingDaysNumber;
    }

    public static Month[] GetQuaterMonths(int quaterNum) {
        switch (quaterNum) {
            case 1:
                return new Month[]{getAllYearMonths()[0], getAllYearMonths()[1], getAllYearMonths()[2]};
            case 2:
                return new Month[]{getAllYearMonths()[3], getAllYearMonths()[4], getAllYearMonths()[5]};
            case 3:
                return new Month[]{getAllYearMonths()[6], getAllYearMonths()[7], getAllYearMonths()[8]};
            case 4:
                return new Month[]{getAllYearMonths()[9], getAllYearMonths()[10], getAllYearMonths()[11]};
            default:
                System.out.println("Wrong number of Quater!");
                return new Month[0];
        }
    }

    public static Month[] GetHalfYearMonths(int halfNum) {
        switch (halfNum) {
            case 1:
                return new Month[]{getAllYearMonths()[0], getAllYearMonths()[1], getAllYearMonths()[2],
                        getAllYearMonths()[3], getAllYearMonths()[4], getAllYearMonths()[5]};
            case 2:
                return new Month[]{getAllYearMonths()[6], getAllYearMonths()[7], getAllYearMonths()[8],
                        getAllYearMonths()[9], getAllYearMonths()[10], getAllYearMonths()[11]};
            default:
                System.out.println("Wrong number of Half!");
                return new Month[0];
        }
    }
}