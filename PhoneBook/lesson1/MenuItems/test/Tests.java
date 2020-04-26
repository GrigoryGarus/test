import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Rule
  public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

  @Test
  public void testSolution() {
    try {
      Class.forName("MenuItem");
    } catch (ClassNotFoundException e) {
      Assert.fail("Class MenuItem not exists");
    }

    try {
      Class.forName("MenuItemExecutor");
    } catch (ClassNotFoundException e) {
      Assert.fail("Class MenuItemExecutor not exists");
    }

    Menu mainMenu = new MainMenu();
    mainMenu.printMenu();

    String validResult = systemOutRule.getLog();

    assertEquals("Invalid input data\n" +
            "Please input required menu item:\n" +
            "1 - Create\n" +
            "2 - Search\n" +
            "3 - Delete", validResult);
  }
}
