package iter;
public class Start{
    public static void main(String args[]) {
        System.out.println("Iterator Pattern\n");
        DinerMenu dinermenu = new DinerMenu();
        PancakeHouseMenu pancakemenu = new PancakeHouseMenu();
        Waitress testwaitress = new Waitress(pancakemenu,dinermenu);
        testwaitress.printMenu();
    }
}

