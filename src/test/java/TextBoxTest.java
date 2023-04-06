import org.example.TextBox;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TextBoxTest extends BaseTest {
    TextBox objTextBox= new TextBox(getDriver());

    @Before

    public void openPage (){
        openUrl (URL.urlTextBox);
    }
    @Test

    public void fillFormAndSend(){
        objTextBox.fillForm("Tayz", "rer@mail.ru","MSC","VRN");
            }
    @After

    public void driverQuit(){
        baseAfter (getDriver());
    }

}
