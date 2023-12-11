class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++){
            char value = rsp.charAt(i);
            if(value=='2'){
                answer+="0";
            }else if(value=='0'){
                answer+="5";
            }else if(value=='5'){
                answer+="2";
            }
        }
        
        return answer;
    }
}