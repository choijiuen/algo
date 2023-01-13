import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class bj1337 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int []a = new int[N] ;
        int res = 5;

        for(int i=0; i<N; i++){
            a[i] = Integer.parseInt(br.readLine());

            if(a[i] -1 == a[i+1]){
                res = res -1;
            }
        }








    }
}
