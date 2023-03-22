import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj1260 {
    static ArrayList<Integer>[] adj;   //ArrayList에 배열
    static boolean[] visit;
    static int N,M,V;
    static String d ="";
    static String b ="";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N + 1];
        visit = new boolean[N + 1];

        for(int i=1; i<=N; i++){// 모든 정점마다 ArrayList 가 필요 -> 초기화
            adj[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x].add(y);
            adj[y].add(x);
        }
        for(int i=1; i<=N; i++){
            Collections.sort(adj[i]);
        }

        dfs(V);
        System.out.println(d);

        for(int i=1; i<=N; i++){
            visit[i] = false;
        }

        bfs(V);
        System.out.println(b);
    }
    static void dfs(int x) {
        visit[x] = true;
        d += x+" ";

        for(int y : adj[x]){
            if(visit[y]){   //방문했으면 체크 안하고 다음거 체크
                continue;
            }
            //y에서 갈 수 있는 곳도 탐색
            dfs(y);
        }
    }

    static void bfs(int start) {    //start에서 시작해서 갈 수 있는 정점들을 모두 탐색하기
        Queue<Integer> que = new LinkedList<>();

        //start는 방문 가능한 점이므로, que에 넣어준다.
        que.add(start);
        visit[start] = true;    //start visit 표시하기 중요

        while(!que.isEmpty()){  //확인할 정점 없을 때 까지
            int x = que.poll();

            b +=x+" ";
            for(int y : adj[x]){
                if(visit[y]){
                    continue;
                }
                //탐색 안한 정점 que에 추가하고 visit
                que.add(y);
                visit[y] = true;
            }
        }
    }


}