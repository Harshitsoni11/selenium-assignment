import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
      
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshit\\seleniumproject\\practice\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

       driver.get("http://demo.guru99.com/test/newtours/register.php");
 
        // Fill the registration form
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Harshit");
 
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Soni");
 
        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("1234567890");
 
        WebElement email = driver.findElement(By.id("userName"));
        email.sendKeys("soniharshit@gmail.com");
 
        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("123 Main St");
 
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("panipat");
 
        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("haryana");
 
        WebElement postalCode = driver.findElement(By.name("postalCode"));
        postalCode.sendKeys("12345");
 
        WebElement country = driver.findElement(By.name("country"));
        country.sendKeys("india");
 
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("harshit");
 
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password123");
 
        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        confirmPassword.sendKeys("password123");
 
        // Submit the form
        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();
    }
}
