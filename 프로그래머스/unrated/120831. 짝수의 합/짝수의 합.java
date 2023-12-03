class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0; i*2<=n; i++){
            answer += i*2;
        }
        return answer;
    }
}