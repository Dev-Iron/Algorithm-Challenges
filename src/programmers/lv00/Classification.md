# 🧮 문제: 병과 분류 (Classification)

- 사이트: 프로그래머스
- 레벨: Lv.00
- 언어: Java

---

## 📌 문제 설명

코드 끝에 붙은 특정 문자열(4글자)을 보고 어떤 병과를 방문해야 하는지 분류하는 문제.


---

## 💡 풀이 아이디어

- 음수일 경우 `+360`으로 0 이상 보정
- 환자 코드 문자열 code의 **접미사(끝부분)**를 비교합니다. 
- 자바의 String.endsWith() 메서드를 사용하면, 마지막 글자를 직관적이고 안전하게 비교할 수 있습니다. 
- 조건문(if ~ else if ~ else)을 사용하여 병과를 출력합니다.

---

## ✅ 코드

```java
    if(lastFourWords.equals("_eye")){
    System.out.println("Ophthalmologyc");
    } 
    
    else if (code.endsWith("head")){
    System.out.println("Neurosurgery");
    }
```