package singleton;

public class Singleton {
    private static Singleton instance;
    
    private Singleton(){
        System.out.println("Created new Singleton Object\n");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void operation(){
        System.out.println("operation() called.\n");
    }
}
