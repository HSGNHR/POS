package decorator;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Start {

    public static void main(String args[]){
        LowerCaseInputStream is = null;
        try {
            is = new LowerCaseInputStream(new FileInputStream("test.txt"));
            int content;
			while ((content = is.read()) != -1) {
				System.out.print((char) content);
            }
        }
        catch (FileNotFoundException e){
            System.err.println(e);
        }
        catch (IOException e){
            System.err.println(e);
        }
    }
}
