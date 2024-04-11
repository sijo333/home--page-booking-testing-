package shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\selenium\\edge web driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://campus.sicsglobal.co.in/Project/tripplanner");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/nav/ul/li[2]/a")).click();
		driver.findElement(By.name("username")).sendKeys("sijo4545@gamil.com");
		driver.findElement(By.name("password")).sendKeys("sss1234@");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.name("destination")).click();
		WebElement ABC= driver.findElement(By.name("destination"));
		Select My =new Select(ABC);
		My.selectByVisibleText("Munnar");
		driver.findElement(By.name("src")).click();
		WebElement BCA=driver.findElement(By.name("src"));
		Select my=new Select(BCA);
		my.selectByVisibleText("Trivandrum");
		driver.findElement(By.name("transport")).click();
		WebElement CAD=driver.findElement(By.name("transport"));
		Select my1=new Select(CAD);
		my1.selectByVisibleText("By Car");
		driver.findElement(By.name("person")).click();
		driver.findElement(By.name("person")).sendKeys("5");

		
		
		
		

	}

}
