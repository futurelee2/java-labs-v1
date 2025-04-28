package chapter1.labs.lab4;

/**
 * Lab 4: 자바 연산자 실습
 * 
 * 이 실습은 자바의 다양한 연산자를 이해하고 활용하는 것을 목표로 합니다.
 */
public class OperatorsLab {
    public static void main(String[] args) {
        // TODO: 1. 산술 연산자 사용하기
        // 두 개의 정수형 변수를 선언하고 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산을 수행하세요.
        int a = 10;
        byte b = 20;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a%b;
        int g = a/b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);


        
        // TODO: 2. 증감 연산자 사용하기
        // 변수를 선언하고 전위 증가, 후위 증가, 전위 감소, 후위 감소 연산을 수행하세요.
        // 각 단계별로 변수의 값을 출력하여 변화를 확인하세요.
        int A = 5;
        System.out.println("a++ : " + A++); //5
        System.out.println("++a : " + ++A); //7
        System.out.println("a-- : " + A--); //7
        System.out.println("--a : " + --A); //5


        
        // TODO: 3. 비교 연산자 사용하기
        // 두 변수를 비교하여 결과를 출력하세요 (==, !=, >, <, >=, <=).
        int 변수a = 5;
        byte 변수b =10;
        System.out.println(변수a==변수b);
        System.out.println(변수a!=변수b);
        System.out.println(변수a>변수b);
        System.out.println(변수a<변수b);
        System.out.println(변수a>=변수b);
        System.out.println(변수a<=변수b);

        
        // TODO: 4. 논리 연산자 사용하기
        // boolean 변수를 사용하여 AND(&&), OR(||), NOT(!) 연산을 수행하세요.
        boolean bool_a = true;
        boolean bool_b = false;
        System.out.println("a&&b :" + (bool_a&&bool_b));
        System.out.println("a&&b :" + (bool_a||bool_b));
        System.out.println("!a :" + (!bool_a)); //반전
        System.out.println("!b :" + (!bool_b));



        // TODO: 5. 대입 연산자 사용하기
        // 변수를 선언하고 복합 대입 연산자(+=, -=, *=, /=, %=)를 사용하여 값을 변경하세요.
        byte 변수c = 10;
        변수c+=5;
        int 변수d= 변수c;
        변수d-=5;
        System.out.println("+=" + 변수c);
        System.out.println("-=" + 변수d);
        System.out.println("*=" + (변수c*=2));
        System.out.println("*=" + (변수c/=2));
        System.out.println("*=" + (변수c%=2));


//        Integer aWrapper = Integer.valueOf(변수c);
//        if (aWrapper instanceof Integer) {
//            System.out.println("a는 Integer 타입입니다.");
//        }


        // TODO: 6. 삼항 연산자 사용하기
        // 조건에 따라 다른 값을 할당하는 예제를 작성하세요.
        
        byte 변수x = 10;
        Integer aWrapper = Integer.valueOf(변수x);
        if (aWrapper instanceof Integer) {
            System.out.println("변수x는 int 타입입니다");
        }
        else {
            System.out.println("변수x 는 byte입니다");
        }

    }
} 