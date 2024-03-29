import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj1926 {
    public static int N;
    public static int M;
    public static int size;	// 1의 사이즈를 잰다
    public static int max;	// 1의 최고 사이즈
    public static int cnt;	// 1의 구역 갯수

    public static int map[][];
    public static boolean visited[][];
    public static Queue<Point> q = new LinkedList<Point>();

    public static final int dx[] = {1,-1,0,0};	// 동 서 남 북 순으로 탐색
    public static final int dy[] = {0,0,-1,1};	// 동 서 남 북 순으로 탐색

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                map[i][j] =Integer.parseInt(st.nextToken());

            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {	//map을 한 번씩 탐색하는 for문
                if(map[i][j] ==1 && !visited[i][j]) {
                    size=0;
                    q.offer(new Point(i,j));
                    bfs(i,j);
                    cnt++;
                }
            }
        }
        if(cnt ==0) {
            System.out.println(0);
            System.out.print(0);
        }else {
            System.out.println(cnt);
            System.out.print(max);
        }

    }

    public static void bfs(int x, int y) {
        int nx  ;
        int ny  ;
        q.offer(new Point(x,y));	//
        visited[x][y] = true;

        size++;
        while(!q.isEmpty()) {	//큐가 빌 때까지
            Point temp =q.poll();	//q에 넣었던 x,y좌표를 넣어주고 삭제

            for(int d=0; d<4; d++) {
                nx = temp.x + dx[d];
                ny = temp.y + dy[d];	//다음 칸 좌표 , 동 서 남 북 순으로 탐색

                if(nx<0 || ny<0 || nx>=N || ny>=M) {//다음 좌표가 맵을 벗어날때
                    continue;
                }
                if(map[nx][ny] ==0 || visited[nx][ny]) {	//다음 칸이 0이거나 방문했으면
                    continue; //계속 for문 돌기
                }
                //다음 칸이 방문 안했고 1일때

                q.offer(new Point(nx,ny));
                visited[nx][ny] =true;
                size++;


            }


        }



        max = max > size ? max : size;

    }

}