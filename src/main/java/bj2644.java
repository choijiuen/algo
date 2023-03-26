import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj2644 {
    static ArrayList<Integer> relation[];
    static boolean[] visit;
    static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        relation = new ArrayList[n+1];
        visit = new boolean[n+1];

        for(int i=1; i<=n; i++){
            relation[i] = new ArrayList<>();
        }

        for(int i=1; i<=m; i++){
            st = new StringTokenizer(br.readLine());
            int x= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());

            relation[x].add(y);
            relation[y].add(x);
        }

//        for(int i=1; i<=n; i++){
//            System.out.println(relation[i]);
//        }

        for(int i=1; i<=n; i++){
            visit[i] = false;
        }

        dfs(p1,p2, 0);

        System.out.println(result);

    }

    static void dfs(int p1, int p2, int c) {
        visit[p1] = true;

        for(int i : relation[p1]){
            if(visit[i]){
                continue;
            }
            if(i == p2){
                result = ++c;
                return;
            }
            dfs(i,p2,c+1);

        }

    }
}