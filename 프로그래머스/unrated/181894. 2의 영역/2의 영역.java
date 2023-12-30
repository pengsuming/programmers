class Solution {
    public int[] solution(int[] arr) {
        int min = 100000, max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }
        if(min <= max){
            int[] answer = new int[max - min + 1];
            for(int i=min; i<=max; i++){
                answer[i-min] = arr[i];
            }
            return answer;
        }else{
            int[] answer = {-1};
            return answer;
        }
    }
}