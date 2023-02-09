import java.io.*;
import java.util.*;

public class bj11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int a, b;
        List<xy> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            list.add(new xy(a,b));

        }

        Collections.sort(list, new Comparator<xy>() {
                    @Override
                    public int compare(xy o1, xy o2) {
//                    if(o1.x < o2.x) return -1;
//                    if(o1.x > o2.x) return 1;
//
//                    if(o1.y < o2.y) return -1;
//                    if(o1.y < o2.y) return 1;
//
                        return o1.getX() - o2.getX();
                    }
                }.thenComparing(new Comparator<xy>() {
                    @Override
                    public int compare(xy o1, xy o2) {
                        return o1.getY() - o2.getY();
                    }
                })

        );

        for(xy j : list){
            bw.write(String.valueOf(j)+" "+"\n");

        }

        bw.flush();
        bw.close();

    }


    static class xy{
        private int x;
        private int y;

        public xy(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return x +
                    " " + y;
        }
    }



}
