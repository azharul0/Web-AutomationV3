package testgoogle;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class TestGoogle extends CommonAPI {
    @Test
    public void testSearchBar(){
        driver.findElement(By.name("q")).sendKeys("weather");
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
    }


    @Test
    public void testHomePageTitle(){
        String title = driver.getTitle();
        System.out.println(title);
    }
}
