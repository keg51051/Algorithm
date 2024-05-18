import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> alphabet = new ArrayList<>();
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int answer = 0;

        for (int i = 0; i < 26; i++) {
            alphabet.add((char)(97+i));
        }

        for (int j = 0; j < str.length(); j++) {
            int index = alphabet.indexOf(str.charAt(j)) + 1;

            if (j == 0) {
                answer += index;
            } else {
                answer += (int) (index * Math.pow(31, j));
            }
        }

        System.out.println(answer);
    }
}
