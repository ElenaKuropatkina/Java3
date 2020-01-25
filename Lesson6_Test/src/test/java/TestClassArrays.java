//import Lesson6_Test.ClassArrays;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//@RunWith(Parameterized.class)
//public class TestClassArrays {
//    @Parameterized.Parameters
//    public static Collection<Object[][]> dataForFirstMethod(){
//        return Arrays.asList(new Object[][][]{
//                {{1,2}, {0, 5, 4, 1, 2}}
////                {1, 1, 2},
////                {1,1,5}
//        });
//    }
//
//    private ClassArrays arraysTest;
//    int[] array;
//    int[] newArray;
//
//    public TestClassArrays(int[] newArray, int[] array){
//        this.newArray = newArray;
//        this.array = array;
//    }
//    @Before
//    public void init(){arraysTest = new ClassArrays();}
//
//    @Test
//    public void arraysTest(){
//        Assert.assertArrayEquals(newArray, arraysTest.getDigitAfterLast4(array));
//    }
//}
