package pset6;

import static org.junit.Assert.*;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinWebTestSuite {
	@Test
	public void t0(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, -1, -1) = -1", output);
		wd.quit();
	}

	@Test
	public void t1(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t2(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, -1, 0) = -1", output);
		wd.quit();
	}

	@Test
	public void t3(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t4(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, -1, 1) = -1", output);
		wd.quit();
	}

	@Test
	public void t5(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t6(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t7(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t8(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 0, -1) = -1", output);
		wd.quit();
	}

	@Test
	public void t9(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t10(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 0, 0) = -1", output);
		wd.quit();
	}

	@Test
	public void t11(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t12(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 0, 1) = -1", output);
		wd.quit();
	}

	@Test
	public void t13(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t14(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t15(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t16(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 1, -1) = -1", output);
		wd.quit();
	}

	@Test
	public void t17(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t18(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 1, 0) = -1", output);
		wd.quit();
	}

	@Test
	public void t19(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t20(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 1, 1) = -1", output);
		wd.quit();
	}

	@Test
	public void t21(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t22(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t23(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t24(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t25(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t26(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t27(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t28(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t29(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t30(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t31(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t32(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -1, -1) = -1", output);
		wd.quit();
	}

	@Test
	public void t33(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t34(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -1, 0) = -1", output);
		wd.quit();
	}

	@Test
	public void t35(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t36(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -1, 1) = -1", output);
		wd.quit();
	}

	@Test
	public void t37(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t38(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t39(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t40(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, -1) = -1", output);
		wd.quit();
	}

	@Test
	public void t41(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t42(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, 0) = 0", output);
		wd.quit();
	}

	@Test
	public void t43(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t44(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, 1) = 0", output);
		wd.quit();
	}

	@Test
	public void t45(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t46(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t47(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t48(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 1, -1) = -1", output);
		wd.quit();
	}

	@Test
	public void t49(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t50(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 1, 0) = 0", output);
		wd.quit();
	}

	@Test
	public void t51(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t52(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 1, 1) = 0", output);
		wd.quit();
	}

	@Test
	public void t53(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t54(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t55(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t56(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t57(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t58(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t59(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t60(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t61(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t62(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t63(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t64(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, -1, -1) = -1", output);
		wd.quit();
	}

	@Test
	public void t65(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t66(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, -1, 0) = -1", output);
		wd.quit();
	}

	@Test
	public void t67(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t68(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, -1, 1) = -1", output);
		wd.quit();
	}

	@Test
	public void t69(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t70(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t71(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t72(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 0, -1) = -1", output);
		wd.quit();
	}

	@Test
	public void t73(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t74(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 0, 0) = 0", output);
		wd.quit();
	}

	@Test
	public void t75(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t76(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 0, 1) = 0", output);
		wd.quit();
	}

	@Test
	public void t77(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t78(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t79(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t80(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 1, -1) = -1", output);
		wd.quit();
	}

	@Test
	public void t81(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t82(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 1, 0) = 0", output);
		wd.quit();
	}

	@Test
	public void t83(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t84(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 1, 1) = 1", output);
		wd.quit();
	}

	@Test
	public void t85(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t86(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t87(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t88(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t89(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t90(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t91(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t92(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t93(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t94(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t95(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t96(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t97(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t98(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t99(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t100(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t101(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t102(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t103(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t104(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t105(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t106(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t107(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t108(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t109(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t110(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t111(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t112(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t113(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t114(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t115(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t116(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t117(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t118(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t119(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t120(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t121(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t122(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t123(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t124(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t125(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}

	@Test
	public void t126(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.quit();
	}

	@Test
	public void t127(){
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("four");
		we = wd.findElement(By.id("computeButton"));
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("", output);
		wd.quit();
	}


}
