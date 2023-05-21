import org.example.CheckBox;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckBoxTest extends BaseTest {
    CheckBox objCheckBox= new CheckBox(getDriver());
    @Before
    public void openPage (){
        openUrl (URL.urlCheckBox);
    }


    @Test
    public void buttonTest(){objCheckBox.buttonTest();}

    @Test
    public void homeCheckTest(){objCheckBox.homeCheckTest();}

    @Test
    public void desktopCheckTest(){objCheckBox.desktopCheckBoxTest();}

    @Test
    public void documentsCheckTest(){objCheckBox.documentsCheckBoxTest();}

    @Test
    public void downloadsCheckTest(){objCheckBox.downloadsCheckBoxTest();}

    @Test
    public void notesCheckTest(){objCheckBox.notesCheckBoxTest();}

    @Test
    public void commandCheckTest(){objCheckBox.commandsCheckBoxTest();}

    @Test
    public void workSpaceCheckBoxTest(){objCheckBox.workSpaceCheckBoxTest();}

    @Test
    public void reactCheckBoxTest(){objCheckBox.reactCheckBoxTest();}

    @Test
    public void veuCheckBoxTest(){objCheckBox.veyCheckBoxTest();}

    @Test
    public void angularCheckBoxTest(){objCheckBox.angularCheckBoxTest();}

    @Test
    public void officeCheckBoxTest(){objCheckBox.officeCheckBoxTest();}

    @Test
    public void privateCheckBoxTest(){objCheckBox.privateCheckBoxTest();}

    @Test
    public void publicCheckBoxTest(){objCheckBox.publicCheckBoxTest();}

    @Test
    public void generalCheckBoxTest(){objCheckBox.generalCheckBoxTest();}

    @Test
    public void wordFileCheckBoxTest(){objCheckBox.wordFileCheckBoxTest();}

    @Test
    public void excelFileCheckBoxTest(){objCheckBox.excelFileCheckBoxTest();}

    @After
    public void driverQuit(){
        baseAfter (getDriver());
    }
}
