import Lesson6_Test.ClassArrays;
import org.junit.*;

public class Test {
    ClassArrays arraysTest;

    @Before
    public void init() {
        System.out.println("init");
        arraysTest = new ClassArrays();
    }

    @org.junit.Test
    public void testAfterLastFour1() {
        Assert.assertArrayEquals(new int[]{1,2}, arraysTest.getDigitAfterLast4(new int[]{0, 5, 4, 1, 2}));
    }

    @org.junit.Test
    public void testAfterLastFour2() {
        Assert.assertArrayEquals( new int[]{5, 8, 6}, arraysTest.getDigitAfterLast4(new int[]{4, 5, 0, 1, 2, 4, 5, 4, 5, 8, 6}));
   }

     @org.junit.Test(expected = RuntimeException.class)
     public void testAfterLastFour3() {
         Assert.assertArrayEquals( new int[]{}, arraysTest.getDigitAfterLast4(new int[]{0, 5, 0, 1, 2}));
    }

    @org.junit.Test
    public void testIsOneAndFour1() {
        Assert.assertEquals(true, arraysTest.isOneAndFourInArray(new int[]{1, 4, 4, 1, 1}));
    }

    @org.junit.Test
    public void testIsOneAndFour2() {
        Assert.assertEquals(false, arraysTest.isOneAndFourInArray(new int[]{1, 0, 4, 1, 1}));
    }

    @org.junit.Test
    public void testIsOneAndFour3() {
        Assert.assertEquals(false, arraysTest.isOneAndFourInArray(new int[]{1, 1, 1, 1, 1}));
    }

    @org.junit.Test
    public void testIsOneAndFour4() {
        Assert.assertEquals(false, arraysTest.isOneAndFourInArray(new int[]{4, 4, 4, 4, 4}));
    }

    @After
    public void shutdown() {
        System.out.println("end");
    }
}
