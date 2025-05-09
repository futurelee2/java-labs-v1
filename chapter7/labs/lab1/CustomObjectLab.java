package chapter7.labs.lab1;


import java.util.*;

/**
 * Object 클래스의 메소드를 오버라이딩하는 실습
 * 
 * 이 실습에서는 Java의 Object 클래스에서 제공하는 기본 메소드를 오버라이딩하여
 * 커스텀 클래스의 동작을 정의하는 방법을 학습합니다.
 * - equals(): 객체의 동등성 비교
 * - hashCode(): 객체의 해시 코드 생성
 * - toString(): 객체의 문자열 표현
 */
public class CustomObjectLab {
    public static void main(String[] args) {
        // TODO: Book 객체를 세 개 생성하세요.
        // book1, book2는 동일한 ISBN을 가진 책
        // book3는 다른 ISBN을 가진 책
        Book book1 = new Book("1001","제목1","저자1",10000);
        Book book2 = new Book("1001","제목2","저자2",10000);
        Book book3 = new Book("1002","제목3","저자3",10000);


        // TODO: equals() 메소드 테스트
        // book1과 book2, book1과 book3, book1과 null, book1과 다른 타입 객체를 비교하세요.
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));

        System.out.println(book1.equals(null));
        Object book4 = new Book("1003","제목3","저자3",10000);
        System.out.println(book1.equals(book4));

        // TODO: toString() 메소드 테스트
        // 각 Book 객체의 toString() 메소드 호출 결과를 출력하세요.
        System.out.println(book1.toString()); // toString 생략 가능
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());



        // TODO: hashCode() 메소드 테스트
        // 각 Book 객체의 해시코드를 출력하고, book1과 book2의 해시코드가 같은지 확인하세요.
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());



        // TODO: HashMap에서 Book 객체를 키로 사용하는 예제 코드를 작성하세요.
        // 1. HashMap<Book, String> 생성
        // 2. book1과 book3를 키로 하여 값 저장
        // 3. book1, book2, book3로 값 조회 시도
        Map<Book,String> books = new HashMap<>();

        books.put(book1,book1.getTitle());
        books.put(book3,book3.getTitle());


        System.out.println(books.get(book1));
        System.out.println(books.get(book2)); // X -> 내부적으로 hashCode() -> equals() 를 사용함
        System.out.println(books.get(book3));

        
        // TODO: ArrayList에서 Book 객체의 존재 여부를 확인하는 예제 코드를 작성하세요.
        // 1. ArrayList<Book> 생성
        // 2. book1과 book3를 리스트에 추가
        // 3. book1, book2, book3가 리스트에 존재하는지 확인
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book3);

        System.out.println(bookList.contains(book1));
        System.out.println(bookList.contains(book2)); // X > 내부적으로 equals() 만 사용함
        System.out.println(bookList.contains(book3));


    }
}

/**
 * Object 클래스의 주요 메소드를 오버라이딩할 Book 클래스입니다.
 */
class Book {
    // TODO: ISBN, 제목, 저자, 가격 필드를 선언하세요.
    String id;
    String title;
    String author;
    int price;

    // TODO: 모든 필드를 초기화하는 생성자를 작성하세요.
    public Book(String id, String title, String author, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // TODO: 필요한 Getter 메소드를 작성하세요.
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    // TODO: equals() 메소드를 오버라이딩하여 ISBN이 같으면 동일한 책으로 판단하도록 구현하세요.
    // equals 메소드 구현 시 다음 사항을 고려하세요:
    // 1. 참조가 동일한지 확인 (this == obj)
    // 2. null 체크 및 타입 비교 (obj != null && getClass() == obj.getClass())
    // 3. 적절한 형변환 후 필드 비교
    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true; // this.equals(obj)
        if(obj == null || getClass () != obj.getClass()) // getClass : 클래스 타입 , 왼쪽은 현개 객체의 클래스 타입으로 this.getClass로 사용해도 됨
            return false;

        Book book = (Book) obj;
//        return id.equals(book.id);
        return Objects.equals(id, book.id);
    }


    // TODO: hashCode() 메소드를 오버라이딩하여 equals와 일관되게 동작하도록 구현하세요.
    // ISBN이 같은 객체는 동일한 해시코드를 반환해야 합니다.
    // java.util.Objects.hash() 메소드를 활용하세요.

    public int hashCode() {
        return Objects.hash(id);
//        return id; // int 인 경우 이렇게 해도 됨
    }



    // TODO: toString() 메소드를 오버라이딩하여 Book 객체의 모든 필드 정보를 포함한 문자열을 반환하세요.
    @Override
    public String toString() {
        return "id : " + id + ", title : " + title + ", author : " + author + ", price : " + price;
    }
} 