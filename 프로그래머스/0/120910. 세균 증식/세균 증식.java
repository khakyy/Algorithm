class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        for (int i = 1; i < t + 1; i++) {
            answer = n *= 2;
        }
        return answer;
    }
}