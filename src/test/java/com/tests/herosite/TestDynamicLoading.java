package com.tests.herosite;

import com.tests.core.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.DynamicLoading;

public class TestDynamicLoading extends BaseTest {

    private DynamicLoading dynamicLoading;

    @Before
    public void setUpDL() {
        dynamicLoading = new DynamicLoading(driver);
    }

    @Test
    public void hiddenElementLoads() {
        dynamicLoading.loadExample("1");
        Assert.assertTrue(dynamicLoading.isFinishTextPresent());
    }

    @Test
    public void elementAppears(){
        dynamicLoading.loadExample("2");
        Assert.assertTrue(dynamicLoading.isFinishTextPresent());
    }


}
