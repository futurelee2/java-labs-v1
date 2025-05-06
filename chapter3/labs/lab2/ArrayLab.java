package chapter3.labs.lab2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열 활용하기 실습
 */
public class ArrayLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 정수형 배열 활용
        System.out.println("===== 정수형 배열 활용 =====(5개 숫자 입력)");

        // TODO: 5개의 정수를 입력받아 배열에 저장하고, 합계와 평균을 계산하여 출력하세요./
        // 힌트: Scanner를 이용하여 사용자로부터 입력을 받으세요.

        int sum = 0;
        int [] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        System.out.println("합계 :"+sum+" 평균 :"+ sum/numbers.length);



        // 2. 문자열 배열 활용
        System.out.println("\n===== 문자열 배열 활용 =====");

        // TODO: 5개의 이름을 입력받아 배열에 저장하고, 특정 문자(예: 'A')로 시작하는 이름을 검색하여 출력하세요.
        // 힌트: String 클래스의 startsWith() 또는 charAt() 메소드를 활용하세요.

        System.out.println("저장할 단어 5개를 입력하시오.");
        String[] strs = new String[5];

        for (int i = 0; i < strs.length; i++){
            strs[i] = scanner.next();
        }

        System.out.println("검색 단어를 입력하시오.");
        String search = scanner.next();
        for (String str: strs){
            if (str.startsWith(search)){
                System.out.println(str);
            }
        }


        // 3. 배열 정렬
        System.out.println("\n===== 배열 정렬 =====");

        // TODO: 사용자로부터 5개의 정수를 입력받아 배열에 저장한 후, 오름차순으로 정렬하여 출력하세요.
        // 힌트: 이중 반복문을 사용하여 버블 정렬 알고리즘을 구현하거나, Arrays.sort()를 활용하세요.

        int [] numbers3 = new int[5];
        System.out.println("5개 정수를 입력하시오.");
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = scanner.nextInt();}

        System.out.println("오름차순 정렬 전: " + Arrays.toString(numbers3)); // Array.toString 안하게되면 배열의 참조값 (주소값)이 출력됨.
        Arrays.sort(numbers3);
        System.out.println("오름차순 정렬 후: " + Arrays.toString(numbers3));


        // 4. 2차원 배열을 이용한 행렬 덧셈
        System.out.println("\n===== 2차원 배열을 이용한 행렬 덧셈 =====");

        // TODO: 두 개의 2x3 행렬을 입력받아 행렬 덧셈을 수행하고 결과를 출력하세요.
        // 힌트: 중첩 반복문을 사용하세요.

//        System.out.println("5개 정수를 입력하시오.");
        int[][] array_1 = new int[2][3];
        int[][] array_2 = new int[2][3];
        int[][] sum_array = new int[2][3];

        System.out.println("첫번째 행렬의 값을 입력하시오.");
        for (int i=0; i<array_1.length; i++) {
            for (int j = 0; j < array_1[i].length; j++) {
                array_1[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array_1));


        System.out.println("두번째 행렬의 값을 입력하시오.");
        for (int m=0; m<array_2.length; m++){
            for (int n=0; n<array_2[m].length; n++){
                array_2[m][n] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array_2));


        for (int k =0; k<array_1.length; k++){
            for (int l=0; l<array_1[k].length; l++){
                sum_array[k][l] = array_1[k][l] + array_2[k][l];
            }
        }
        System.out.println("두 행렬의 합 : "+ Arrays.deepToString(sum_array));




        // 5. 배열을 이용한 간단한 데이터 분석
        System.out.println("\n===== 배열을 이용한 데이터 분석 =====");

        // TODO: 10개의 정수를 입력받아 배열에 저장한 후, 최댓값, 최솟값, 중앙값(또는 평균)을 계산하여 출력하세요.
        // 힌트: 정렬을 활용하면 중앙값을 쉽게 찾을 수 있습니다.

        int[] array_3 = new int[10];
        System.out.println("10개의 정수를 입력하시오.");

        for (int h=0; h<array_3.length; h++){
            array_3[h] = scanner.nextInt();
        }
//        System.out.println(Arrays.toString(array_3));

        Arrays.sort(array_3);
        System.out.println(Arrays.toString(array_3));

        double median;

        if(array_3.length %2 == 0){
          int med = array_3[array_3.length/2];
          int med1 = array_3[array_3.length/2-1]; // 인덱스 기준
            median = (med + med1) / 2.0;
        }else{
            median = array_3[array_3.length/2];
        }


        System.out.println("최대값 :" + array_3[array_3.length-1]);
        System.out.println("최소값 :" + array_3[0]);
        System.out.println("중앙값 :" + median);

        scanner.close();
    }
}