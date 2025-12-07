import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int number = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] numbers = new int[number+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= number;i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 1 ; i <= number; i++){
            int key = target-numbers[i];
            if(map.containsKey(key)){
                System.out.println(map.get(key)+ " " +i);
                return;
            }
            map.put(numbers[i], i);
        }
        System.out.println("IMPOSSIBLE");
    }
}