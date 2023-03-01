import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj1780 {

    static int N ;
    static int arr[][] ;
    static int nOne, zero, one = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        split(0,0,N);

        System.out.println(nOne);
        System.out.println(zero);
        System.out.println(one);
    }

    public static void split(int row, int col, int size){

        if(chk(row, col, size)){
            if(arr[row][col] == -1){
                nOne++;
            }else if(arr[row][col] == 0){
                zero++;
            }else{
                one++;
            }
            return;
        }

        int newSize = size/3;

        split(row, col, newSize);   //왼쪽 위
        split(row, col+newSize, newSize);   //중앙 위
        split(row, col+newSize*2, newSize);   //오른쪽 위

        split(row+newSize, col, newSize);    //왼쪽 중간
        split(row+newSize, col+newSize, newSize);    //중앙 중간
        split(row+newSize, col+newSize*2, newSize);    //오른쪽 중간

        split(row+newSize*2, col, newSize); //왼쪽 아래
        split(row+newSize*2, col+newSize, newSize); //중앙 아래
        split(row+newSize*2, col+newSize*2, newSize); //오른쪽 아래

    }

    public static boolean chk(int row, int col, int size) {
        int color = arr[row][col];

        for(int i=row; i<row+size; i++){
            for(int j=col; j<col+size; j++){
                if(color != arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
