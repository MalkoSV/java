package Hw7;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EmployeeUtilsTest {

    private final IManager[] managers = {
            new Manager("Bogdana", 12_000, 2000, 'F',
                    2_000, 33),
            new Director("Taras", 12_000, 1980, 'M',
                    3_000, 15),
            new Manager("Michael", 12_000, 1997, 'M',
                    1_000, 2),
            new Manager("Mary", 12_000, 2000, 'F',
                    2_000, 30)
    };
    private final IManager[] managers0 = new Manager[]{};

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testGetSum() {
    }

    @Test
    public void testGetMinSalary() {
    }

    @Test
    public void testGetMaxSalary() {
    }

    @Test
    public void testFindEmployee() {
    }

    @Test
    public void testGetSubordinatesMin() {
        System.out.println("testGetSubordinatesMin()");
        Assert.assertEquals(EmployeeUtils.getSubordinatesMin(managers), 2);
        Assert.assertEquals(EmployeeUtils.getSubordinatesMin(managers0), -1);
        Assert.assertEquals(EmployeeUtils.getSubordinatesMin(null), -1);
    }

    @Test
    public void testGetSubordinatesMax() {
        System.out.println("testGetSubordinatesMax()");
        Assert.assertEquals(EmployeeUtils.getSubordinatesMax(managers), 33);
        Assert.assertEquals(EmployeeUtils.getSubordinatesMax(managers0), -1);
        Assert.assertEquals(EmployeeUtils.getSubordinatesMax(null), -1);
    }

    @Test
    public void testGetSalaryAddMax() {
    }

    @Test
    public void testGetSalaryAddMin() {
    }
}