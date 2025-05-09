package chapter6.labs.lab3;

/**
 * 은행 계좌 클래스
 * 
 * 계좌 정보와 잔액을 관리하는 클래스입니다.
 */
public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    
    /**
     * 생성자
     * @param accountNumber 계좌번호
     * @param ownerName 예금주 이름
     * @param initialBalance 초기 잔액
     */
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    
    /**
     * 계좌번호 반환
     * @return 계좌번호
     */
    public String getAccountNumber() {
        return accountNumber;
    }
    
    /**
     * 예금주 이름 반환
     * @return 예금주 이름
     */
    public String getOwnerName() {
        return ownerName;
    }
    
    /**
     * 현재 잔액 반환
     * @return 현재 잔액
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * 입금 메소드
     * @param amount 입금액
     * @throws IllegalArgumentException 입금액이 0 이하인 경우
     */
    public void deposit(double amount) throws IllegalArgumentException {
        // TODO: 입금액이 0 이하인 경우 IllegalArgumentException을 발생시키세요.
        // TODO: 유효한 입금액인 경우 잔액을 증가시키세요.

        if(amount > 0){
            balance+=amount;
        }else{
            throw new IllegalArgumentException("입금액 0 이하 입니다. 돈 넣으세용"); // 자바 표준 클래스 예외 (매개값을 이상하게 줬다는 예외)
        }
    }
    
    /**
     * 출금 메소드
     * @param amount 출금액
     * @throws IllegalArgumentException 출금액이 0 이하인 경우
     * @throws InsufficientBalanceException 잔액이 부족한 경우
     */
    public void withdraw(double amount) throws IllegalArgumentException, InsufficientBalanceException {
        // TODO: 출금액이 0 이하인 경우 IllegalArgumentException을 발생시키세요.
        // TODO: 출금액이 잔액보다 큰 경우 InsufficientBalanceException을 발생시키세요.
        // TODO: 유효한 출금액인 경우 잔액을 감소시키세요.


        if (amount <= 0) {
            throw new IllegalArgumentException("출금액 0 이하 입니다아아아");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("출금 금액 부족", amount, balance); // 커스텀 예외 => this.balance 로 적어줘도 됨
        } else {
            balance -= amount;
        }
    }
    
    /**
     * 계좌 정보 문자열 반환
     */
    @Override
    public String toString() { // 상위클래스에서 String 값 반환하기때문에 void 안됨
        return "계좌번호: " + accountNumber + ", 예금주: " + ownerName + ", 잔액: " + balance + "원";
    }
}

