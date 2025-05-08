package chapter5.labs.lab3;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * Buyable 인터페이스를 정의하세요.
 * 이 인터페이스는 구매 가능한 상품이 가져야 할 메소드를 선언합니다.
 */
public interface Buyable {
    // TODO: 상품의 가격을 반환하는 메소드 선언
    int price();

    
    // TODO: 상품의 이름을 반환하는 메소드 선언
    String name();
    
    // TODO: 상품 정보를 출력하는 default 메소드 구현
    default String info(){
        return "상품 이름 :" +  name() + " 상품 가격 :" + price();
    };
} 