package endtoendtestcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class grade {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/class_room.php\r\n");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.findElement(By.id("email")).sendKeys("abhi@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345");
        Thread.sleep(4000);
        driver.findElement(By.id("btnSubmit")).click();
        driver.findElement(By.xpath("//span[text()='Grade']")).click();
        driver.findElement(By.id("name")).sendKeys("grade 10");
        driver.findElement(By.id("admission_fee")).sendKeys("1000");
        driver.findElement(By.id("hall_charge")).sendKeys("25");
        Thread.sleep(4000);
        driver.findElement(By.id("btnSubmit")).click();
        driver.findElement(By.id("mark_range_text_1")).sendKeys("90-100");
        driver.findElement(By.id("mark_grade_text_1")).sendKeys("S");
        Thread.sleep(4000);
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
