package pset6;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Generates the test suite for min.html
 * 
 * @author Cagdas Yelen
 * @see MinWebTestSuite
 */

public class MinAndMaxWebTestGenerator {
	public static void main(String[] a) {
		String suite = new MinAndMaxWebTestGenerator().createTestSuite();
		System.out.println(suite);
	}

	String createTestSuite() {
		StringBuilder sb = new StringBuilder();
		sb.append(packageDecl());
		sb.append("\n");
		sb.append(imports());
		sb.append("\n");
		sb.append(testsuite());
		return sb.toString();
	}

	String packageDecl() {
		return "package pset6;\n";
	}

	String imports() {
		return "import static org.junit.Assert.*;\n\n" + "import org.junit.Test;\n\n"
				+ "import org.openqa.selenium.By;\n" + "import org.openqa.selenium.WebDriver;\n"
				+ "import org.openqa.selenium.WebElement;\n" + "import org.openqa.selenium.firefox.FirefoxDriver;\n"
				+ "import org.junit.AfterClass;\n" + "import org.junit.BeforeClass;\n";
	}

	String testsuite() {
		StringBuilder sb = new StringBuilder();
		sb.append("public class MinAndMaxWebTestSuite {\n");
		sb.append("\tprivate static WebDriver wd;\n\n\t");
		sb.append("@BeforeClass\n\t");
		sb.append("public static void startBrowser() {\n\t\t");
		sb.append("wd = new FirefoxDriver();\n\t");
		sb.append("}\n\n");

		// your code goes here
		// ...

		String[] inputSpace = getInputs();
		String[] clickEvent = getSubmitButton();
		String[] events = getEvent();

		int testNum = 0;
		for (int e = 0; e < events.length; e++) {
			for (int x = 0; x < inputSpace.length; x++) {
				for (int y = 0; y < inputSpace.length; y++) {
					for (int z = 0; z < inputSpace.length; z++) {
						for (int i = 0; i < clickEvent.length; i++) {
							sb.append(appendTest(events[e], inputSpace[x], inputSpace[y], inputSpace[z], clickEvent[i],
									testNum));
							testNum++;
						}
					}
				}
			}
		}
		sb.append("\t@AfterClass\n\t");
		sb.append("public static void quitBrowser() {\n\t\t");
		sb.append("wd.quit();\n\t");
		sb.append("}\n\n");

		sb.append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	// implement any helper methods that you need in this class

	public String[] getInputs() {
		String[] s = new String[4];
		s[0] = "-1";
		s[1] = "0";
		s[2] = "1";
		s[3] = "four";
		return s;
	}

	public String[] getSubmitButton() {
		String[] s = new String[2];
		s[0] = "click";
		s[1] = "notclick";
		return s;
	}

	public String[] getEvent() {
		String[] s = new String[2];
		s[0] = "min";
		s[1] = "max";

		return s;
	}

	public String appendTest(String event, String x, String y, String z, String clickEvent, int testNum) {
		StringBuilder s = new StringBuilder();
		s.append("\t@Test\n\t");
		s.append("public void t" + testNum + "(){\n\t\t");

		s.append(
				"wd.get(\"file:///Users/cagdasyelen/Documents/workspace/EE382V_SOFTWARE_TESTING/src/pset6/minandmax.html\");\n\t\t");
		s.append("WebElement we = wd.findElement(By.id(\"x\"));\n\t\t");
		s.append("we.sendKeys(\"" + x + "\");\n\t\t");
		s.append("we = wd.findElement(By.id(\"y\"));\n\t\t");
		s.append("we.sendKeys(\"" + y + "\");\n\t\t");
		s.append("we = wd.findElement(By.id(\"z\"));\n\t\t");
		s.append("we.sendKeys(\"" + z + "\");\n\t\t");

		s.append("we = wd.findElement(By.id(\"" + event + "\"));\n\t\t");
		s.append("we.click();\n\t\t");

		s.append("we = wd.findElement(By.id(\"computeButton\"));\n\t\t");

		if (clickEvent.equals("click")) {
			s.append("we.click();\n\t\t");

			s.append("WebElement result = wd.findElement(By.id(\"result\"));\n\t\t");
			s.append("String output = result.getText();\n\t\t");
			if (!(x.equals("four") || y.equals("four") || z.equals("four"))) {
				if (event.equals("min")) {
					s.append("assertEquals(\"" + event + "(" + x + ", " + y + ", " + z + ") = "
							+ Math.min(Math.min(Integer.parseInt(x), Integer.parseInt(y)), Integer.parseInt(z))
							+ "\", output);\n\t\t");
				} else {
					s.append("assertEquals(\"" + event + "(" + x + ", " + y + ", " + z + ") = "
							+ Math.max(Math.max(Integer.parseInt(x), Integer.parseInt(y)), Integer.parseInt(z))
							+ "\", output);\n\t\t");
				}
			} else {
				s.append("assertEquals(\"" + "Please enter integer values only!" + "\", output);\n\t\t");
			}
		} else {
			s.append("WebElement result = wd.findElement(By.id(\"result\"));\n\t\t");
			s.append("String output = result.getText();\n\t\t");
			s.append("assertEquals(\"\", output);\n\t\t");

		}

		s.append("}\n\n");
		return s.toString();
	}

}
