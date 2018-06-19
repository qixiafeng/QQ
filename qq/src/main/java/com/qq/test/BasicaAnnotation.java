package com.qq.test;

import org.testng.annotations.*;

/**
 * Created by lvxinfeng on 2018/6/19.
 * desc:
 */
  @Test
public class BasicaAnnotation {
    public void testCase1(){
        System.out.println("testCase1");

    }

    public void testCase2(){
        System.out.println("testCase2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");

    }

    @AfterMethod
    public  void afterMethod(){
        System.out.println("afterMethod");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");

    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }
}
