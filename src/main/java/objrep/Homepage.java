package objrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	static WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	
	@FindBy(linkText="POPULAR ITEMS") static WebElement Popitem;
	@FindBy(xpath="//*[@id=\"popular_items\"]/div") static WebElement popbock;
	@FindBy(name="popular_item_16_name") static WebElement item1;
	@FindBy(name="popular_item_10_name") static WebElement item2;
	@FindBy(name="popular_item_21_name") static WebElement item3;
	@FindBy(id="details_16") static WebElement item1link;
	@FindBy(id="details_10") static WebElement item2link;
	@FindBy(id="details_21") static WebElement item3link;
	@FindBy(xpath="//*[@id=\"Description\"]/h1") static WebElement tabedescp;
	@FindBy(xpath="//*[@id=\"Description\"]/h1") static WebElement laptopdescp;
	@FindBy(xpath="//*[@id=\"Description\"]/h1") static WebElement spedesp;


	
	public static WebElement popular_item() {
		
		return Popitem;
	}

public static WebElement popular_block() {
		
		return popbock;
	}
public static WebElement tablet_text() {
	
	return item1;
}
public static WebElement laptop_text() {
	
	return item2;
}
public static WebElement speaker_text() {
	
	return item3;
}
public static WebElement tablet_link() {
	
	return item1link;
}
public static WebElement laptop_link() {
	
	return item2link;
}
public static WebElement speaker_link (){
	
	return item3link;
}

public static WebElement table_decp_text() {
	
	return tabedescp;
	
}
public static WebElement laptop_decp_text() {
	
	return laptopdescp;
	
}	
public static WebElement spe_decp_text() {
	
	return spedesp;
	
}	
	

	


}
