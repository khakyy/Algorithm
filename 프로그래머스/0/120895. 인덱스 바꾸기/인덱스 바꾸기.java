class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] a = new String[my_string.length()];

        for (int i = 0; i < a.length; i++) {
            a[i] = String.valueOf(my_string.charAt(i));
        }
        String b = a[num1];
        String c = a[num2];

        a[num1] = c;
        a[num2] = b;

        for (int i = 0; i < a.length; i++) {
            answer += a[i];
        }

        return answer;
    }
}