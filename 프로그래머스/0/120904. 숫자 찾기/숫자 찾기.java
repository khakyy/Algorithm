class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String a;
        a = String.valueOf(num);
        String[] b = new String[a.length()];
        for (int i = 0; i < b.length; i++) {
            b[i] = String.valueOf(a.charAt(i));
            if (Integer.valueOf(b[i]) == k) {
                answer = i + 1;
                break;
            } else if (Integer.valueOf(b[i]) != k) {
                answer = -1;
            }
        }
        return answer;
    }
}