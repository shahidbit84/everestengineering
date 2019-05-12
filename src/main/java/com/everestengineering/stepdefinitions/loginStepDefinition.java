package com.everestengineering.stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.everestengineering.pageobjects.HomePage;
import com.everestengineering.testbase.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class loginStepDefinition extends TestBase {

	ArrayList<String> al = new ArrayList<String>();
	ArrayList<String> al2 = new ArrayList<String>();

	@Given("^I am on the Login page url \"([^\"]*)\"$")
	public void i_am_on_the_Login_page_url(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Then("^I should see the landing page$")
	public void i_should_see_the_landing_page() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.checkSearchIsDisplayed();

	}

	@Given("^I want to enter my delivery location as \"([^\"]*)\"$")
	public void i_want_to_enter_my_delivery_location_as(String arg1) throws Throwable {
		WebElement search = driver.findElement(By.xpath("//input[@id='location']"));
		search.sendKeys(arg1);
		WebElement findFood = driver.findElement(By.ByCssSelector.className("_3iFC5"));
		findFood.click();
		Thread.sleep(5000);
	}

	@Then("^I should click on the search result whose text is \"([^\"]*)\"$")
	public void i_should_click_on_the_search_result_whose_text_is(String arg1) throws Throwable {
		WebElement searchresult = driver.findElement(By.xpath("//span[contains(text(),'" + arg1 + "')]"));
		Thread.sleep(2000);
		searchresult.click();
	}

	@Then("^I should go to the restuarants page and verify the user navigated to \"([^\"]*)\"$")
	public void i_should_go_to_the_restuarants_page_and_verify_the_user_navigated_to(String arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe(arg1));
		String currenturl = driver.getCurrentUrl();
		assertEquals(currenturl, arg1);

	}

	@Then("^click on the Search$")
	public void click_on_the_Search() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		Thread.sleep(5000);
	}

	@Then("^Search for Restaurant called \"([^\"]*)\" and Click on it$")
	public void search_for_Restaurant_called_and_Click_on_it(String arg1) throws Throwable {
		WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search for restaurants or dishes']"));
		Thread.sleep(3000);
		searchBar.clear();
		searchBar.sendKeys(arg1);
		searchBar.sendKeys(Keys.RETURN);
		Thread.sleep(3000);

		List<WebElement> restaurants = driver.findElements(By.xpath("//div[contains(text(),'" + arg1 + "')]"));
		if (restaurants.size() > 0) {
			restaurants.get(0).click();
			Thread.sleep(3000);
		}

	}

	@Then("^Add a item to the cart \"([^\"]*)\" and quantity is \"([^\"]*)\"$")
	public void add_a_item_to_the_cart_and_quantity_is(String arg1, int arg2) throws Throwable {
		int addBtnIndex = 0;

		List<WebElement> noOfMenuItems = driver.findElements(By.xpath("//div[@class='jTy8b']"));
		for (addBtnIndex = 0; addBtnIndex < noOfMenuItems.size(); addBtnIndex++) {
			List<WebElement> names = driver.findElements(By.xpath("//div[@class='jTy8b']"));

			if (names.get(addBtnIndex).getText().equalsIgnoreCase(arg1)) {
				System.out.println("index of add is " + addBtnIndex);
				List<WebElement> addButtons = driver.findElements(By
						.xpath("//div[@class='jTy8b']/ancestor::div[@class='GaqmA']/div/div/div[1][@class='_1RPOp']"));

				addButtons.get(addBtnIndex).click();
				Thread.sleep(8000);

				if (arg2 > 1) {
					List<WebElement> plusButtonList = driver.findElements(By
							.xpath("//div[@class='jTy8b']/ancestor::div[@class='GaqmA']//div[@class='_1ds9T _2Thnf']"));
					for (int clicks = 0; clicks < arg2 - 1; clicks++) {
						Thread.sleep(1000);
						plusButtonList.get(addBtnIndex).click();
						System.out.println("Clicked on the add button");
					}
				}
				Thread.sleep(5000);
				break;
			}

		}

	}

	@Then("^I like to add \"([^\"]*)\" with quantity is \"([^\"]*)\"$")
	public void i_like_to_add_with_quantity_is(String arg1, int arg2) throws Throwable {
		int addBtnIndex = 0;
		int addButtonRemainingList;

		List<WebElement> noOfMenuItems = driver.findElements(By.xpath("//div[@class='jTy8b']"));
		for (addBtnIndex = 0; addBtnIndex < noOfMenuItems.size(); addBtnIndex++) {
			List<WebElement> names = driver.findElements(By.xpath("//div[@class='jTy8b']"));
			System.out.println(names.get(addBtnIndex).getText());

			if (names.get(addBtnIndex).getText().equals(arg1)) {
				System.out.println("index of Tiramisu is " + addBtnIndex);

				List<WebElement> addButtons = driver.findElements(By
						.xpath("//div[@class='jTy8b']/ancestor::div[@class='GaqmA']/div/div/div[1][@class='_1RPOp']"));
				addButtonRemainingList = noOfMenuItems.size() - addButtons.size();
				addButtons.get(addBtnIndex - 1).click();
				Thread.sleep(5000);

				if (arg2 > 1) {
					List<WebElement> plusButtonList = driver.findElements(By
							.xpath("//div[@class='jTy8b']/ancestor::div[@class='GaqmA']//div[@class='_1ds9T _2Thnf']"));

					for (int clicks = 0; clicks < arg2 - 1; clicks++) {
						Thread.sleep(1000);
						plusButtonList.get(addBtnIndex - 1).click();
						System.out.println("Clicked on the add button for tiramisu");
					}
				}
				Thread.sleep(5000);
				break;

			}

		}
	}

	@Then("^I  add \"([^\"]*)\" with quantity is \"([^\"]*)\"$")
	public void i_add_with_quantity_is(String arg1, int arg2) throws Throwable {
		int addBtnIndex = 0;
		int addButtonRemainingList;

		List<WebElement> noOfMenuItems = driver.findElements(By.xpath("//div[@class='jTy8b']"));
		for (addBtnIndex = 0; addBtnIndex < noOfMenuItems.size(); addBtnIndex++) {
			List<WebElement> names = driver.findElements(By.xpath("//div[@class='jTy8b']"));

			System.out.println(names.get(addBtnIndex).getText());
			if (names.get(addBtnIndex).getText().equals(arg1)) {

				System.out.println("index of Tiramisu is " + addBtnIndex);
				List<WebElement> addButtons = driver.findElements(By
						.xpath("//div[@class='jTy8b']/ancestor::div[@class='GaqmA']/div/div/div[1][@class='_1RPOp']"));

				addButtonRemainingList = noOfMenuItems.size() - addButtons.size();
				addButtons.get(addBtnIndex - 1).click();

				Thread.sleep(5000);
				if (arg2 > 1) {

					List<WebElement> plusButtonList = driver.findElements(By
							.xpath("//div[@class='jTy8b']/ancestor::div[@class='GaqmA']//div[@class='_1ds9T _2Thnf']"));

					for (int clicks = 0; clicks < arg2 - 1; clicks++) {
						Thread.sleep(1000);
						plusButtonList.get(addBtnIndex - 1).click();
						System.out.println("Clicked on the add button for tiramisu");
					}
				}
				Thread.sleep(5000);
				break;

			}

		}
	}

	@Then("^include a item to the cart \"([^\"]*)\" having quantity as \"([^\"]*)\"$")
	public void include_a_item_to_the_cart_having_quantity_as(String arg1, int arg2) throws Throwable {
		int addBtnIndex = 0;
		int addButtonRemainingList;

		List<WebElement> noOfMenuItems = driver.findElements(By.xpath("//div[@class='jTy8b']"));
		for (addBtnIndex = 0; addBtnIndex < noOfMenuItems.size(); addBtnIndex++) {
			List<WebElement> names = driver.findElements(By.xpath("//div[@class='jTy8b']"));

			System.out.println(names.get(addBtnIndex).getText());
			if (names.get(addBtnIndex).getText().equals(arg1)) {

				System.out.println("index of Tiramisu is " + addBtnIndex);
				List<WebElement> addButtons = driver.findElements(By
						.xpath("//div[@class='jTy8b']/ancestor::div[@class='GaqmA']/div/div/div[1][@class='_1RPOp']"));

				addButtonRemainingList = noOfMenuItems.size() - addButtons.size();
				addButtons.get(addBtnIndex - 1).click();

				Thread.sleep(5000);
				if (arg2 > 1) {

					List<WebElement> plusButtonList = driver.findElements(By
							.xpath("//div[@class='jTy8b']/ancestor::div[@class='GaqmA']//div[@class='_1ds9T _2Thnf']"));
					for (int clicks = 0; clicks < arg2 - 1; clicks++) {
						Thread.sleep(1000);
						plusButtonList.get(addBtnIndex - 1).click();
						System.out.println("Clicked on the add button for tiramisu");
					}
				}
				Thread.sleep(5000);
				break;

			}

		}
	}

	@Then("^click on the checkout$")
	public void click_on_the_checkout() throws Throwable {
		List<WebElement> addedItemsList = driver.findElements(By.xpath("//div[@class='_33KRy']"));
		for (int i = 0; i < addedItemsList.size(); i++) {
			al.add(addedItemsList.get(i).getText());
		}
		driver.findElement(By.xpath("//div[@class='_1gPB7']")).click();
		Thread.sleep(4000);
	}

	@Then("^Verify Items added in checkout page \"([^\"]*)\"$")
	public void verify_Items_added_in_checkout_page(String arg1) throws Throwable {

		boolean status = false;

		Thread.sleep(3000);
		if (driver.getCurrentUrl().equalsIgnoreCase(arg1)) {
			List<WebElement> addedItemsList = driver.findElements(By.xpath("//div[@class='_33KRy']"));

			for (int i = 0; i < addedItemsList.size(); i++) {
				al2.add(addedItemsList.get(i).getText());
			}
			if (al.equals(al2)) {
				status = true;
			}
			assertEquals(true, status);
		}

	}

	@Then("^Click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'New to Swiggy?')]")).click();
	}

	@Then("^Add details Name As \"([^\"]*)\"$")
	public void add_details_Name_As(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(arg1);
	}

	@Then("^Phone no as \"([^\"]*)\"$")
	public void phone_no_as(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(arg1);
	}

	@Then("^Email as \"([^\"]*)\"$")
	public void email_as(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(arg1);
	}

	@Then("^Click \"([^\"]*)\"$")
	public void click(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_3GOZo' and text()='" + arg1 + "']")).click();
	}

	@Then("^Enter password as \"([^\"]*)\"$")
	public void enter_password_as(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg1);
	}

	@Then("^Click on CONTINUE$")
	public void click_on_CONTINUE() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.linkText("CONTINUE")).click();

	}

	@Then("^verify Error message at Email field \"([^\"]*)\"$")
	public void verify_Error_message_at_Email_field(String arg1) throws Throwable {
		Thread.sleep(3000);
		String actualText = driver.findElement(By.xpath("//label[contains(@class,'_1Cvlf _2tL9P A7Y41')]")).getText();
		Assert.assertEquals(actualText, arg1);

	}

	@Then("^change the \"([^\"]*)\" to \"([^\"]*)\"$")
	public void change_the_to(String arg1, int arg2) throws Throwable {
		WebElement minus = driver.findElement(By.xpath(
				"//div[@class='_33KRy' and text()='" + arg1 + "']/../following-sibling::div//div[@class='_29Y5Z']"));
		String currentquantityOfRedVelvet = driver.findElement(By.xpath(
				"//div[@class='_33KRy' and text()='Red Velvet Cupcake']/../following-sibling::div//div[@class='_2zAXs']"))
				.getText();
		int value = Integer.parseInt(currentquantityOfRedVelvet);
		for (int i = 0; i > value; i++) {
			minus.click();
		}
		Thread.sleep(5000);

	}
}
