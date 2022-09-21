package endtoendtestcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pettycash {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/class_room.php\r\n");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.id("email")).sendKeys("abhi@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345");
        Thread.sleep(4000);
        driver.findElement(By.id("btnSubmit")).click();
        driver.findElement(By.xpath("//span[text()='Petty Cash']")).click();
        driver.findElement(By.xpath("//a[@onclick='showModal()']")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("textDesc_1")).sendKeys("books");
        driver.findElement(By.id("textAmount_1")).sendKeys("1000");
        driver.findElement(By.id("btnSubmit")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//option[@value='100']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Sign out']")).click();
        driver.close();

	}

}
