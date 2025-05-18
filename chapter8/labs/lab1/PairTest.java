package chapter8.labs.lab1;

import static chapter8.labs.lab1.PairUtils.createPair;

/**
 * Lab 1: 제네릭 클래스 구현 테스트
 *
 * Pair 클래스와 PairUtils 클래스의 기능을 테스트합니다.
 */
public class PairTest {
    public static void main(String[] args) {
        System.out.println("=== Pair 클래스 테스트 ===");
        
        // TODO: Pair 클래스의 다양한 타입 매개변수를 사용하여 객체를 생성하고 테스트하세요.
        // Integer와 String 타입의 Pair
        Pair<Integer, String> pair1 = new Pair<>(1, "pair1");

        // Double과 Double 타입의 Pair

        Pair<Double,Double> pair2 = new Pair<>(-0.02, 3.452);
        Pair<Double,Double> pair3 = new Pair<>(-0.02, 3.452);
        Pair<Double,Double> pair4 = new Pair<>(3.14, 23.134);



        // 사용자 정의 클래스를 사용한 Pair
        Pair<Integer, Integer> pair5 =  PairUtils.createPair(1,2);
        Pair<Integer, Integer> pair6 =  PairUtils.create2Pair(1,2);



        System.out.println("\n=== PairUtils 클래스 테스트 ===");
        
        // TODO: PairUtils 클래스의 메소드를 테스트하세요.

        System.out.println(PairUtils.comparePair(pair2,pair3));
        System.out.println(PairUtils.comparePair(pair3,pair4));
        System.out.println(PairUtils.comparePair(pair5,pair6));




        // of 메소드 테스트
        // swap 메소드 테스트
        
        // 숫자 타입의 sum 메소드 테스트
        // 타입 제한 테스트 (Number 하위 클래스만 가능)
        Number number = PairUtils.sumPair(pair2);
        System.out.println("number : "+ number);


        // 와일드카드 메소드 테스트
        PairUtils.allPair(pair1);
    }
} 