package com.ait.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getHeader().isElementPresent(
                By.cssSelector("div.navbar-component_nav__1X_4m a[href='/login']"))
        ) {
            app.getHeader().clickOnSignOutButton();
        }
    }
    @Test
    public void checkHeaderLogoTest() {
        Assert.assertTrue(
                app.getHeader().isElementPresent(
                        By.xpath("//div[@class='navbar-component_nav__1X_4m']/h1[contains(.,'PHONEBOOK')]")
                )
        );
    }
    @Test
    public void checkHeaderHomeLinkTest() {
        Assert.assertTrue(
                app.getHeader().isElementPresent(
                        By.cssSelector("div.navbar-component_nav__1X_4m a[href='/home']")
                )
        );
    }
    @Test
    public void checkHeaderAboutLinkTest() {
        Assert.assertTrue(
                app.getHeader().isElementPresent(
                        By.cssSelector("div.navbar-component_nav__1X_4m a[href='/about']")
                )
        );
    }
    @Test
    public void checkHeaderLoginLinkTest() {
        Assert.assertTrue(
                app.getHeader().isElementPresent(
                        By.cssSelector("div.navbar-component_nav__1X_4m a[href='/login']")
                )
        );
    }
}