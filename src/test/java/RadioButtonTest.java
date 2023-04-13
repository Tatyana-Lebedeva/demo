import org.example.RadioButton;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RadioButtonTest extends BaseTest{
            RadioButton objRadioButton = new RadioButton(getDriver());


        @Before
        public void openPage() {
            openUrl(URL.urlRadioButton);
        }
    @Test
    public void yesButtonRadio(){objRadioButton.yesButtonRadioTest();}

    @Test
    public void impressiveButtonRadio(){objRadioButton.impressiveButtonRadioTest();}

    @Test
    public void noButtonRadio(){objRadioButton.noButtonRadioTest();}

    @After
    public void driverQuit(){
        baseAfter (getDriver());
    }
    }
