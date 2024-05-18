import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int temp = 1;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            for (; temp <= num; temp++) {
                deque.push(temp);
                sb.append("+\n");
            }

            if (deque.peek() != null && deque.peek() == num) {
                deque.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);

    }
}
