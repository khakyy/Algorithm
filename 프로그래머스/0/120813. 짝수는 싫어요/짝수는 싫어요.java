import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                a.add(i);
            }
        }
        int[] answer = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i);
        }
        return answer;
    }
}