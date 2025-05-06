package chapter3.labs.lab4;

import java.time.DayOfWeek;
import java.util.Scanner;

import static chapter3.labs.lab4.EnumLab.DayOfWeek.MONDAY;
import static chapter3.labs.lab4.EnumLab.DayOfWeek.SUNDAY;

/**
 * Enum(열거형) 활용하기 실습
 */
public class EnumLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 요일 Enum 활용하기
        System.out.println("===== 요일 Enum 활용하기 =====");
        System.out.println("요일을 입력하세요 (월, 화, 수, 목, 금, 토, 일): ");
        String input = scanner.nextLine();

        // TODO: 입력받은 요일에 해당하는 DayOfWeek Enum 상수를 찾아 switch 문에서 활용하세요.
        // 평일(월~금)인 경우 "평일입니다."를, 주말(토, 일)인 경우 "주말입니다."를 출력하세요.
        DayOfWeek day = null;

        switch (input){
            case "월":
                day = DayOfWeek.MONDAY;
                break;
            case "화":
                day = DayOfWeek.TUESDAY;
                break;
            case "수":
                day = DayOfWeek.WEDNESDAY;
                break;
            case "목":
                day = DayOfWeek.THURSDAY;
                break;
            case "금":
                day = DayOfWeek.FRIDAY;
                break;
            case "토":
                day = DayOfWeek.SATURDAY;
                break;
            case "일":
                day = DayOfWeek.SUNDAY;
                break;
            default:
                day = DayOfWeek.ERROR;
                break;
        }


        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("평일입니당~ㅠ");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("주말입니당~~");
                break;
            default:
                System.out.println("잘못입력했습니다.");
                break;
        }

        
        // 2. 계절 Enum 활용하기
        System.out.println("\n===== 계절 Enum 활용하기 =====");
        System.out.println("월을 입력하세요 (1-12): ");
        int month = scanner.nextInt();

        // TODO: 입력받은 월에 해당하는 Season Enum 상수를 찾아 해당 계절의 특징을 출력하세요.
        // Season Enum에 평균 기온과 특징을 필드로 추가하고, 이를 활용하세요.
        Season season = null;
        switch (month){
            case 12:
            case 1:
            case 2:
                season = Season.WINTER;
                break;
            case 3:
            case 4:
            case 5:
                season = Season.SPRING;
                break;
            case 6:
            case 7:
            case 8:
                season = Season.SUMMER;
                break;
            case 9:
            case 10:
            case 11:
                season = Season.AUTUMN;
                break;
        }

        switch (season){
            case SPRING:
                System.out.println("봄은 " + season.getDescription()+ "입니다.");
                System.out.println("평균기온은 "+ season.getTemperature()+ "도 입니다.");
                break;
            case SUMMER:
                System.out.println("여름은 " + season.getDescription()+ "입니다.");
                System.out.println("평균기온은 "+ season.getTemperature()+ "도 입니다.");
                break;
            case AUTUMN:
                System.out.println("가을은 " + season.getDescription()+ "입니다.");
                System.out.println("평균기온은 "+ season.getTemperature()+ "도 입니다.");
                break;
            case WINTER:
                System.out.println("겨울은 " + season.getDescription()+ "입니다.");
                System.out.println("평균기온은 "+ season.getTemperature()+ "도 입니다.");
                break;

        }


        
        // 3. 상태 전이 Enum 활용하기
        System.out.println("\n===== 상태 전이 Enum 활용하기 =====");
        System.out.println("\n===== next 를 입력하면 다음 단계로 변경되고, exit 을 입력하면 종료됩니다. =====");


        // TODO: TaskStatus Enum을 구현하고, 상태 전이 로직을 활용하여 작업 상태를 변경하세요.
        // TaskStatus는 PENDING, IN_PROGRESS, COMPLETED, ARCHIVED 상태를 가지며,
        // nextStatus() 메소드를 통해 다음 상태로 전이할 수 있어야 합니다.
        // 사용자가 "next"를 입력할 때마다 상태를 다음 단계로 변경하고, 현재 상태를 출력하세요.
        // 사용자가 "exit"를 입력하면 종료합니다.

        TaskStatus current_status = TaskStatus.PENDING;

        while (true){
            String input2 = scanner.nextLine();
            if (input2.equals("next")){
                current_status = current_status.nextStatus();
            }else{
                System.out.println("종료합니다.");
                break;
            }
        }

        // 4. 연산자 Enum 활용하기
        System.out.println("\n===== 연산자 Enum 활용하기 =====");
        scanner.nextLine(); // 버퍼 비우기
        System.out.println("\n===== 두 개의 정수를 입력하시오. =====");
        int a  = scanner.nextInt();
        int b  = scanner.nextInt(); // 버퍼 구조 이해 안됨..
        System.out.println("\n===== 사칙연산자 중 하나를 입력하시오. =====");
        scanner.nextLine(); // 버퍼 비우기
        String cal = scanner.nextLine();

        // TODO: Operator Enum을 구현하고, 두 수에 대한 사칙연산을 수행하세요.
        // Operator는 ADD(+), SUBTRACT(-), MULTIPLY(*), DIVIDE(/) 연산을 가지며,
        // calculate() 메소드를 통해 두 수에 대한 연산을 수행할 수 있어야 합니다.
        // 사용자로부터 두 수와 연산자를 입력받아 계산 결과를 출력하세요.

        int result = 0;

        switch (cal){
            case "+":
                result = Operator.ADD.calculate(a,b);
                break;
            case "-":
                result = Operator.SUBTRACT.calculate(a,b);;
                break;
            case "*":
                result = Operator.MULTIPLY.calculate(a,b);;
                break;
            case "/":
                result = Operator.DIVIDE.calculate(a,b);;
                break;
            default:
                System.out.println("계산할 수 없습니다.");
                break;
        }
        System.out.println("결과값은 " + result + "입니다.");
        scanner.close();

    } // main 함수 종료

    enum DayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, ERROR
    }

    enum Season {
        SPRING("꽃 피는 계절", 15),
        SUMMER("물놀이 하는 계절", 28),
        AUTUMN("낙엽이 떨어지는 계절", 18),
        WINTER("눈 내리는 계절", 5);

        private final String description;
        private final int temperature;

        // 생성자
        Season(String description, int temperature) {
            this.description = description;
            this.temperature = temperature;
        }
        // 게터함수
        public String getDescription() {return description;}
        public int getTemperature(){ return temperature;}


        } // Season enum 함수 종료

    enum TaskStatus{
        PENDING{
            @Override
            public TaskStatus nextStatus(){
                System.out.println("현재상태는 PENDING 입니다.");
                return TaskStatus.IN_PROGRESS;
            }
        },
        IN_PROGRESS{
            @Override
            public TaskStatus nextStatus(){
                System.out.println("현재상태는 IN_PROGRESS 입니다.");
                return TaskStatus.COMPLETED;
            }
        },
        COMPLETED{
            @Override
            public TaskStatus nextStatus(){
                System.out.println("현재상태는 COMPLETED 입니다.");
                return TaskStatus.ARCHIVED;
            }

        },
        ARCHIVED{
            @Override
            public TaskStatus nextStatus(){
                System.out.println("현재상태는 ARCHIVED 입니다.");
                return TaskStatus.PENDING;
            }
        };

        public abstract TaskStatus nextStatus();

//        private final String status;
//
//        public String getStatus(){
//            return status;
//        }

    }// TaskStatus enum 종료

    enum Operator{
        ADD("+"){
            public int calculate(int a, int b){
                return a + b;
            }
        },
        SUBTRACT("-"){
            public int calculate(int a, int b){
                return a - b;
            }
        },
        MULTIPLY("*"){
            public int calculate(int a, int b){
                return a * b;
            }
        },
        DIVIDE("/"){
            public int calculate(int a, int b){
                return a / b;
            }
        };

        private final String symbol;

        Operator(String symbol){
            this.symbol = symbol;
        }

        public abstract int calculate(int a, int b);

    }//Operator enum 종료

    } // enumlab 클래스 종료


