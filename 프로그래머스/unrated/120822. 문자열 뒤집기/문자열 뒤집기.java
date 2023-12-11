class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=my_string.length()-1; i>=0; i--){
            char word = my_string.charAt(i);
            answer += word;
        }
        return answer;
    }
}