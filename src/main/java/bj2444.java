import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String b =" ";
        String s ="*";

        int x =1;
        for(int i=1; i<=2*N; i++,x++){
            for(int j=N-x; j>0; j--){
                System.out.print(b);
            }
            for(int j=1; j<=i; j++){
                System.out.print(s);
            }
            i++;
            System.out.println();
        }

        int y =1;
        for(int i=1; i<N*2; i++,y++){
            for(int j=1; j<=y; j++){
                System.out.print(b);
            }
            for(int j=N*2-2; j>i; j--){
                System.out.print(s);
            }
            i++;
            System.out.println();
        }


    }
}
