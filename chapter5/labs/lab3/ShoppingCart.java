package chapter5.labs.lab3;

import java.util.ArrayList;
import java.util.List;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * ShoppingCart 클래스를 정의하세요.
 * 이 클래스는 Buyable 인터페이스를 구현한 다양한 상품을 담는 장바구니 역할을 합니다.
 */
public class ShoppingCart {
    // TODO: 상품 목록을 저장할 리스트 선언
    List<Buyable> list = new ArrayList<>();
    
    // TODO: 생성자 정의
//    public ShoppingCart(List<Buyable> list) {
//        this.list = list;
//    }

    public ShoppingCart(){}

    // TODO: 장바구니에 상품 추가하는 메소드 구현
    public void ShoppingAdd(Buyable item){
        list.add(item);
    }
    
    // TODO: 장바구니에서 상품 제거하는 메소드 구현
    public void ShoppingRemove(Buyable item){
        list.remove(item);
    }
    
    // TODO: 장바구니의 총 금액을 계산하는 메소드 구현
    public void ShoppingTotal(){
        int total = 0;
        for(Buyable item : list){
            total+=item.price();
        }
        System.out.println("총 금액: "+total);

    }
    
    // TODO: 장바구니 상품 목록을 출력하는 메소드 구현
    public void ShoppingList(){
        for(Buyable item : list){
            System.out.println(item.info());
        }
    }


} 