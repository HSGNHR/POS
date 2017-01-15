package mvc;
public interface Observer {
    public void checkForUpdate(Model model);
    public void update(String state);
}
