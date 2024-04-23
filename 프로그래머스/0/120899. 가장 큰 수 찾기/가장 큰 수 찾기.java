class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > a) {
                a = array[i];
                answer[1] = i;
            }
        }
        answer[0] = a;
        return answer;
    }
}