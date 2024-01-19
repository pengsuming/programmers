class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] str1 = new char[my_string.length()];
        
        for(int i=0; i<my_string.length(); i++){
            str1[i] = my_string.charAt(i);
        }
        
        char temp = str1[num1];
        str1[num1] = str1[num2];
        str1[num2] = temp;
        for(int j=0; j<my_string.length(); j++){
            answer += str1[j];
        }
        return answer;
    }
}