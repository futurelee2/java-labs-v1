package chapter5.labs.lab1;

/**
 * Lab 1: 상속과 메소드 오버라이딩
 * 
 * 여러 도형 객체를 생성하고, 각 도형의 면적을 계산하고 출력하는 테스트 클래스입니다.
 */
public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("Lab 1: 상속과 메소드 오버라이딩 실습");
        
        // TODO: Rectangle 객체 생성
            Rectangle rectangle = new Rectangle("rec", "white", 10,20);
        
        // TODO: Circle 객체 생성
            Circle circle = new Circle("circle", "black",5);

        // TODO: 각 도형의 정보 출력 및 면적 계산
            rectangle.shapeInfo();
            circle.shapeInfo();
        
        // TODO: 배열을 사용하여 여러 Shape 객체 관리하기
            Shape[] shapes = new Shape[2];
            shapes[0] = rectangle;
            shapes[1] = circle;
        
        // TODO: 모든 도형의 면적 합계 계산하기
            int sum = 0;
            int sarea;
            for(Shape shape:shapes){
                sarea = shape.area();
                sum += sarea;
            }
            System.out.println("면적의 합 :"+ sum);

    }
} 