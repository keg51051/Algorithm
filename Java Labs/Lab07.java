package day05;

import java.util.Arrays;

public class Lab07 {
    public static void main(String[] args) {
        String a = "KKHSSSSSSSESSS";
        String[] arr;
        String answer = "";
        StringBuilder sb = new StringBuilder();
        sb.append(a.charAt(0));

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(i-1)) {
                sb.append(" ");
            }
            sb.append(a.charAt(i));
        }

        arr = sb.toString().split(" ");

        for (String s : arr) {
            if (s.length() != 1) {
                answer += s.charAt(0) + String.valueOf(s.length());
            } else {
                answer += s.charAt(0);
            }
        }

        System.out.println(answer);
    }
}
