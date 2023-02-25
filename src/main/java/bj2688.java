import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2688 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int n=0;
        int Dy[][] = new int[65][12];
        int A[] = new int[65];
        A[0] = 0;  //초기 값
        int res =0;

        for(int i=1; i<=10; i++){
            A[i] += A[i-1]+i;
        }

        for(int i=1; i<=10; i++){
            Dy[2][i] = i;
        }

        for(int i=1; i<=10; i++){
            Dy[3][i] = Dy[2][i]*Dy[2][11-i];
        }

        for (int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());

            for (int j = 1; j<=10; j++) {
                if(n>3){
                    for(int a = 4; a<=n; a++){
                        Dy[a][j] = Dy[a-2][j]*A[11-j];

                    }

                }
                res += Dy[n][j];
//                System.out.println(Dy[3][j]);
            }

            if(n==1){
                res = 10;
            }

            System.out.println(res);
//            System.out.println(A[9]);
            res =0;
        }
    }

}