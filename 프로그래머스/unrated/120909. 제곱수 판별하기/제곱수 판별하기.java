class Solution {
    public int solution(int n) {
        int answer = 1;
        int i=1;
        while(true){
            if(i*i!=n){
                if(i*i>n){
                    answer=2;
                    break;
                }
                i++;
            }else{
                answer=1;
                break;
            }
        }

        return answer;
    }
}