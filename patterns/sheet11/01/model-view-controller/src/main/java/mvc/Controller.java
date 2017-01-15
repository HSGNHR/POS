package mvc;
import java.util.Scanner;
public class Controller {
    private Model privmodel;
    private ConsoleView privconsoleview;
    public Controller(Model model, ConsoleView consoleview){
        privmodel = model;
        privconsoleview = consoleview;
        privmodel.connect(consoleview);
    }
    
    public void start() {
        Scanner s = new Scanner(System.in);
        while(true){
            String current = s.nextLine();
            this.setState(current);
        }
    }

    public void setState(String state){
        privmodel.saveData(state);
    }
}
