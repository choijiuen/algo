import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2744 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();

        char c[] = st.toCharArray();

        for(int i=0; i<c.length; i++){
            int a = (int)c[i];
            if(a>=(int)'a'){
                c[i] = (char)(a-32);
            }
            else{
                c[i] = (char)(a+32);
            }

            System.out.print(c[i]);
        }


    }
}