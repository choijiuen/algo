//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class bj11403 {
//    static int map[][];
//    static int N;
//    static Queue<Integer> q = new LinkedList<Integer>();
//
//    public static void main(String[] args) throws NumberFormatException, IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st ;
//
//
//        N = Integer.parseInt(br.readLine());
//        map = new int[N][N];
//        int tem;
//
//        for(int i=0; i<N; i++) {
//            st = new StringTokenizer(br.readLine());
//            for(int j=0; j<N; j++) {
//                map[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        for(int i=0; i<N; i++) {
//            for(int j=0; j<N; j++) {
//                if(map[i][j] ==1) {	//간선 연결되어 있을 때
//                    q.add(j); //q에 넣어주기  ex) i=0 q={3}, i=1 q={6}, i=3 q={5,6} ...
//                }
//            }
//
//            while(!q.isEmpty()) {//큐가 빌 때까지 한 행씩 본다 i=0 ~ N
//                tem =q.poll(); // tem에 q값 넣어주기
//                BFS(i,tem);
//
//            }
//        }
//
//        for(int i=0; i<N; i++) {
//            for(int j=0; j<N; j++) {
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//    }
//
//    private static void BFS(int x, int tem) {
//
//        map[x][tem] = 1; // 여기는 당연히 1임 , map[0][5], map[0][6] 도 연결해준다
//
//        for(int i=0; i<N; i++) {
//            if(map[tem][i] == 1 && map[x][i] != 1) {// x=0, tem=3 이면 , 노드 0,3 이 연결된 거니깐, 이제 3과 연결된 노드를 찾기
//                //map[3][4] , map[3][5] 일 때 연결 되있으니깐, 0,3,4,5,가 연결됨
//                q.add(i); //갈 수 있는 길이라 큐에  추가한다
//            }
//        }
//
//    }
//
//}