package endtoendtestcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classroom {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/class_room.php\r\n");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("email")).sendKeys("abhi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(4000);
		driver.findElement(By.id("btnSubmit")).click();
		driver.findElement(By.xpath("//a[@href='class_room.php']")).click();
		driver.findElement(By.id("name")).sendKeys("GC25");
		driver.findElement(By.id("student_count")).sendKeys("40");
		Thread.sleep(4000);
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[text()='Edit'])[7]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("student_count1")).clear();
		driver.findElement(By.id("student_count1")).sendKeys("50");
		driver.findElement(By.id("btnSubmit1")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("btnYes")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		driver.close();
	}

}
