package decorator;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
    
public class LowerCaseInputStream extends FilterInputStream {
        public LowerCaseInputStream(FileInputStream in) {
            super(in);
        }
        
        @Override
        public int read() throws IOException {
          int content;
          content = in.read(); //this is the FileInputStream in.read() which was set by super(in)
          if (Character.isUpperCase((char) content)){
            content = (content + 32);  
          }
          return content;
        }
      /* 
        public int read(byte[] b) throws IOException {
       
        }

        public int read(byte[] b, int off, int len) throws IOException {
        
        }
        */
}
