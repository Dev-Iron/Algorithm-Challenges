# 🧮 문제: 직각삼각형의 변 구하기 (Find Missing Side in Right Triangle)

- 사이트: 프로그래머스
- 레벨: Lv.00
- 언어: Java

---

## 📌 문제 설명

직각삼각형이 주어졌을 때, 피타고라스 정리를 이용해 다른 한 변의 제곱 값을 구하는 문제입니다.

📌 문제 조건
직각삼각형의 한 변 a와 빗변 c가 주어짐

피타고라스 정리:
[스크린샷 2025-05-10 오전 8.15.24.png](../../../../../../../../../var/folders/g1/8frlyq0901d6c3mjrcyvswy40000gn/T/TemporaryItems/NSIRD_screencaptureui_1qeUcz/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202025-05-10%20%EC%98%A4%EC%A0%84%208.15.24.png)]

이때 다른 한 변의 제곱인 `b_square` 값을 출력해야 합니다.

---

## 💡 풀이 아이디어

- `b^2 = c^2 - a^2`

---

## ✅ 코드

```java
    int b_square = (c + a) * (c - a);  // 피타고라스 정리의 항등식 활용
    System.out.println(b_square);
```

## 🧠 배운 점 / 포인트

- 수학적인 항등식인 `(c + a)(c - a) = c² - a²`을 활용해 곱셈 형태로 더 효율적으로 계산할 수 있음 
- 따라서 `b_square = (c + a) * (c - a)`로 표현 가능
