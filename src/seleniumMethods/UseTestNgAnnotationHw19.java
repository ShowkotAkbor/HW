package seleniumMethods;
/*
public class UseTestNgAnnotationHw19 {
package seleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnotationHw19 {
	FirefoxDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("WebDriver.geco.Driver",
				"/Users/showkotakbor/eclipse-workspace/SeleniumMethod/driver/geckodriver");
		driver = new FirefoxDriver();
		// driver.get("https://portaldev.cms.gov/portal/");
		driver.get("https://www.amazon.com/");
		// driver.get("https://childrensnational.org/");
		// driver.get("https://enthrallit.com/");
		// driver.get("https://www.calyxsoftware.com/");
		// driver.get("https://www.wellsfargo.com/");
		// driver.get("https://www.bestbuy.com/");
		 driver.get("https://www.overstock.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(4000);
	}

	@Test(enabled = true, priority = 1)
	public void electByIndexdropDownTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(dropdown);
		select.selectByIndex(10);
		Thread.sleep(50000);
	}

	@Test(enabled = true, priority = 2)
	public void selectByIndexTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("apps & game");
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 3)
	public void selectByIndexTest1() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(dropdown);
		select.selectByValue("search-alias=ipad");
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 1)
	public void mouseHoverActionOnAboutUs() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement furniture = driver.findElement(By.xpath("///a[@id='TopNav_topNavLink_13']"));
		Thread.sleep(4000);
		actions.moveToElement(furniture).build().perform();
		Thread.sleep(4000);

		System.out.println("\nThe text of this web element is: " + furniture.getText());
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}

}
*/