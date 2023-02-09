import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String,Integer> map = new HashMap();
        int value = 0;
        map.put("RT", 0);
        map.put("CF", 0);
        map.put("JM", 0);
        map.put("AN", 0);
        char type = 'a';
        
        for (int i=0; i<survey.length; i++) {
            switch(survey[i]) {
                case "RT": 
                    value = map.get("RT") + (choices[i] - 4);
                    map.put("RT", value);
                    break;
                case "TR":
                    value = map.get("RT") - (choices[i] - 4);
                    map.put("RT", value);
                    break;
                case "CF":
                    value = map.get("CF") + (choices[i] - 4);
                    map.put("CF", value);
                    break;
                case "FC":
                    value = map.get("CF") - (choices[i] - 4);
                    map.put("CF", value);
                    break;
                case "JM":
                    value = map.get("JM") + (choices[i] - 4);
                    map.put("JM", value);
                    break;
                case "MJ":
                    value = map.get("JM") - (choices[i] - 4);
                    map.put("JM", value);
                    break;
                case "AN":
                    value = map.get("AN") + (choices[i] - 4);
                    map.put("AN", value);
                    break;
                case "NA":
                    value = map.get("AN") - (choices[i] - 4);
                    map.put("AN", value);
                    break;
            }
        }
        
        for (int i=0; i<map.size(); i++) {
            if (Integer.parseInt(map.values().toArray()[i].toString()) > 0) {
                type = map.keySet().toArray()[i].toString().charAt(1);
            } else {
                type = map.keySet().toArray()[i].toString().charAt(0);
            }
            answer += type;
        }
        
        return answer;
    }
}