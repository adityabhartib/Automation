package com.bridgelabz;

import org.testng.annotations.*;

public class OrderOfTestNG {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite...........");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method..........");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method..........");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class.........");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("After Class........");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test..........");
    }
    @Test(priority = 2,groups = "t2",invocationCount = 3)
    void Print(){
        System.out.println("Print Test..........");
    }
    @Test(priority = 3,invocationCount = 0)
    void Print1(){
        System.out.println("Print1 Test...........");
    }
    @Test(priority = 1,enabled = false)
    void Print2(){
        System.out.println("Print2 Test............");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("After Test.............");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite.............");
    }
}
