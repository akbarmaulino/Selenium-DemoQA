package testNG.demoQA;


import org.testng.annotations.*;


public class TestSecond {
    @Test
    public void sampleTest() {
        System.out.println("Ini test method2");
    }
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }


    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("After Groups");
    }


    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    } 

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }


    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
    
}
