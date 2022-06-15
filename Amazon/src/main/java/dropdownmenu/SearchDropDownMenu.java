package dropdownmenu;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchDropDownMenu {

    public static void fetchDropDownMenuItems(){
        List<String> text = CommonAPI.getListOfText(".nav-search-dropdown.searchSelect.nav-progressive-attrubute option");
        CommonAPI.printText(text);
        Assert.assertEquals(text,text);
    }

}

