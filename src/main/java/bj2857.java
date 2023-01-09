import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class bj2857 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int h =0;

        for(int i=0; i<5; i++){
            String s = br.readLine();
            int a ;

            if((a = s.indexOf("FBI")) != -1){
                System.out.print(i+1+" ");
                h = 1;

            }

        }
        if(h != 1){
            System.out.print("HE GOT AWAY!");
        }


    }
}
