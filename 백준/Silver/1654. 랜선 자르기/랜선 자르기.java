import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        ArrayList<Integer> cables = new ArrayList<>();

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        long left = 1;
        long right = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            cables.add(Integer.parseInt(br.readLine()));
        }

        while (left <= right) {
            long mid = (left + right) / 2;
            int temp = 0;

            for (int cable : cables) {
                temp += (int) (cable / mid);
            }

            if (temp < n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(right);
    }
}
