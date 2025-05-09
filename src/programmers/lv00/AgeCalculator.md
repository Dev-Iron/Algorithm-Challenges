# 🧮 문제: 나이 계산기 (Age Calculator)

- 사이트: 프로그래머스
- 레벨: Lv.00
- 언어: Java

---

## 📌 문제 설명

출생 연도(year)와 나이 계산 방식(age_type)이 주어졌을 때, 2030년에 몇 살이 되는지를 계산하는 프로그램을 작성합니다.

📌 나이 계산 방식
한국식 나이 (Korea): 태어날 때 1살로 시작하여, 매년 1월 1일에 1살씩 증가합니다.
    계산식: 2030 - year + 1

연 나이 (Year): 태어날 때 0살로 시작하여, 매년 1월 1일에 1살씩 증가합니다.
    계산식: 2030 - year

---

## 💡 풀이 아이디어

1. 입력 받기: 사용자로부터 출생 `연도(year)`와 나이 계산 방식`(age_type)`을 입력받습니다.

2. 조건 분기: `age_type`이 "Korea"이면 한국식 나이 계산식을, "Year"이면 연 나이 계산식을 사용합니다.

3. 결과 출력: 계산된 나이를 출력합니다.

---

## ✅ 코드

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();              // 출생 연도 입력
    String age_type = sc.next();          // 나이 계산 방식 입력
    int currentYear = LocalDate.now().getYear();  // 현재 연도 동적 구하기
    int answer = 0;

    if (age_type.equals("Korea")) {
        answer = currentYear - year + 1;
    } else if (age_type.equals("Year")) {
        answer = currentYear - year;
    }

    System.out.println(answer);
}

```

## 🧠 배운 점 / 포인트
- `LocalDate.now().getYear()`를 사용하면 매년 자동 업데이트되는 코드를 작성할 수 있다.

- 문자열 비교는 `==`가 아니라 `.equals()`를 사용해야 정확한 비교가 된다.

- 분기 처리 시 `"Korea"`와 `"Year"`로 명확하게 구분하면 실수를 줄일 수 있다.

