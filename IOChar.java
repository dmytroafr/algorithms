import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOChar {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
        char c;
        do{
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');

    }
}
