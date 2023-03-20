import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj2511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a[] = new int[10];
        int b[] = new int[10];
        int scoreA = 0;
        int scoreB = 0;
        int count =0;

        String result[] = new String[10];

        st = new StringTokenizer(br.readLine());
        for(int j=0; j<10; j++){
             a[j]= Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int j=0; j<10; j++){
            b[j] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<10; i++){
            if(a[i]>b[i]){
                scoreA += 3;

                result[i] ="A";
            }else if(a[i] == b[i]){
                scoreA++;
                scoreB++;

                result[i] ="D";
                count++;
            }else if(a[i]<b[i]){
                scoreB += 3;

                result[i] ="B";
            }
        }

        for(int i=9; i>0; i--){
            if(scoreA > scoreB){
                System.out.println(scoreA+" "+scoreB);
                System.out.println("A");
                break;
            }else if(scoreA == scoreB){
                if(!(result[i].equals("D")) && result[i-1].equals("D")){
                    System.out.println(scoreA+" "+scoreB);
                    System.out.println(result[i]);
                    break;
                }
                else if(result[i].equals("D") && !(result[i-1].equals("D"))){
                    System.out.println(scoreA+" "+scoreB);
                    System.out.println(result[i-1]);
                    break;
                }else if(count == 10){
                    System.out.println(scoreA+" "+scoreB);
                    System.out.println("D");
                    break;
                }else if(count == 0){//비긴 적 없는데 동률 일 경우
                    System.out.println(scoreA+" "+scoreB);
                    System.out.println(result[i]);
                    break;
                }
            }else if(scoreA < scoreB){
                System.out.println(scoreA+" "+scoreB);
                System.out.println("B");
                break;
            }
        }

    }
}
