package day05;

import java.util.Arrays;

public class Lab09 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortest("teachermode", 'e')));
    }

    public static int[] shortest(String s, char c) {
        int len = s.length();
        int ans[] = new int[len];
        int prev = len;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == c) {
                prev = 0;
                ans[i] = prev;
            } else {
                ans[i] = ++prev;
            }
        }

        prev = len;

        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) != c) {
                ans[i] = Math.min(ans[i], ++prev);
            } else {
                prev = 0;
            }
        }

        return ans;
    }
}
