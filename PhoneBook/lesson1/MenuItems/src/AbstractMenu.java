import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMenu implements Menu {
    //TODO: Тут вы должны реализовать список элементов меню
    protected String MENU_HEADER = "Please input required menu item:";

    public AbstractMenu() {
        this.items = new ArrayList<>();
    }

    private void printMenuHeader() {
        System.out.println(MENU_HEADER);
    }

    @Override
    public void printMenu() {
        //TODO: Тут необходимо реализовать вызов методов элементов меню
    }
}
