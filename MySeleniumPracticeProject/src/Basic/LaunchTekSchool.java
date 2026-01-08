package Basic;
public class LaunchTekSchool {
	WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");

	}

}
