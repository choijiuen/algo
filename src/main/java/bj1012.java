import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj1012 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int T,M,N,K,group_cnt ;
    static int[][] dir = {{1,0}, {0,1}, {-1,0}, {0,-1}};
    static ArrayList<Integer> group;
    static boolean[][] visit;
    static int [][] bc ;
    static int a,b;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            bc = new int[M][N];
            visit = new boolean[M][N];

            for(int j=0; j<K; j++) {
                st = new StringTokenizer(br.readLine());

                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

//                    System.out.println(N+" "+M);
                bc[a][b] = 1;

            }
            pro();
        }

    }

    static void pro(){ //group of baechu
        group = new ArrayList<>();
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(!visit[i][j] && bc[i][j] == 1){  //not visited yet and new baechu
                    group_cnt = 0; //how many baechu //find all of the new baechu in the new group --> using BFS or DFS
                    dfs(i,j);
                    group.add(group_cnt);
                }
            }
        }


            System.out.println(group.size());

    }

    static void dfs(int x, int y) {
        group_cnt++;
        visit[x][y] = true;

        //find all of the new baechu in the new group
        for(int k=0; k<4; k++){
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];
            if(nx <0 || ny <0 || ny>=N || nx >=M) continue;
            if(bc[nx][ny] !=1) continue;
            if(visit[nx][ny]) continue;
            dfs(nx, ny);

        }
    }


}
