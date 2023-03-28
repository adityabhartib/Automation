package com.bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseAttribute {
    @Test(groups = "t1")
    public void createUser() {
        System.out.println("user created successufully");
        Assert.fail();
    }
    @Test(dependsOnMethods = "createUser")
    public void deleteUser() {
        System.out.println("deleteUser...");
    }
}
