import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj9012 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int cnt1 =0;
        int cnt2 =0;
        int ck =0;

        for(int i=0; i<T; i++){
            String s = br.readLine();
            for(int j=0; j<s.length(); j++){
                if(s.substring(j,j+1).equals("(")){
                    cnt1 += 1;
                }else if(s.substring(j,j+1).equals(")")){
                    cnt2 += 1;
                }
                if(cnt2>cnt1){
                    ck +=1;
                }
            }

            if(cnt1 == cnt2 && ck == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            cnt1 =0;
            cnt2 =0;
            ck=0;

        }
    }
}
