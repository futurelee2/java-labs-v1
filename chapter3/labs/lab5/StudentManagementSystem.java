package chapter3.labs.lab5;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 학생 성적 관리 프로그램 (종합 프로젝트)
 */
public class StudentManagementSystem {
    // TODO: 학생 성적 등급을 나타내는 Grade Enum을 정의하세요.
    // A(90-100), B(80-89), C(70-79), D(60-69), F(0-59) 등급이 있어야 합니다.

    enum Grade {
        // A(90-100), B(80-89), C(70-79), D(60-69), F(0-59) 등급이 있어야 합니다.
        A(90, 100),
        B(80, 89),
        C(70, 79),
        D(60, 69),
        F(0, 59);

        private final int min_score;
        private final int max_score;

        Grade(int min_score, int max_score) {
            this.min_score = min_score;
            this.max_score = max_score;
        }
    }

    // 최대 학생 수
    private static final int MAX_STUDENTS = 100;

    // 학생 정보 배열
    private static String[] names = new String[MAX_STUDENTS]; // 이름 배열
    private static int[] scores = new int[MAX_STUDENTS]; // 성적 배열
    private static int studentCount = 0; // 현재 저장된 학생 수

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("===== 학생 성적 관리 프로그램 =====");

        while (running) {
            printMenu();
            int choice = getMenuChoice(scanner);

            switch (choice) {
                case 1:
                    // TODO: 성적 입력 기능을 구현하세요.
                    // 학생 이름과 성적을 입력받아 배열에 저장합니다.
                    System.out.println("===== 이름을 입력하시오.=====");
                    String name = scanner.nextLine();
                    System.out.println("===== 성적을 입력하시오.=====");
                    int score = scanner.nextInt();
                    names[studentCount] = name;
                    scores[studentCount] = score;
                    studentCount++;
                    break;

                case 2:
                    // TODO: 성적 수정 기능을 구현하세요.
                    // 학생 이름을 입력받아 해당 학생의 성적을 수정합니다.
                    System.out.println("===== 이름을 입력하시오.=====");
                    String re_name = scanner.nextLine();
                    System.out.println("===== 수정할 성적을 입력하시오.=====");
                    int re_score = scanner.nextInt();

                    int index = findindex(re_name);
                    scores[index] = re_score;

                    break;

                case 3:
                    // TODO: 성적 조회 기능을 구현하세요.
                    // 모든 학생의 이름, 성적, 등급을 출력합니다.
                    // 전체 성적의 합계, 평균, 최고 성적, 최저 성적도 출력합니다.

                    String[] grades = new String[MAX_STUDENTS];
                    for (int i = 0; i < studentCount; i++) {
                        grades[i] = grade_calculate(scores[i]);
                    }

                    System.out.println("names :" + Arrays.toString(names));
                    System.out.println("scores :" + Arrays.toString(scores));
                    System.out.println("grades :" + Arrays.toString(grades));
                    IntSummaryStatistics stats = summary(scores);
                    System.out.println("sum :" + stats.getSum());
                    System.out.println("avg :" + stats.getAverage());
                    System.out.println("max :" + stats.getMax());
                    System.out.println("min :" + stats.getMin());

                    break;

                case 4:
                    // TODO: 검색 기능을 구현하세요.
                    // 학생 이름을 입력받아 해당 학생의 성적과 등급을 조회합니다.
                    System.out.println("===== 이름을 입력하시오.=====");
                    String search_name = scanner.nextLine();
                    int index2 = findindex(search_name);
                    int search_score = scores[index2];
                    String search_grade = grade_calculate(search_score);

                    System.out.println("성적 :" + search_score);
                    System.out.println("등급 :" + search_grade);
                    break;

                case 5:
                    // TODO: 통계 기능을 구현하세요.
                    // 등급별 학생 수와 비율을 출력합니다.
                    String[] grades_2 = new String[MAX_STUDENTS];
                    for (int i = 0; i < studentCount; i++) {
                        grades_2[i] = grade_calculate(scores[i]);
                    }

                    // 비율계산 방법 다시 공부하기
                    Map<String, Long> frequencyMap = Arrays.stream(grades_2)
                            .filter(s -> s != null && !s.isEmpty())
                            .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

                    long total = frequencyMap.values().stream().mapToLong(Long::longValue).sum();

                    frequencyMap.forEach((key, value) -> {
                        double ratio = (value * 100.0) / total;
                        System.out.printf("'%s': %d개 (비율: %.2f%%)\n", key, value, ratio);
                    });
                    break;


                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
                    break;
            }
        }

        scanner.close();
    } // main 종료

    // 메뉴 출력 메소드
    private static void printMenu() {
        System.out.println("\n===== 메뉴 =====");
        System.out.println("1. 성적 입력");
        System.out.println("2. 성적 수정");
        System.out.println("3. 성적 조회");
        System.out.println("4. 학생 검색");
        System.out.println("5. 통계 보기");
        System.out.println("6. 종료");
        System.out.print("메뉴를 선택하세요: ");
    }

    // 메뉴 선택 입력 메소드
    private static int getMenuChoice(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); // 버퍼 비우기
            return -1; // 잘못된 입력
        } finally {
            scanner.nextLine(); // 버퍼 비우기
        }
    }


    // TODO: 성적으로부터 등급을 계산하는 메소드를 구현하세요.
    // 입력받은 성적에 따라 Grade Enum 상수를 반환합니다.

    private static String grade_calculate(int score) {
//        Scanner scanner = new Scanner(System.in);
//        int score = scanner.nextInt();
        for (Grade g : Grade.values()) {
            if (score >= g.min_score && score <= g.max_score) {
                return g.name();
            }
        }
//        return Grade.F; // 이거는 Grade 타입 / 열거형 상수값
        return Grade.F.name();  // 이거는 문자형으로 반환 (열거형 상수의 이름의 문자형 타입 String 형태)
    }

    ;


    // TODO: 전체 성적의 합계를 계산하는 메소드를 구현하세요.
    // TODO: 전체 성적의 평균을 계산하는 메소드를 구현하세요.
    // TODO: 최고 성적을 찾는 메소드를 구현하세요.
    // TODO: 최저 성적을 찾는 메소드를 구현하세요.

    public static IntSummaryStatistics summary(int[] scores){
        return Arrays.stream(scores).summaryStatistics();
    }


    // TODO: 학생 이름으로 배열에서 위치(인덱스)를 찾는 메소드를 구현하세요.
    private static int findindex(String name) {
        for (int i = 0; i < studentCount; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    };
}

