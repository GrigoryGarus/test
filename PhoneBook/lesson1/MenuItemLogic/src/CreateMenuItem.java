import java.util.Scanner;

//TODO: Данный класс должен отвечать за обработку ввходных данных в формате -
//Иванов Иван Иванович; 18.06.1983; 34; 6.45; \"Работал над проектами: \"\"АБС\"\"; \"\"КВД\"\"\"
//и создание объекта Contact
public class CreateMenuItem  implements MenuItemExecutor{


    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String data = scanner.nextLine();
        }
    }


    @Override
    public void execute() {

    }
}