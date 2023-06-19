package day05;

public class Lab08 {
    public static void main(String[] args) {
        String input = "tge0a1h205er";
        String temp = "";
        int answer = 0;

        // Ascii
//        for (int i = 0; i < input.length(); i++) {
//            int ascii = (int)input.charAt(i);
//            if (ascii >= 48 && ascii <= 57) {
//                temp += input.charAt(i);
//            }
//        }

        // isDigit
        for (int i = 0; i < input.length(); i++) {
            int ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                temp += input.charAt(i);
            }
        }

        answer = Integer.parseInt(temp);

        System.out.println(answer);
    }
}
