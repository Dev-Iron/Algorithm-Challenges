# 🧮 문제: 각도 합치기 (Combining Angles)

- 사이트: 프로그래머스
- 레벨: Lv.00
- 언어: Java

---

## 📌 문제 설명

두 각을 더해 360도 범위로 정규화하는 문제.

---

## 💡 풀이 아이디어

- `(angle1 + angle2) % 360`으로 나머지 처리합니다.
- 음수일 경우 `+360`으로 0 이상을 보정합니다.

---

## ✅ 코드

```java
int sum_angle = (angle1 + angle2) % 360;
if (sum_angle < 0) sum_angle += 360;
```