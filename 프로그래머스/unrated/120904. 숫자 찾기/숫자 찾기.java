class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = Integer.toString(num);
        String[] array = str.split("");
        
        for(int i=0; i<array.length; i++){
            if(array[i].equals(Integer.toString(k))){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}