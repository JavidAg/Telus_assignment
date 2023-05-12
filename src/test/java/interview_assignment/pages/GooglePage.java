package interview_assignment.pages;

import interview_assignment.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="APjFqb")
    public WebElement searchField;

    @FindBy(xpath = "(//cite[@class[contains(text(), '')]])[1]")
    public WebElement resultFirst;

}

