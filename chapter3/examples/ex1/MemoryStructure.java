package chapter3.examples.ex1;

/**
 * 자바의 메모리 구조(스택, 힙, 메소드 영역) 예제
 */
public class MemoryStructure {
    // 클래스 변수(static 변수) - 메소드 영역에 저장
    static int staticVariable = 100;
    
    // 인스턴스 변수 (= 필드) - 힙 영역에 저장
    int instanceVariable = 200;
    
    public static void main(String[] args) {
        // 지역 변수 - 스택에 저장
        int localVariable = 300;
        System.out.println("지역 변수(스택): " + localVariable); // 접근 가능
        System.out.println("클래스 변수(메소드 영역): " + staticVariable); // 접근 가능
        
        // 객체 생성 - 참조 변수는 스택에, 객체(값)는 힙에 저장
        MemoryStructure obj = new MemoryStructure();
        System.out.println("인스턴스 변수(힙): " + obj.instanceVariable); // 객체를 생성한 뒤 인스턴스 변수 접근은 가능함. (단, private가 아닐 경우)
//        System.out.println("인스턴스 변수(힙): " + instanceVariable); // 이렇게 인스턴스 변수에는 바로 접근이 불가능함


        // 기본 타입(Primitive Type) vs 참조 타입(Reference Type)
        System.out.println("\n===== 기본 타입 vs 참조 타입 =====");
        
        int primitiveA = 10;
        int primitiveB = primitiveA; // 값 복사
        primitiveB = 20; // primitiveA에 영향 없음
        
        System.out.println("primitiveA: " + primitiveA); // 10 출력
        System.out.println("primitiveB: " + primitiveB); // 20 출력
        
        Person personA = new Person("John"); // 객체 생성
        Person personB = personA; // 참조 복사 (같은 객체를 가리킴)
        personB.setName("Elon"); // personA에도 영향 -> 주소값 복사이기때문

        // person A & B -> 스택, 값 -> 힙

        System.out.println("personA의 이름: " + personA.getName()); // Elon 출력
        System.out.println("personB의 이름: " + personB.getName()); // Elon 출력
        
        // 메소드 호출 시 매개변수 전달 방식
        System.out.println("\n===== 매개변수 전달 방식 =====");
        
        int number = 10;
        System.out.println("메소드 호출 전 number: " + number);
        changeValue(number); // 값에 의한 전달 (Call by Value)
        System.out.println("메소드 호출 후 number: " + number); // 변경 없음
        
        Person person = new Person("John");
        System.out.println("메소드 호출 전 person 이름: " + person.getName());
        changeName(person); // 참조에 의한 전달 (Call by Reference)
        System.out.println("메소드 호출 후 person 이름: " + person.getName()); // 변경됨
        
        // 가비지 컬렉션(Garbage Collection) 예제
        System.out.println("\n===== 가비지 컬렉션 =====");
        Person p1 = new Person("가비지 1");
        Person p2 = new Person("가비지 2");
        
        System.out.println("p1: " + p1.getName());
        System.out.println("p2: " + p2.getName());

        // null 은 사용하지 않는다는 뜻.
        p1 = null; // p1이 가리키던 객체는 접근 불가 (가비지가 됨) : 버려지는 시점은 모름. 가비지컬렉터가 알아서 삭제해줌
        p2 = null; // p2가 가리키던 객체는 접근 불가 (가비지가 됨)

        // System.out.println("p1: " + p1.getName());
        // System.out.println("p2: " + p2.getName());

        System.out.println("가비지 컬렉션 대상이 된 객체들은 나중에 메모리에서 해제됩니다.");
    }
    
    // 값 (int value)에 의한 전달(Call by Value) 예제
    public static void changeValue(int value) {
        value = 20; // 이 변경은 호출한 쪽의 변수에 영향을 주지 않음
        System.out.println("메소드 내부 value: " + value);
    }
    
    // 참조(Person p)에 의한 전달(Call by Reference) 예제
    public static void changeName(Person p) {
        p.setName("Jeff"); // 이 변경은 호출한 쪽의 객체에 영향을 줌 -> 주소값을 변경한 것
        System.out.println("메소드 내부 person 이름: " + p.getName());
    }
}

// Person 클래스 정의
class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
} 