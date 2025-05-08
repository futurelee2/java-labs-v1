package chapter4.labs.lab3;

/**
 * Lab 3: static과 final 키워드 사용하기
 * 
 * final 키워드 예제 클래스
 */
public class FinalExample {
    // TODO: final 변수를 선언하고 초기화하세요.
    final int a = 1;
    
    // TODO: final 변수를 선언만 하고, 생성자에서 초기화하세요.
    final int b;
    
    // TODO: 생성자를 정의하세요.
    public FinalExample(int b) {
        // final 변수 초기화
        this.b = b;
    }
    
    // TODO: final 메소드를 정의하세요.
    public final void finalMethod(){
        System.out.println("final 메서드");
    }
    
    
    // TODO: final 매개변수를 받는 메소드를 정의하세요.

    public final void finalMethod2(int a, int b){
        System.out.println("final 메서드 2" +" a : " + a + " b :" + b);
    }


    public static void main(String[] args) {
        System.out.println("Final 키워드 예제를 실행합니다.");
        
        // TODO: FinalExample 객체를 생성하세요.
        FinalExample finalExample = new FinalExample(10);
        
        // TODO: 객체의 메소드를 호출하세요.
        finalExample.finalMethod();
        finalExample.finalMethod2(10, 20);

        // TODO: final 클래스의 객체를 생성하고 메소드를 호출하세요.
        FinalExam2 finalexam2 = new FinalExam2();
        
        // TODO: final 지역 변수를 선언하고 사용하세요.
         int localnum2 = finalexam2.getLocal();
         System.out.println("지역 변수 : " + localnum2);

    }
};

// TODO: final 클래스를 정의하세요.
final class FinalExam2 {
    int c = 40;

    public int exam2Method() {
        final int localNum = 10;
        System.out.println("finalExam2 메서드");
        return localNum;
    }

    public int getLocal(){
        int localnum = exam2Method();
        return localnum;
        }
    } // 클래스 종료
    

// TODO: 일반 클래스와 하위 클래스를 정의하고, final 메소드 오버라이딩을 시도해보세요.
class Animal{
    int anInt = 10;

    final void aniMethod(){
        System.out.println("Animal : " + anInt);
    }

}

//class Dog extends Animal{
//    @Override
//    void aniMethod(){
//        System.out.println("dog : " + anInt);
//    }
//}
//


