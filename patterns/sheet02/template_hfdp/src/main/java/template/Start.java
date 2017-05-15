package template;
public class Start{
    public static void main(String args[]) {
        System.out.println("making coffee");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe(); 

        System.out.println("\nmaking tea");
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
