class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        int[] arr = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i) - '0';
            answer += arr[i];
        }
        return answer;
    }
}