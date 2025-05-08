package programmers.lv00;

public class BusTest {
    public int solution(int seat, String[][] passengers) {
            int num_passenger = 0;
            for (int i = 0; i < passengers.length; i++) {
                num_passenger += func4(passengers[i]);
                num_passenger -= func3(passengers[i]);
            }
            int answer = func1(seat-num_passenger);
            return answer;
        }

        public int func1 ( int num){ // 음수일 경우 0으로 처리
            if (0 > num) {
                return 0;
            } else {
                return num;
            }
        }
        public int func2 ( int num){ // 양수일 경우 0으로 처리
            if (num > 0) {
                return 0;
            } else {
                return num;
            }
        }

        public int func3 (String[]station){ // 해당 정류장에서 하차 수("Off") 계산
            int num = 0;
            for (int i = 0; i < station.length; i++) {
                if (station[i].equals("Off")) {
                    num += 1;
                }
            }
            return num;
        }

        public int func4 (String[]station){ // 해당 정류장에서 승차 수("On") 계산
            int num = 0;
            for (int i = 0; i < station.length; i++) {
                if (station[i].equals("On")) {
                    num += 1;
                }
            }
            return num;
        }
    }

