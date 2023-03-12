import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj20165 {
    static int map[][] ;
    static String result[][] ;
    static int N,M;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        map = new int[N+1][M+1];
        String attack[] = new String[1000];
        int defence[] = new int[1000];
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

                int x = defence[0];
                int y = defence[1];

                result[x][y] ="S";

            }
        }

        System.out.println(count);

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

            if(nextWay<=M-1 && result[x][nextWay].equals("S") || result[x][y].equals("S")){
                for(int i=y; i<=M; i++){   //y 1부터 3까지
                    nextWay = y+map[x][y+1];
                    if (result[x][i].equals("S")) {
                        result[x][i] = "F";
                        count++;
                    }else if(result[x][nextWay].equals("F")){
                        break;
                    }
                }
            }
        }

        else if(way.equals("W")){
            int nextWay = y-map[x][y]+1;

            if(nextWay>=2 && result[x][nextWay].equals("S") || result[x][y].equals("S")){
                for(int i=y; i>=1; i--){
                    nextWay = y-map[x][y-1];
                    if (result[x][i].equals("S")) {
                        result[x][i] = "F";
                        count++;
                    }else if(result[x][nextWay].equals("F")){
                        break;
                    }
                }

            }
        }else if(way.equals("S")){
            int nextWay = x+map[x][y]-1;

            if(nextWay<=N-1 && result[nextWay][y].equals("S") || result[x][y].equals("S")){
                for(int i=x; i<=N; i++){
                    nextWay = x+map[x+1][y];
                    if (result[i][y].equals("S")) {
                        result[i][y] = "F";
                        count++;
                    }else if(result[nextWay][y].equals("F")){
                        break;
                    }
                }
            }

        }
        else{
            int nextWay = x-map[x][y]+1;

            if(result[nextWay][y].equals("S") || result[x][y].equals("S")){
                for (int i = x; i >= 1; i--) {
                    if(result[i][y].equals("S")) {
                        result[i][y] = "F";
                        count++;
                    }else if(result[nextWay][y].equals("F")){
                        break;
                    }
                    dps(x,y,"N");
                }

            }

//            while(x>1){
//                x--;
//
//
//            }

        }
    }

}