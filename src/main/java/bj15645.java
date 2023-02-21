import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj15645 {
    public static void main(String[] args) throws IOException {
        /** 1) 풀고 싶은 가짜 문제 정의 - 일단 도전해보기
         * 진짜 문제 = N번째 줄에 도착하며 얻는 최대 점수
         * 가짜 문제 = Dy[i] = i번 째 줄에 도착하며 얻는 최대 점수
         * 2) 가짜 문제를 풀면 진짜 문제를 풀 수 있는가?
         * Dy 배열을 가즉 채울 수만 있다면 진짜 문제에 대한 대답은 Dy[N]이다.
         * 3) 초기값은 어떻게 되는가?
         * 초기값 : 쪼개지 않아도 풀 수 있는 "작은 문제"들에 대한 정답
         * 4) 점화식 구해내기
         * 1. Dy[i] 계산에 필요한 탐색 경우를 공통점끼리 묶어 내기(Partitioning)
         * 2. 묶어낸 부분의 정답을 Dy 배열을 이용해서 빠르게 계산해보기
         * ex) Dy[3] 계산에 필요한 탐색 경우들
         * 1 2 3
         * 4 5 6
         * 4 9 0
         * 마지막에 0, 1 ,2 칸 선택하는 공통점..?
         *
         * Dy[i] = (i-1)번째 줄, 0,1 칸 //0일 때
         * --> Dy[i-1][0]
         * Dy[i] = (i-1)번째 줄, 0,1,2 칸 //1일 때
         * --> Dy[i-1][1]
         * Dy[i] = (i-1)번째 줄, 1,2 칸 //2일 때
         * --> Dy[i-1][2]
         * 최대 점수는 각 partition의 최대 점수 들 중의 최대 점수 이다
         * 위의 조건에는 붙어있는 쪽으로만 내려가는 조건이 없다
         *--> 모자란 정보를 다이나믹 테이블에 추가 
         * --> 1) 풀고 싶은 가짜 문제 정의 - 필요한 정보를 문제에 추가하기
         * 진짜 문제 = N번째 줄에 도착하며 얻는 최대 점수
         * 가짜 문제 = Dy[i-1][0] > Dy[i-2][0] ,i-1번째 줄의 0번째 칸을 밟고 얻는 최대 점수
         *                        Dy[i-2][1]
         *
         *           Dy[i-1][1] > Dy[i-2][0] ,i-1번째 줄의 1번째 칸을 밟고 얻는 최대 점수
         *                        Dy[i-2][1]
         *                        Dy[i-2][2]
         *
         *           Dy[i-1][2] > Dy[i-2][1] ,i-1번째 줄의 2번째 칸을 밟고 얻는 최대 점수
         *                        Dy[i-2][2]
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        int [][]A = new int[N+1][3];
        int [][]Dy = new int[N+1][3];

        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //점화식을 토대로 Dy 배열 채우기
        Dy[1][0] = A[1][0];
        Dy[1][1] = A[1][1];
        Dy[1][2] = A[1][2];

        for(int i= 2; i<=N; i++){
            Dy[i][0] = Math.max(Dy[i-1][0], Dy[i-1][1]) + A[i][0];
            Dy[i][1] = Math.max(Math.max(Dy[i-1][0], Dy[i-1][1]), Dy[i-1][2]) + A[i][1];
            Dy[i][2] = Math.max(Dy[i-1][1], Dy[i-1][2]) + A[i][2];
        }
        System.out.print(Math.max(Dy[N][0], Math.max(Dy[N][1], Dy[N][2]))+" ");

        for(int i= 2; i<=N; i++){
            Dy[i][0] = Math.min(Dy[i-1][0], Dy[i-1][1]) + A[i][0];
            Dy[i][1] = Math.min(Math.min(Dy[i-1][0], Dy[i-1][1]), Dy[i-1][2]) + A[i][1];
            Dy[i][2] = Math.min(Dy[i-1][1], Dy[i-1][2]) + A[i][2];
        }
        System.out.println(Math.min(Dy[N][0], Math.min(Dy[N][1], Dy[N][2])));
    }

}
