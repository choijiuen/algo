import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class bj2667 {
    static int N;
    static int group_cnt;
    static int[][] map;
    static boolean[][] visit;
    static int[][] dir = {{1,0}, {0,1}, {-1,0}, {0,-1}}; //동, 북, 서, 남
    static ArrayList<Integer> group;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N][N];
        group = new ArrayList<>();


        for(int i=0; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(s.substring(j,j+1));
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visit[i][j] && map[i][j] == 1){ //방문하지 않고 집이 있을 때
                    group_cnt =0;
                    dfs(i,j);
                    group.add(group_cnt);
                }
            }
        }

        Collections.sort(group);
        System.out.println(group.size());
        for(int i : group){
            System.out.println(i);
        }
    }

    private static void dfs(int x, int y) {
        group_cnt++;
        visit[x][y] = true;
        for(int k=0; k<4; k++){
            int nx = x +dir[k][0];
            int ny = y +dir[k][1];
            if(nx <0 || ny<0 || nx>=N || ny>=N) continue;//지도 벗어날 때
            if(map[nx][ny] == 0) continue;  //집이 없을 때
            if(visit[nx][ny]) continue; //이미 방문 한 곳일 때
            dfs(nx, ny);
        }
    }


}
