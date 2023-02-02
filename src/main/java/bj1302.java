import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> books = new LinkedHashMap<>();

        for(int i=0; i<N; i++){
            String s = br.readLine();

            if(!books.containsKey(s) ){ //no value
                books.put(s,1);
            }else{
                books.put(s,books.get(s)+1);
            }

        }
        Map<String, Integer> result = sortMapByKey(books);
        for(Map.Entry<String,Integer> entry : result.entrySet()){

                System.out.println(entry.getKey());
                int i=1;
                if(i==1){
                    break;
                }

        }


    }

    public static LinkedHashMap<String, Integer> sortMapByKey(Map<String,Integer> books){
        List<Map.Entry<String,Integer>> entries = new LinkedList<>(books.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }

        }.thenComparing(new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                })
                );

        LinkedHashMap<String,Integer> result = new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry : entries){
            result.put(entry.getKey(), entry.getValue());
        }

        return result;

    }
}
