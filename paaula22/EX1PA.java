package paaula22;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Gabriel Alves de Freitas
public class EX1PA {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("arquivocoisas.txt");
            out = new FileOutputStream("arquivosemcaps.txt");
            int c;

            while ((c = in.read()) != -1) {
                char caps = Character.toUpperCase((char)c);
            	out.write(caps);
            }

        } finally {
            if (in != null) {
                in.close();------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            }
            if (out != null) {
                out.close();
            } 
        }
    }
}