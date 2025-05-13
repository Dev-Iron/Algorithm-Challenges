## 🧮 문제: 가습기 (Humidifier Control)

- 사이트: 프로그래머스
- 레벨: Lv.00
- 언어: Java

---

## 📌 문제 설명

상우가 사용하는 가습기에는 `auto`, `target`, `minimum`의 세 가지 모드가 있습니다. 

가습기의 가습량은 0~5단계로 구분되며 각 모드 별 동작 방식은 다음과 같습니다.

"auto" 모드:
습도가 0 이상 10 미만인 경우: 5단계
습도가 10 이상 20 미만인 경우: 4단계
습도가 20 이상 30 미만인 경우: 3단계
습도가 30 이상 40 미만인 경우: 2단계
습도가 40 이상 50 미만인 경우: 1단계
습도가 50 이상인 경우: 0단계

"target" 모드
습도가 설정값 미만일 경우: 3단계
습도가 설정값 이상일 경우: 1단계

"minimum" 모드:
습도가 설정값 미만일 경우: 1단계
습도가 설정값 이상일 경우: 0단계

상우가 설정한 가습기의 모드를 나타낸 문자열 `mode_type`, 현재 공기 중 습도를 나타낸 정수 `humidity`, 
설정값을 나타낸 정수 `val_set`이 주어질 때, 현재 가습기가 몇 단계로 작동 중인지 반환하도록 빈칸을 채워 solution 함수를 완성하세요.

---

## 💡 풀이 아이디어

- `"auto"` 모드에서는 습도에 따라 자동으로 단계가 설정됩니다. 조건에 맞는 범위를 찾아 각 단계에 맞는 값을 반환합니다.
- `"target"` 모드에서는 설정된 목표 습도와 현재 습도를 비교하여, 목표 습도를 맞추기 위해 3단계 또는 1단계로 설정합니다.
- `"minimum"` 모드에서는 설정값 미만일 경우 1단계로 작동시키고, 설정값 이상일 경우 0단계로 설정합니다.

---

## ✅ 코드

```java
public int solution(String mode_type, int humidity, int val_set) {
    int answer = 0;

    if (mode_type.equals("auto")) {
        answer = func2(humidity); // "auto" 모드에서의 단계
    } else if (mode_type.equals("target")) {
        answer = func1(humidity, val_set); // "target" 모드에서의 단계
    } else if (mode_type.equals("minimum")) {
        answer = func3(humidity, val_set); // "minimum" 모드에서의 단계
    }

    return answer;
    }
```

🧠 배운 점 / 포인트

- 각 모드에서 습도에 따라 어떻게 가습기를 작동시킬지에 대한 조건을 설정하는 것이 중요합니다.