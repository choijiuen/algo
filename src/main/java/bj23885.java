import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj23885 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int arrive = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

        if(N ==1 && M ==1){
            System.out.println("YES");
        }else if(N >1 && M >1){
            if(start % 2 == arrive % 2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else if(((N == 1 && M >1) || (M ==1 && N>1)) && start != arrive){
            System.out.println("NO");
        }else if(((N == 1 && M >1) || (M ==1 && N>1)) && start == arrive){
            System.out.println("YES");
        }




    }
}
