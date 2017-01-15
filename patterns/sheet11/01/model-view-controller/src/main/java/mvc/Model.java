package mvc;
import java.util.ArrayList;

public class Model {
    private String state;
    public ArrayList<ConsoleView> viewlist = new ArrayList<ConsoleView>();

    public void connect(ConsoleView observer){
        viewlist.add(observer);
        System.out.println("Number of subscribed Views: "+ viewlist.size());
    }

    public void disconnect(ConsoleView observer){
        viewlist.remove(observer);
    }
    
    public void saveData(String newstate){
        state = newstate;
        this.notifyViews();
    }

    public void notifyViews(){
        for(ConsoleView view : viewlist){
            view.checkForUpdate(this);
        }
    }

    public String getData(){
        return state;
    }
}
