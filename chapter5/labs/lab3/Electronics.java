package chapter5.labs.lab3;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * Electronics 클래스를 정의하세요.
 * 이 클래스는 Buyable 인터페이스를 구현합니다.
 */
public class Electronics implements Buyable {
    // TODO: 전자제품의 속성 정의 (예: 이름, 가격, 제조사)
    String ElectronicsName;
    int ElectronicsPrice;
    String type;
    
    // TODO: 생성자 정의
    public Electronics(String name, int price, String type){
        this.ElectronicsName = name;
        this.ElectronicsPrice = price;
        this.type = type;
    }
    
    // TODO: Buyable 인터페이스의 메소드 구현

    @Override
    public int price() {
        return ElectronicsPrice;
    }

    @Override
    public String name() {
        return ElectronicsName;
    }

    // TODO: 전자제품만의 고유한 메소드 추가
    public String type(){
        return type;
    }
} 