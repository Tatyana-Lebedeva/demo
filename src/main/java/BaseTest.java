import org.example.TextBox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
  private WebDriver driver= new ChromeDriver();
  //TextBox objTextBox= new TextBox(driver);
   public void baseAfter(WebDriver driver){
     driver.quit();
 }
 public WebDriver getDriver(){
       return driver;
 }
 public void openUrl(String Url){
       driver.get(Url);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        }


}
