class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        int a = money / 5500;
        int b = money - (5500 * a);
        answer = new int[]{a, b};
        return answer;
    }
}