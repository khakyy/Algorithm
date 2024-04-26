class Solution {
    public String solution(String myString) {
        String answer = "";
        String a = myString.toLowerCase();
        String[] b = new String[myString.length()];
        for (int i = 0; i < myString.length(); i++) {
            b[i] = String.valueOf(a.charAt(i));
            if (b[i].equals("a")) {
                b[i] = b[i].toUpperCase();
            }
            answer += b[i];
        }
        return answer;
    }
}