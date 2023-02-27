import java.io.*;
import java.util.StringTokenizer;

public class bj1806 {
    static StringBuilder sb = new StringBuilder();
    static FastReader scan = new FastReader();

    static int n, S;
    static int[] a;

    static void input() {
        n = scan.nextInt();
        S = scan.nextInt();
        a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
        }
    }

    static void pro() {
        int R = 0, sum = 0, ans = n + 1;
        for (int L = 1; L <= n; L++) {
            // L 한 칸 앞으로 갈 때, L - 1 을 구간에서 제외해야함
            sum -= a[L - 1];

            // R 을 옮길 수 있을 때 까지 옮기기
            while (R + 1 <= n && sum < S)  //R의 오른쪽 칸이 구간을 벗어나면 안된다 & sum 이 이미 S를 넘으면 옮길 필요가 없다
                R++;                  // R 옮겨 주고
                sum += a[R];          // 옮겨준 R의 원소를 sum에 더해주기

            // [L ... R] 의 합, 즉 sum이 조건을 만족하면 정답 갱신하기
            if (sum >= S)
                ans = Math.min(ans, R - L + 1);
        }

        // ans 값을 보고 불가능 판단하기
        if (ans == n + 1)   //초기 값이 변경되지 않았으면 S 보다 넘는 숫자가 없다는 것
            ans = 0;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        input();
        pro();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
