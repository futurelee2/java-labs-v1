package chapter1.labs.lab3;

/**
 * Lab 3: 자바 타입 변환(Type Casting) 실습
 * 
 * 이 실습은 자바의 타입 변환에 대해 이해하고 실습하는 것을 목표로 합니다.
 */
public class TypeCastingLab {
    public static void main(String[] args) {
        // TODO: 1. 자동 형변환(Implicit Casting) 예제
        // byte -> int, int -> long, long -> float, float -> double 순으로 
        // 변수를 선언하고 자동 형변환을 수행한 뒤 결과 출력하기
        byte A = 10;
        int B = A;
        long C = B;
        float D = C;
        double E = D;
        System.out.println("E"+E);
        
        // TODO: 2. 명시적 형변환(Explicit Casting) 예제
        // double -> float -> long -> int -> char -> short -> byte 순으로
        // 변수를 선언하고 명시적 형변환을 수행한 뒤 결과 출력하기

        double a = 10.3488;
        float b = (float) a;
        long c = (long) b;
        int d = (int) c;
        char e = (char) d;
        short f = (short) e;
        byte g = (byte) f;
        
        // TODO: 3. 데이터 손실 확인하기
        // int 값을 byte로 변환하여 데이터 손실이 발생하는 예제 작성하기
        int loss = 300;
        byte loss_int = (byte) loss;
        System.out.println("loss_int " + loss_int);
        
        // TODO: 4. 문자열과 숫자 간 변환하기
        // 문자열 "123"을 정수로, "3.14"를 실수로 변환하기
        String number = "123";
        int numberInt = Integer.parseInt(number);
        System.out.println("numberInt " + numberInt);

        String num_str = "3.14";
        double num_int = Double.parseDouble(num_str);
        System.out.println("num_int " + num_int);


        // TODO: 5. 숫자를 문자열로 변환하기
        // 정수 456과 실수 7.89를 문자열로 변환하기
        String str1 = Integer.toString(456);
        String str2 = Double.toString(7.89);

        System.out.println("str1 " + str1);
        System.out.println("str2 " + str2);

    }
} 