package seleniumMethods;
/*
public class UseTestNgAnnotation2 {
	package seleniumMethods;


	import static org.testng.Assert.assertTrue;

	import java.sql.Driver;

	import org.omg.CORBA.PUBLIC_MEMBER;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.SendKeysAction;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;



	public class B_use_of_get_method {
		WebDriver driver;

		@BeforeTest
		public void setUp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"/Users/showkotakbor/eclipse-workspace/SeleniumMethod/driver/chromedriver");
			// WebDriver is an interface and ChromeDriver is a concrete class
			driver = new ChromeDriver();

			// driver.get("https://portaldev.cms.gov/portal/");
			// driver.get("https://www.amazon.com/");
			driver.get("https://childrensnational.org/");
			driver.get("https://enthrallit.com/");
			driver.get("https://www.calyxsoftware.com/");
			driver.get("https://www.wellsfargo.com/");
			driver.get("https://www.bestbuy.com/");


			driver.manage().window().fullscreen();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Thread.sleep(4000);

		}

		@Test(enabled = true, priority = 1)
		public void findTheDoctorButtonTest() throws InterruptedException {
			driver.findElement(By.id("ctl01_hypFAD")).click();// children nations'donation'
			Thread.sleep(4000);
			driver.findElement(By.name("maincontent_0$txtName")).sendKeys("Richard,brook or Richard brook");
			driver.findElement(By.linkText("Primary Care")).click();
			driver.findElement(By.id("maincontent_0_txtZip")).sendKeys("20011");
			driver.findElement(By.cssSelector("id.maincontent_0_btnSearchSubmit")).click();
			Thread.sleep(4000);
		}

		@Test(enabled = true, priority = 2)
		public void makeAppointmentButtonTest() {
			driver.findElement(By.className("header2-appt-txt")).click();// childrens nationals/make an appointment now
			driver.findElement(By.partialLinkText("Schedule"));
			driver.findElement(By.linkText(" What information do I need to schedule my child's appointment?")).click();
		}

		@Test(enabled = true, priority = 2)
		public void logobuutonTest() {
			boolean enthrallLogo = driver.findElement(By.className("//div[@class='col-xl-1 col-lg-1 col-md-6 col-6']"))
					.isDisplayed();
			System.out.println("Is the  Enthrall logo button displyaed? Ans: " + enthrallLogo);
		}

		@Test(enabled = true, priority = 3)// calyx
		public void scheduleADemoTest() {
			boolean scheduleADemo = driver.findElement(By.linkText("Schedule a Demo")).isEnabled();
			System.out.println("Is the schedule a demo button enabled? Ans: " + scheduleADemo);
		}
			@Test(enabled = true, priority = 4)//wellsfargo
			public void signInTest()throws InterruptedException {
				driver.findElement(By.cssSelector("label.lsc saveuser-pd")).click();
				boolean saveUserName=driver.findElement(By.className("lsc saveuser-pd")).isSelected();
				System.out.println("Is the save username selected? ans: " + saveUserName);
				Thread.sleep(5000);
			
		}
			@Test(enabled = true, priority = 5)//wellsfargo
			public void titleTest() throws InterruptedException {
				String expectedPageTitle="Wells Fargo Bank | Financial Services & Online Banking";
				String actualpgetitle = driver.getTitle();
				System.out.println(actualpgetitle);
				if (expectedPageTitle.equals(actualpgetitle)) {
					System.out.println("pagetitle tc is  pass");
				} else {
					System.out.println(" pagetitle tc is fail");
				}
			System.out.println("The title of the page is: " +driver.getTitle());
			
			
			String currentUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.wellsfargo.com/";
			if (expectedUrl.equals(currentUrl)) {
				System.out.println("Url tc is pass");
			} else {
				System.out.println("Url tc is fail");
			}
			Thread.sleep(4000);
			}
		@Test(enabled=true, priority=6)
		public void getTextTest() {
			WebElement enroll =driver.findElement(By.xpath("//a[text() ='Enroll']"));
			System.out.println("the text for the webElement is :" + enroll.getText());
			
		}
		@Test(enabled=true, priority=7)
		public void getAttributeTest() {
			String element1=driver.findElement(By.xpath("//a[@class='enroll']")).getAttribute("class");
			String element2=driver.findElement(By.xpath("//a[@class='enroll']")).getAttribute("href");
			
			System.out.println("the element of the class is:" + element1);
			System.out.println("the element of the class is:" + element2);
		}
		@Test(enabled=true, priority=8)
		public void uidPasswrdTest() throws InterruptedException{
		driver.findElement(By.id("userid_label")).sendKeys("abcaknob");
		driver.findElement(By.id("//label[@id='password_label']")).sendKeys("jaskldk");
		Thread.sleep(5000);
		}
		@Test(enabled=true, priority=9)//bestbuy.com
		public void productsearchTest() throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='gh-search-input']")).sendKeys("iphone");
			driver.findElement(By.xpath("//span[@class='header-search-icon']")).click();
			driver.findElement(By.xpath("//input[@id='gh-search-input']")).clear();
			driver.findElement(By.xpath("input[@id='gh-search-input']")).sendKeys("galaxyS21");
			driver.findElement(By.xpath("//span[@class='header-search-icon']")).click();
			Thread.sleep(5000);
		}
		@AfterTest
		public void tearUp() {
			driver.quit();
		}

	}

}
*/