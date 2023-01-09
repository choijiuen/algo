import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class bj2738 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int h[][] = new int [n][m];
        int g[][] = new int [n][m];
        int a[][] = new int [n][m];

        for(int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                h[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                g[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] += h[i][j]+g[i][j];
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
