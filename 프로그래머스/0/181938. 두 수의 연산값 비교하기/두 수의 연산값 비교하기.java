class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String num1 = String.valueOf(a) + String.valueOf(b);
        int num2 = 2*a*b;
        
        if(Integer.parseInt(num1)>=num2){
            return Integer.parseInt(num1);
        }else if(Integer.parseInt(num1)<num2){
            return num2;
        }else{
            return 0;
        }
        
    }
}