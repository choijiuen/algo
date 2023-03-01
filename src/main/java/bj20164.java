import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.max;
import static java.lang.Integer.min;


public class bj20164 {
    static int N;
    static int oddMax, oddMin;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        oddMin = 100000000;
        oddMax =0;

//        oddChk(N);
        makeNewNum(N, oddChk(N));

        System.out.println(oddMin+" "+oddMax);
//        System.out.println(oddNum);
    }

    public static int oddChk(int n) {
        int res = 0;
        //1.각 자리 수의 홀수의 갯수 저장
        String size = Integer.toString(n);
//        System.out.println(n);
        for(int i=0; i<size.length(); i++){
            if(Integer.parseInt(size.substring(i,i+1)) % 2 == 1){
                res++;
            }
        }
        return res;
    }

    public static void makeNewNum(int n, int oddNum) {
        //2. 한 자리면 종료, 두 자리면 2개로 나눠서 합을 구함
        //3. 세 자리 이상이면 임의의 위치에서 끊어서 3개의 수로 분할, 3개를 더한 값을 새로운 수로 생각
        String size = Integer.toString(n);
//        size = Integer.toString(n);

        if(size.length() == 1) {
            oddMin = min(oddMin, oddNum);
            oddMax = max(oddMax, oddNum);
            return;
        }

        if(size.length() == 2){
            int newNum =0;
            for(int i=0; i<size.length(); i++){
                newNum += Integer.parseInt(size.substring(i,i+1));
            }
            makeNewNum(newNum, oddChk(newNum)+oddNum);
            return;
        }

        // 세 자리 이상의 수 이면 가능한 3가지 자르는 방법을 모두 진행
        if(size.length() >=3){

            for(int i = 0; i <= size.length() - 3; i++){ //첫 번째로 자르는 위치
                for(int j = i + 1; j <= size.length() - 2; j++){ //두 번째로 자르는 위치를 이중 for문으로 돌림
                    String x1 = size.substring(0,i+1);//0~i
                    String x2 = size.substring(i+1,j+1);//i+1~j
                    String x3 = size.substring(j+1,size.length());//j+1~마지막

                    int newNum = Integer.parseInt(x1) + Integer.parseInt(x2) + Integer.parseInt(x3);
                    makeNewNum(newNum, oddChk(newNum)+oddNum);
                }
            }
        }
}

}
