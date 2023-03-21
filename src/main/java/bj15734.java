import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj15734 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
//        ArrayList<Integer> LR = new ArrayList<>();
        int LR = Integer.parseInt(st.nextToken());

        if(L > R){
            while(LR > 0){
                R += 1;
                LR -=1;
                if(L == R){
                    break;
                }
            }
            if(LR == 0){
                System.out.println(R*2);
            }else{
                System.out.println(R+L + (LR/2)*2);
            }
        }else if(L < R){
            while(LR > 0){
                L += 1;
                LR -=1;
                if(L == R){
                    break;
                }
            }

            if(LR == 0){
                System.out.println(L*2);
            }else{
                System.out.println(R+L + (LR/2)*2);
            }
        }else{
            System.out.println(R+L + (LR/2)*2);
        }


    }
}
