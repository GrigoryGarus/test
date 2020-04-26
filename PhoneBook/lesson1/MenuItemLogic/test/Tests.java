import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class Tests {
  @Rule
  public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();
  @Rule
  public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

  @Test
  public void testSolution() {
   checkExistClasses();
   checkValidCreation();
  }

  private void checkExistClasses() {
    try {
      Class.forName("Contact");
    } catch (ClassNotFoundException e) {
      Assert.fail("Class Contact not exists");
    }

    try {
      Class.forName("MenuItemExecutor");
    } catch (ClassNotFoundException e) {
      Assert.fail("Class MenuItemExecutor not exists");
    }
  }

  private void checkValidCreation() {
    Menu mainMenu = new MainMenu();

    systemInMock.provideLines("1\nИванов Иван Иванович; 18.06.1983; 34; 6.45; \"Работал над проектами: \"\"АБС\"\"; \"\"КВД\"\"\"");
    mainMenu.interactWithMenu();

    String[] results = systemOutRule.getLog().split("\n");
    Assert.assertEquals("Contact{fullName='20=>2 \u001820= \u001820=>28G', dob=Sat Jun 18 00:00:00 MSD 1983, countOfProjects=34, rating=6.45, comments='\" 01>B0 =04 ?@>5:B0<8: \"\"\u0010\u0011!\"\" \"\"\u001A\u0012\u0014\"\"\"'}", results[3]);
  }
}
