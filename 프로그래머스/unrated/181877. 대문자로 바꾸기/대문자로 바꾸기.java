class Solution {
    public String solution(String myString) {
        String answer = "";
        int temp;
        for(int i=0; i<myString.length(); i++){
            temp = (int)myString.charAt(i);
            if((temp>=97)&&(temp<=122)){
                answer += (char)(temp-32);
            }else{
                answer += (char)temp;
            }
        }
        return answer;
    }
}