# 🚌 문제: 남은 좌석 계산하기 (Available Bus Seats)

- 사이트: 프로그래머스
- 레벨: Lv.00
- 언어: Java

---

## 📌 문제 설명

정류장마다 승차와 하차가 기록된 2차원 배열이 주어진다.
현재까지 승객이 타고 있는 인원을 계산하여, 마지막 정류장에서 영진이가 탑승할 수 있는 좌석 수를 구하는 문제이다.
버스 좌석 수(seat)가 주어지며, 음수 좌석이 되지 않도록 보장해야 한다.

---

## 💡 풀이 아이디어

1. 문제의 본질을 파악해야 한다.
    - 솔직하게 정말 어렵다.

2. 핵심 로직 요약
    - 각 정류장마다 `"On"`의 수만큼 승차, `"Off"`의 수만큼 하차.
    - 마지막에는 `좌석 수 - 누적된 승객 수`가 최종 결과이고, 음수면 0으로 보정한다.

---

## ✅ 코드

```java
 public int solution(int seat, String[][] passengers) {
        int num_passenger = 0;
        for(int i = 0; i < passengers.length; i++) {
            num_passenger += func4(passengers[i]); // 승차 인원 더하기
            num_passenger -= func3(passengers[i]); // 하차 인원 빼기
        }
        int answer = func1(seat - num_passenger); // 남은 좌석 = 전체 좌석 - 현재 탑승자 수
        return answer;
    }
```
