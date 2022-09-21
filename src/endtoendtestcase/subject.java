package endtoendtestcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class subject {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/class_room.php\r\n");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.id("email")).sendKeys("abhi@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345");
        Thread.sleep(4000);
        driver.findElement(By.id("btnSubmit")).click();
        driver.findElement(By.xpath("//span[text()='Subject']")).click();
        driver.findElement(By.id("name")).sendKeys("autocad");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        Thread.sleep(4000);
        WebElement dropdown= driver.findElement(By.name("example1_length"));
		Select s = new Select(dropdown);
		s.selectByIndex(3);
        driver.findElement(By.xpath("//a[text()='Delete']")).click();
        driver.findElement(By.id("btnYes")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Sign out']")).click();
        driver.close();

	}

}
