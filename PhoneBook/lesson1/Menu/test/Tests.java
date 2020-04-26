import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class Tests {
  @Rule
  public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();
  @Rule
  public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

  @Test
  public void testSolution() {
    Menu mainMenu = new MainMenu();

    systemInMock.provideLines("5");
    mainMenu.interactWithMenu();
    String validResult = systemOutRule.getLog();

    assertEquals("Your input 5\n", validResult);
    systemOutRule.clearLog();

    systemInMock.provideLines("5aaa");
    mainMenu.interactWithMenu();
    String invalidResult = systemOutRule.getLog();

    assertEquals("Invalid input data\n" +
            "Please input required menu item:\n" +
            "1 - Create\n" +
            "2 - Search\n" +
            "3 - Delete\n", invalidResult);
  }


}
