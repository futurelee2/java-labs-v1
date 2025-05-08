package chapter4.labs.lab4;

/**
 * Lab 4: 접근 제한자와 객체 간 관계 구현하기
 * 
 * Engine 클래스 정의하기
 */
public class Engine {
    // TODO: 적절한 접근 제한자를 사용하여 필드를 정의하세요.
    // (엔진 타입, 마력, 작동 상태 등)
    private String type;
    private int horsePower; // 마력
    private boolean running; // 작동 상태

    
    // TODO: 생성자를 정의하세요.
    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }
    
    
    // TODO: 엔진을 시작하는 메소드를 정의하세요.
    public void start() {
        if (!running) {
            running = true;
            System.out.println("엔진 시동을 걸었습니다.");
        } else{
            System.out.println("엔진이 이미 가동 중 입니다.");
        }
    }
    
    
    // TODO: 엔진을 정지하는 메소드를 정의하세요.
    public void stop() {
        if (running) {
            running = false;
            System.out.println("엔진을 정지했습니다.");
        } else{
            System.out.println("엔진이 이미 정지해 있습니다.");
        }
    }
    
    
    // TODO: 엔진의 상태를 확인하는 메소드를 정의하세요.
    public boolean isRunning() {
        return running;
    }
    
    
    // TODO: 엔진의 정보를 출력하는 메소드를 정의하세요.
    public void engineInfo() {
        System.out.println("엔진타입 : " + type);
        System.out.println("마력 : " + horsePower);
        System.out.println("작동유무 : " + (running ? "작동": "정지"));
    }
    
    
    // TODO: 필요한 getter/setter 메소드를 정의하세요.

    public String getType() { return type;}
    public int getHorsePower() { return horsePower;}



} 