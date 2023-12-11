import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int acc[] = new int[1001];
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            acc[array[i]]++;
        }
        int max = 0;
        for(int i=0; i<acc.length; i++){
            if(max<acc[i]){
                max=acc[i];
                answer = i;
            }
            if(max==acc[i]&& answer != i){
                answer = -1;
            }
        }
        return answer;
    }
}