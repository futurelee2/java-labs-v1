package chapter2.labs.lab5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 별표(*) 패턴 출력 실습
 */
public class StarPatternLab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("패턴 출력을 위한 높이를 입력하세요: ");
        int height = scanner.nextInt();
        
        // 1. 직각삼각형 패턴 (왼쪽 정렬)
        System.out.println("\n1. 직각삼각형 패턴 (왼쪽 정렬)");
        // 예시 (높이 5):
        // *
        // **
        // ***
        // ****
        // *****


        // TODO: 위와 같은 패턴을 출력하세요.
        for (int i = 1; i <= height; i++){
            System.out.println("*".repeat(i));
        }

        
        // 2. 직각삼각형 패턴 (오른쪽 정렬)
        System.out.println("\n2. 직각삼각형 패턴 (오른쪽 정렬)");
        // 예시 (높이 5):
        //     *
        //    **
        //   ***
        //  ****
        // *****
        
        // TODO: 위와 같은 패턴을 출력하세요.

        for (int i = 1; i <= height; i++){
            System.out.printf("%" + height + "s%n", "*".repeat(i));
        }

        
        // 3. 피라미드 패턴
        System.out.println("\n3. 피라미드 패턴");
        // 예시 (높이 5):
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        
        // TODO: 위와 같은 패턴을 출력하세요.
        // 방법1
//        int star = 1;
//        for (int i = 1; i <= height; i++){
//            int set = height-i;
//            System.out.println(" ".repeat(set)+"*".repeat(star));
//            star +=2;
//        }

        // 방법2
        for (int i =0; i < height; i++){
            int spaces = height -i -1;
            int stars = 2*i + 1;
            System.out.println(" ".repeat(spaces)+"*".repeat(stars));
        }

        
        // 4. 역삼각형 패턴
        System.out.println("\n4. 역삼각형 패턴");
        // 예시 (높이 5):
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        
        // TODO: 위와 같은 패턴을 출력하세요.
        // 방법1
//        for (int i = height; i >= 1; --i){
//            int star2 = 2*i -1;
//            int set = height - i;
//            System.out.println(" ".repeat(set)+"*".repeat(star2));
//        }

        // 방법2
        int spaces1 = 0;
        for (int i = height; i > 0; --i){
            int stars1 = 2*i-1;
            System.out.println(" ".repeat(spaces1)+"*".repeat(stars1));
            spaces1++;
        }


        // 5. 다이아몬드 패턴
        System.out.println("\n5. 다이아몬드 패턴");
        // 예시 (높이 5, 실제 높이는 9):
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        
        // TODO: 위와 같은 패턴을 출력하세요.
        // 방법1
//        int star3 = 1;
//        for (int i = 1; i <= height; i++){
//            int set = height-i;
//            System.out.println(" ".repeat(set)+"*".repeat(star3));
//            star3 +=2;
//        }
//
//        if (height %2 ==0){
//            height = height-2;
//        } else{
//            height = height -1;
//        }
//        for (int i = height; i >= 1; --i){
//            int star4 = 2*i -1;
//            int set = height - i;
//            System.out.println(" ".repeat(set)+"*".repeat(star4));
//        }

        for (int i =0; i < height; i++){
            int spaces2 = height -i -1;
            int stars2 = 2*i + 1;
            System.out.println(" ".repeat(spaces2)+"*".repeat(stars2));
        }
        for (int i = height-1; i > 0; --i){
            int spaces3 = height -i;
            int stars3 = 2*i-1;
            System.out.println(" ".repeat(spaces3)+"*".repeat(stars3));
        }



        // 6. 모래시계 패턴
        System.out.println("\n6. 모래시계 패턴");
        // 예시 (높이 5, 실제 높이는 9):
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        
        // TODO: 위와 같은 패턴을 출력하세요.
        // 방법1
//        for (int i = height; i >= 1; --i){
//            int star5 = 2*i -1;
//            int set = height - i;
//            System.out.println(" ".repeat(set)+"*".repeat(star5));
//        }
//        int star6 = 3;
//        for (int i = 2; i <= height; i++){
//            int set = height-i;
//            System.out.println(" ".repeat(set)+"*".repeat(star6));
//            star6 +=2;
//        }
        for (int i = height; i > 0; --i){
            int spaces4 = height -i;
            int stars4 = 2*i-1;
            System.out.println(" ".repeat(spaces4)+"*".repeat(stars4));
        }
        for (int i =1; i < height; i++){
            int spaces5 = height -i -1;
            int stars5 = 2*i + 1;
            System.out.println(" ".repeat(spaces5)+"*".repeat(stars5));
        }



        // 7. 숫자 피라미드 패턴
        System.out.println("\n7. 숫자 피라미드 패턴");
        // 예시 (높이 5):
        //     1
        //    121
        //   12321
        //  1234321
        // 123454321
        
        // TODO: 위와 같은 패턴을 출력하세요.
        for (int i = 1; i <= height; i++) {
            // 1. 공백 출력
            System.out.print(" ".repeat(height - i));

            // 2. 왼쪽 숫자: 1부터 i까지
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // 3. 오른쪽 숫자: i-1부터 1까지
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // 4. 줄 바꿈
            System.out.println();
        }

        
        scanner.close();
    }
} 