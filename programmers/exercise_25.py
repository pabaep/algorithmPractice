from datetime import datetime
def solution(a, b):
    day = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
    answer = day[datetime(2016,a,b).weekday()]
    return answer
