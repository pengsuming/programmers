function solution(my_string, m, c) {
    let result = '';
    
    // 문자열을 m 글자씩 잘라서 배열에 저장
    const segments = [];
    for (let i = 0; i < my_string.length; i += m) {
        segments.push(my_string.slice(i, i + m));
    }
    
    // c번째 열에 해당하는 문자들을 가져와서 결과 문자열에 추가
    for (let i = 0; i < segments.length; i++) {
        result += segments[i].charAt(c - 1);
    }
    
    return result;
}