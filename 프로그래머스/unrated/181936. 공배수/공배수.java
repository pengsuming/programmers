class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        while(true){
            if(number%n==0&&number%m==0){
                answer = 1;
                break;
            }else{
                answer = 0;
                break;
            }
        }
        return answer;
    }
}