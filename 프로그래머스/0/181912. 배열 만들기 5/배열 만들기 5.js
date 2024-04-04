function solution(intStrs, k, s, l) {
    let result = [];
    for (let str of intStrs) {
        // s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내어 정수로 변환
        let num = parseInt(str.substring(s, s + l));
        
        // 변환한 정수값이 k보다 큰지 확인하여 결과 배열에 추가
        if (num > k) {
            result.push(num);
        }
    }
    return result;
}