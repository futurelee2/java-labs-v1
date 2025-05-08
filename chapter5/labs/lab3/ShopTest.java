package chapter5.labs.lab3;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * 인터페이스 구현과 다형성을 테스트하는 클래스입니다.
 */
public class ShopTest {
    public static void main(String[] args) {
        System.out.println("Lab 3: 인터페이스 활용하기 실습");
        
        // TODO: Book 객체 생성
        Book book = new Book("자바",20000, "이미래");
        
        // TODO: Electronics 객체 생성
        Electronics phone = new Electronics("아이폰",2000000, "10X");
        
        // TODO: DiscountedBook 객체 생성
        DiscountedBook discountedBook = new DiscountedBook("자바스프링", 10000,"이미래",20);

        // TODO: ShoppingCart 객체 생성
        ShoppingCart shopping = new ShoppingCart();
        
        // TODO: 장바구니에 상품 추가하기
        shopping.ShoppingAdd(book);
        shopping.ShoppingAdd(phone);
        shopping.ShoppingAdd(discountedBook);

        
        // TODO: 장바구니 내용과 총액 출력하기
        shopping.ShoppingList();
        shopping.ShoppingTotal();


        // TODO: 인터페이스를 활용한 다형성 테스트
        //       - Buyable 타입 배열에 다양한 상품 담기
        //       - 모든 상품의 정보 출력하기
        
        
        // TODO: Discountable 인터페이스를 구현한 객체만 별도로 처리하기


        
    }
} 