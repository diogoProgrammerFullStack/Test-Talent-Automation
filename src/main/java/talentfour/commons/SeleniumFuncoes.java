package talentfour.commons;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
/**
 * 
 * @author diogo
 *
 */
public class SeleniumFuncoes extends BaseTest {

	private static WebDriverWait wait;
	private static File SrcFile;

	/**
	 * Espera o elemento estar visível na página
	 * 
	 * @param element
	 */
	public static void waitElementAppear(WebElement element) {
		wait = new WebDriverWait(webDriver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Scroll na tela
	 * @param rolagem
	 */
	public static void scroll(int rolagem) {
		JavascriptExecutor jse = (JavascriptExecutor) webDriver;
		jse.executeScript("window.scrollBy(0," + rolagem + ")", "");
	}
	
	/**
	 * Espera durante 10 segundos o elemento na página
	 */
	public static void implicityWait() {
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void takeSnapShot() {
		SrcFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
	}
	
	public static void generateEvidence(Scenario scenario) {
		String destFile;
		try {
			switch (scenario.getStatus().toUpperCase()) {
			case "PASSED":
				destFile = "./passed";
				break;
			case "FAILED":
				destFile = "./failed";
				break;
			default:
				destFile = "./error";
				break;
			}
			FileUtils.copyFile(SrcFile, new File(destFile + "/" + scenario.getName() + ".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
