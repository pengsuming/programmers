class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] same = new int[31];
        
        for(int i=0; i<strArr.length; i++){
            same[strArr[i].length()] += 1;
        }
        
        answer = same[0];
        for(int i=0; i<same.length; i++){
            if(answer < same[i]){
                answer = same[i];
            }
        }
        return answer;
    }
}