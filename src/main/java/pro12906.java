import java.util.*;

public class pro12906 {
    public int[] solution(int []arr) {
        Stack<Integer> s = new Stack<>();

        s.push(11);

        for(int i=0; i<arr.length; i++){

            if(s.peek() != arr[i]){
                s.push(arr[i]);
            }

        }
        int[] answer = new int[s.size()-1];

        for(int i=s.size()-2; i>-1; i--){
            answer[i] = s.peek();
            s.pop();
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}