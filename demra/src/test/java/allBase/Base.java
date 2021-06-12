package allBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	static WebDriver dr;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		dr = new ChromeDriver();
		dr.get("https://github.com/bonigarcia/webdrivermanager");
	}

}
