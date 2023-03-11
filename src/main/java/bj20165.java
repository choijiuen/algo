import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj20165 {
    static int dx[] = {1,-1,0,0};  //동E 서W 남S 북N
    static int dy[] = {0,0,-1,1};  //동E 서W 남S 북N
    static int map[][] ;
    static String result[][] ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        map = new int[N+1][M+1];
        String attack[] = new String[3];
        int defence[] = new int[2];
        result = new String[N+1][M+1];

        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                result[i][j] = "S";
            }
        }


        for(int i=1; i<=R*2; i++){
            st = new StringTokenizer(br.readLine());
            if(i % 2 ==1){
                attack[0] = st.nextToken();
                attack[1] = st.nextToken();
                attack[2] = st.nextToken();
                int x = Integer.parseInt(attack[0]);
                int y = Integer.parseInt(attack[1]);

                dps(x, y, attack[2]);  // 방향 쳌

            }else{
                defence[0] = Integer.parseInt(st.nextToken());
                defence[1] = Integer.parseInt(st.nextToken());

            }


        }

        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }



    }

    private static void dps(int x, int y, String way) {
        if(way.equals("E")){
            int nextWay = y+map[x][y]-1;

            if(result[x][y].equals("S")){
                for(int i=y; i<=nextWay; i++){   //y 1부터 3까지
                    result[x][i] = "F";
                }
                if(result[x][nextWay+1].equals("S") && map[x][nextWay] != 1){
//                    dps(x,nextWay+1,"E");
                }
            }


        }else if(way.equals("W")){

        }else if(way.equals("S")){

        }else{

        }
    }
}