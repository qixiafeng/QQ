package com.qq.test.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by lvxinfeng on 2018/6/19.
 * desc:
 */
public class suitConfig {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit is run");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuit is run");
    }

    @BeforeTest
    public  void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public  void afterTest(){
        System.out.println("afterTest");
    }
}
