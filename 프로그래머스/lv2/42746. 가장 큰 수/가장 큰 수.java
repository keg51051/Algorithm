import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] stringNumbers = Arrays.stream(numbers)
                                .mapToObj(String::valueOf)
                                .toArray(String[]::new);

        Arrays.sort(stringNumbers, new Comparator<String>() { 
            @Override 
            public int compare(String t1, String t2) { 
                return (t2+t1).compareTo(t1+t2); 
            } 
        });

        if(stringNumbers[0].equals("0")) return "0";

        return String.join("", stringNumbers);
    }
}