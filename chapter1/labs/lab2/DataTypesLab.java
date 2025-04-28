package chapter1.labs.lab2;

import java.security.KeyStore;

/**
 * Lab 2: 자바 데이터 타입 실습
 * 
 * 이 실습은 자바의 기본 데이터 타입을 이해하고 사용하는 것을 목표로 합니다.
 */
public class DataTypesLab {
    public static void main(String[] args) {
        // TODO: 다음 기본 데이터 타입의 변수를 선언하고 값을 할당하세요.
        // 1. 정수형(byte, short, int, long) 변수 선언 및 할당
        byte A = 10;
        short B = 30;
        int C = 50;
        long D = 60000475L;
        
        // TODO: 2. 실수형(float, double) 변수 선언 및 할당
        float E = 70.25f;
        double F = 70.486;

        // TODO: 3. 문자형(char) 변수 선언 및 할당
        char G = 'M';
        
        // TODO: 4. 논리형(boolean) 변수 선언 및 할당
        boolean H = true;

        
        // TODO: 5. 모든 변수 값을 출력하세요.

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(G);
        System.out.println(H);

        
        // TODO: 6. 자신의 키(cm)와 몸무게(kg)를 저장하는 변수를 선언하고 
        // BMI 지수를 계산하여 출력하세요. (BMI = 몸무게(kg) / (키(m) * 키(m)))
        float 몸무게 =  45;
        float 키 = 164;
        float 키미터 = 키/100;
        float BMI = 몸무게/(키미터*키미터);
        System.out.println("나의 BMI 지수는 :" + BMI);


    }
} 