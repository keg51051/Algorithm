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
        long answer = 0;
        long pow = 1;

        for (int i = 0; i < 26; i++) {
            alphabet.add((char)(97+i));
        }

        for (int j = 0; j < str.length(); j++) {
            int index = alphabet.indexOf(str.charAt(j)) + 1;

            answer += index * pow;
            pow = (pow * 31) % 1234567891;
        }

        System.out.println(answer % 1234567891);
    }
}
