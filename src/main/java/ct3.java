import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.StringTokenizer;

public class ct3 {
    static ArrayList<Integer> hSize;
    static ArrayList<Integer> vSize;
    static int min;
    static int dp[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        hSize = new ArrayList<>();
        vSize = new ArrayList<>();

        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            min= 100000000;

            if(N == 1){
                min =0;
            }else{
                for(int j=0; j<N; j++){
                    hSize.add(Integer.parseInt(st.nextToken()));
                    vSize.add(Integer.parseInt(st.nextToken()));
                }
                muti(N);
            }

//            for(int j=0; j<N; j++){
//                System.out.print(hSize.get(j)+" "+vSize.get(j));
//            }
//
//            System.out.println();

            System.out.println(min);

            hSize.clear();
            vSize.clear();
        }
    }

    public static void muti(int size) {
        int res=0;
        dp = new int[size+1][size+1];

        for(int i=0; i<size-1; i++){
            if(vSize.get(i) != hSize.get(i+1)){
                min = -1;
            }else{
                dp[i] vSize.get(i) * vSize.get(i+1);
//                System.out.println(vSize.get(i) +" "+ vSize.get(i+1));

            }
        }
//        System.out.println(res);
        min = Math.min(min, res);

    }
}
