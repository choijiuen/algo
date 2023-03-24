import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj21317 {
    static int N;
    static int [][] dp;
    static int [][] jump;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        jump = new int[N-1][2];
        dp = new int[N][2];

        for(int i=0; i<N-1; i++){
            st = new StringTokenizer(br.readLine());
            jump[i][0] = Integer.parseInt(st.nextToken());
            jump[i][1] = Integer.parseInt(st.nextToken());
        }
        int k = Integer.parseInt(br.readLine());

        dfs(0,0,0);

    }

    static void dfs(int stone, int energy, int giantJump) {
        if(stone >= N){
            return;
        }

        if(dp[stone][giantJump] == 0)
    }
}
