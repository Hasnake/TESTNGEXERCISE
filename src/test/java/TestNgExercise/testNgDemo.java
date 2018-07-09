package TestNgExercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNgDemo {
    @Test
    public void Demo1(){
        System.out.println("Hello World");
    }
    @Test//
    public void Demo2(){
        System.out.println("Hello Worldin");
    }
 @Test
  public void Demo3(){
             Assert.assertEquals("Test","Test");}
    @Test
    public void Demo4(){
             Assert.assertNotEquals("Test","TEST","If the actual vs Expected are different then it is a pass.");}
    @Test
    public void Demo5(){
        Assert.assertTrue(5<6);}
    @Test
    public void Demo6(){
        Assert.assertFalse(8<6);}
    @Test
    public void Demo7(){
        Assert.assertNull(null);}

    @Test
    public void Demo8(){
        Assert.assertNotNull("Not Null");}

}

/*
TestNG supports many annotations and the philosophy behind using annotations is to bring the Test methods closer to any normal java method.
Below is the list of TestNG annotations:

@BeforeSuite will be executed before any tests declared inside a TestNG suite.
@BeforeTest will be executed before each test section declared inside a TestNG suite.
@BeforeClass will be executed before any of the test methods of a test class.
@BeforeMethod will be executed before the execution of each test method.
@BeforeGroups will run before any of the test method of the specified group is executed. groups attribute must contain the list of groups this method belongs to.
@AfterSuite will be executed after any tests declared inside a TestNG suite.
@AfterTest will be executed after each test section declared inside a TestNG suite.
@AfterClass will be executed after the last test method of a test class.
@AfterMethod will be executed after the execution of each test method.
@AfterGroups will run after the last test method of the specified group is executed. groups attribute must contain the list of groups this method belongs to.
@DataProvider method provides the data for a test method and must return a two dimensional object array (Object[ ][ ]) as data.
@Factory method returns an array of class objects (Object[ ]). This is used to run a set of test cases with different values provided to the test class during its instantiation.
@Test marks a class or a method as a test method. If used at class level, all the public methods of a class will be considered as a test method.
@Listeners is defined at class level to specify an array of test listeners classes extending org.testng.ITestNGListener.
@Parameters is used to pass parameters to a test method. These parameter values are provided in the testng.xml configuration file at runtime.
*/



/*
https://webkul.com/blog/assertion-in-selenium-webdriver/
A hard assert throw AssertException immediately after a test fails and the test is marked as failed. Perhaps test suite continues with next @Test annotation. A hard assertion can be of following types:

assertEquals
assertNotEquals
assertTrue
assertFalse
assertNull
assertNotNull
*/
