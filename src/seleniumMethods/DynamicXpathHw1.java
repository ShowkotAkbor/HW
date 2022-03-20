package seleniumMethods;

public class DynamicXpathHw1 {
/*	// use single attribute with 5 example
	driver.findElement(By.xpath("homemain_0_rptTaskIcons_hypTaskLinkUrl_0")).click();//use single attribute  
	driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("akbor");//use single attribute 
	driver.findElement(By.xpath("date_of_birth")).sendKeys("12/31/1983");//use single attribute 
	driver.findElement(By.xpath("access_code")).sendKeys("1234567");//use single attribute
	driver.findElement(By.xpath("//a[@id='ctl03_hypFAD']")).click();//use single attribute
	
//use multiple atrribute
	driver.findElement(By.xpath("//a[@class='featured-content-single-button' and @href='https://childrensnational.paymyhealthbill.com/quickpay']")).click();
	driver.findElement(By.xpath("//a[@class='TopNav_topNavLink_13' and @href='/Home-Garden/Rugs/244/cat.html']")).click();//overstock 'rugs'
	driver.findElement(By.xpath("///a[@class='menu-btn cms-header-link cms-help-menu nav-link' and @id='nav-application-link']")).click();//cms.gov application button
	driver.findElement(By.xpath("//a[@id='cms-newuser-reg'and @class='cms-newuser-reg']")).click();//cms,gov
	driver.findElement(By.xpath("//a[@id='cms-forgot-userid' and @href='/portal/forgotuserid']")).click();
	
	// tag with innertext
	driver.findElement(By.linkText("See Accounts")).click();//childrennatioanls 
	driver.findElement(By.linkText("//a[text()='Make an Appointment Today']")).click();//from children nationals
	driver.findElement(By.linkText("//a[text()='Donate']")).click();//from childrensnationals 
	driver.findElement(By.linkText("Deal of the Day")).click();// from bestbuy.com
	driver.findElement(By.linkText("Top Deals")).click();//from bestbuy.com 
	
	//tag with inner text(not acuall text mean partial as wel as coomplete text)
	boolean paragraphContains = driver.findElement(By.xpath("//h2[contains(text()='cancer is complex.')]")).isDisplayed();// partial textmount sinai hosp
	System.out.println("Is the paragraph contains the text? Ans: "+ paragraphContains);
	driver.findElement(By.xpath("//a[contains(text(), 'About the Mount Sinai Tisch Cancer Center')]"));//complete text
	
	
	//tag with attributes and use of contains
	driver.findElement(By.xpath("//a[contains(@href,'/care/cancer/team')]")).click();//mount sinai find a doctor
	driver.findElement(By.xpath("//a[contains(@class,'C-24-Call-To-Action pink-cta-bg cta-right')]")).click();//mount sinai make an appointment
	driver.findElement(By.xpath("//a[contains(@class,'C-24-Call-To-Action mshs-sidebar blue-cta-bg')]")).click();//mount sinai, MyMountSinai Patient Portal
	driver.findElement(By.xpath("//span[contains(@class,'cart-label')]")).click();//bestbuy 'cart'
	driver.findElement(By.xpath("//a[contains(@class,'bottom-left-links')]")).click();//best by credit card
	
	
	//normalize space
	driver.findElement(By.xpath("//a[normalize-space(text())='About Us'and @class='hidden-xs dropdown']"));//mount sinai 'about us'
	driver.findElement(By.xpath("//a[normalize-space(text())='Furniture' and @class='TopNav_topNavLink_13']"));// overstock 'furnitur'	driver.findElement(By.xpath("////a[normalize-space(text())='Rugs'and @class='TopNav_topNavLink_13']"));//overstock rugs
	driver.findElement(By.xpath("//a[normalize-space(text())='Our Services' and @class='hidden-xs dropdown']"));//mount  sinai 'Ours Services'
	driver.findElement(By.xpath("//input[normalize-space(text())='Search... everything you find ships for free' and @class='search_searchBar_de']"));//overstock 'search everything find ships for free'
	driver.findElement(By.xpath("//a[normalize-space(text())='Specialty Care Patients' and @id='ctl09_rptrLevel1_hlLevel1Link_1']"));// childrens national hospital'Specialty Care Patients'
	
	//start with text
	driver.findElement(By.xpath("//p[starts-with (text(),'After receiving')]"));//children nationals 'After receiving 'paragraph
	driver.findElement(By.xpath("//p[starts-with(text(),'You can pay the hospital')]"));//children nationals 'You can pay the hospital
	driver.findElement(By.xpath("//p[starts-with (text(),'ur previous computer')]"));//children nationals 'ur previous computer
	driver.findElement(By.xpath("//p[starts-with (text(),'The purple statement is the physician bill')]"));//children nationals 'The purple statement is the physician bill'
	driver.findElement(By.xpath("//p[starts-with (text(),'The blue statement is the hospital bill')]"));//children nationals 'The blue statement is the hospital bill

	
	//start with attribute
	driver.findElement(By.xpath("//p[starts-with(@class,'footer2-donate-text')]"));//children nationals 'change a child life
	driver.findElement(By.xpath("TopNav_topNavLink_13 TopNav_sale_b6"));//overstock.com'Sales & Deals'
	driver.findElement(By.xpath("//a[starts-with(@class,'TopNav_topNavLink_13')]"));//overstock.com 'Ideas'
	driver.findElement(By.xpath("///a[starts-with(@class,'TopNav_topNavLink_13')]"));//overstock.com'Kids & Baby
	driver.findElement(By.xpath("////span[starts-with(@class,'store-display-name')]"));//bestbuy.com'Springfield' location
	*/
}
