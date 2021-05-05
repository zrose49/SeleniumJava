package com.tests.herosite;

import com.tests.core.BaseTest;
import com.tests.groups.All;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.DynamicLoading;
import org.junit.experimental.categories.Category;
import com.tests.groups.Deep;

public class TestDynamicLoading extends BaseTest {

    private DynamicLoading dynamicLoading;

    @Before
    public void setUpDL() {
        dynamicLoading = new DynamicLoading(driver);
    }

    @Test
    @Category({Deep.class, All.class})
    public void hiddenElementLoads() {
        dynamicLoading.loadExample("1");
        Assert.assertTrue(dynamicLoading.isFinishTextPresent());
    }

    @Test
    @Category(Deep.class)
    public void elementAppears(){
        dynamicLoading.loadExample("2");
        Assert.assertTrue(dynamicLoading.isFinishTextPresent());
    }


}
