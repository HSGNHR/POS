package mvc;
public class ConsoleView implements Observer {
    private int privid;
    private String state;
    public ConsoleView(int id){
        privid = id;
    }
    
    public void checkForUpdate(Model model) {
       state = model.getData(); 
       this.update(state);
    }
    public void update(String state) {
        System.out.println("View with ID: "+ privid + " Update received. New value: "+ state);
    }
}
