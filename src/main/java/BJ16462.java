import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ16462 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String score;
        double total=0;

        for(int i=0; i<N; i++){
            score = br.readLine();

            if(score.length() == 2 || score.length() == 1){
               score= score.replaceAll("0","9");
               score= score.replaceAll("6","9");
            }
//            System.out.println(score);
            total += Integer.parseInt(score);
        }

        System.out.println(Math.round(total/N));

    }
}
