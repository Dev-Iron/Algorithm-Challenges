package programmers.lv00;

public class WarehouseArrangement {
    public String solution(String[] storage, int[] num) {
        int num_item = 0;  // 정리된 물건 종류 개수 (clean_storage에 쌓일 물건 종류 수)

        String[] clean_storage = new String[storage.length];  // 정리된 물건 이름 배열
        int[] clean_num = new int[num.length];  // 정리된 각 물건 개수 배열

        // 1. 물건 하나씩 확인하면서 정리된 배열에 넣기
        for(int i = 0; i < storage.length; i++) {
            int clean_idx = -1;  // 동일한 이름의 물건이 clean_storage에 존재하는지 확인용

            // 2. 이미 등록된 물건인지 확인
            for(int j = 0; j < num_item; j++) {
                if(storage[i].equals(clean_storage[j])) {
                    clean_idx = j;  // 이미 있다면 해당 위치 저장
                    break;
                }
            }

            if(clean_idx == -1) {
                // 새 물건이면 새로 추가
                clean_storage[num_item] = storage[i];  // 물건 이름 저장
                clean_num[num_item] = num[i];          // 개수 저장
                num_item += 1;                         // 종류 개수 증가
            } else {
                // 이미 있는 물건이면 개수만 추가
                clean_num[clean_idx] += num[i];
            }
        }

        // 3. 정리된 물건들 중 가장 개수가 많은 물건 찾기
        int num_max = -1;  // 최대 개수 저장 변수
        String answer = "";  // 반환할 물건 이름

        for(int i = 0; i < num_item; i++) {
            if(clean_num[i] > num_max) {
                num_max = clean_num[i];      // 더 큰 개수를 발견하면 갱신
                answer = clean_storage[i];   // 해당 이름을 answer로 저장
            }
        }

        return answer;  // 가장 개수가 많은 물건 이름 반환
    }
}
