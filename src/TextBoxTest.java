import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxTest {
	
	//TC01
	public void submitSuccessfully() {
		//Mở trình duyệt
		System.setProperty("webdriver.chrome.driver", "D:\\01Automation\\01Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Gõ URL
		driver.get("https://demoqa.com/");
		//Click vào element
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		
		//h5[text()='Elements'] = Xpath
		//Click vào menu Text Box
		//Nhập dữ liệu vào các trường
		//Click submit
		//All values are displayed in text
	}

}
