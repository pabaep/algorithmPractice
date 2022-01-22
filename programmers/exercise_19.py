#연습문제 핸드폰 번호 가리기
def solution(phone_number):
    answer = "*"*(len(phone_number)-4) + phone_number[-4:]
    return answer
