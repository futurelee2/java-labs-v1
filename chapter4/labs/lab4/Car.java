package chapter4.labs.lab4;

/**
 * Lab 4: 접근 제한자와 객체 간 관계 구현하기
 * 
 * Car 클래스 정의하기 (Engine을 포함하는 관계)
 */
public class Car {
    // TODO: 적절한 접근 제한자를 사용하여 필드를 정의하세요.
    // (모델명, 색상, 속도, Engine 타입의 필드 등)

    private String model;
    private String color;
    private int speed;
    private Engine engine; // Car 클래스가 Engine 클래스를 포함한다는 의미.  구성(composition) 관계를 나타냄.
                    // 참조 변수임 (객체의 주소값 저장)

    // TODO: 생성자를 정의하세요.
    // (Engine 객체를 생성하여 포함관계 구현)

    public Car(String model, String color, String type, int horsePower) {
        this.model = model;
        this.color = color;
//        this.speed = speed; // 없어도 되나?
        this.engine = new Engine(type, horsePower);
    }


    // TODO: 자동차를 시동하는 메소드를 정의하세요.
    // (내부적으로 Engine 객체의 메소드 호출)
    public void start(){
        engine.start();

    }

    
    
    // TODO: 자동차를 정지하는 메소드를 정의하세요.
    // (내부적으로 Engine 객체의 메소드 호출)
    public void stop(){
        if (speed > 0){
            System.out.println("차를 멈춰야 합니다.");
        }else{
            engine.stop();
        }
    }

    
    // TODO: 자동차의 속도를 증가시키는 메소드를 정의하세요.
    public void accelerate(int amount){
        if(!engine.isRunning()){
            System.out.println("시동이 꺼져있어 작동이 불가합니다.");
        }else {
            speed += amount;
            System.out.println("현재 속도는 " + speed + "입니다.");
        }
    }
    
    
    // TODO: 자동차의 속도를 감소시키는 메소드를 정의하세요.
    public void brake(int amount) {
        if(!engine.isRunning()){
            System.out.println("시동이 꺼져있어 작동이 불가합니다.");
        }else{
            speed -= amount;
            System.out.println("현재 속도는 " + speed + "입니다.");
        }
    }


    
    // TODO: 자동차의 정보를 출력하는 메소드를 정의하세요.
    // (내부적으로 Engine 객체의 정보도 출력)
    public void carInfo(){
        System.out.println("모델명 : " + model);
        System.out.println("색상 : " + color);
        System.out.println("속도 : " + speed);
        engine.engineInfo();

    }

    
    // TODO: 필요한 getter/setter 메소드를 정의하세요.
    public String getModel(){ return model;}

    public void setSpeed(int speed){ this.speed = speed;}

    
} 