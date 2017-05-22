package iter;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    
    public DinerMenu(){
       menuItems = new MenuItem[MAX_ITEMS];
       addItem("Vegetarian BLT", "Lettuce and Tomatoes on whole wheat.", true, 2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS){
            System.out.println("Sorry, menu is full! Can't add more items");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
