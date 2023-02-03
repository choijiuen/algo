import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String s = br.readLine();
            int score=0;
            int result =0;
            for(int j=0; j<s.length(); j++){
                if(s.substring(j,j+1).equals("O")){
                    score +=1;
                    result +=score;
                }else{
                    score = 0;
                }

            }

            System.out.println(result);

        }
    }
}
