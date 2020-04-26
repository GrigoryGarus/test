import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu extends AbstractMenu {

    public MainMenu() {
        super();
        initMenuItems();
    }

    private void initMenuItems() {
        this.items.add("Create");
        this.items.add("Search");
        this.items.add("Delete");
    }

    @Override
    public void interactWithMenu() {
TODO
    }
}
