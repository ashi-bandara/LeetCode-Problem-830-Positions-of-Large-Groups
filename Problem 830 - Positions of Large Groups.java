import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) { //if current character equals the next 2 characters
                List<Integer> list = new ArrayList<>();
                list.add(i); // add starting index of the consecutive series
                while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) { // if the consecutive group is bigger than 3
                    i++;
                }
                list.add(i); // add the ending index of the consecutive group
                answer.add(list);
            }
        }
        return answer;
    }
}
