package chapter4.labs.lab1;

import java.time.LocalDate;

/**
 * Lab 1: 클래스와 객체 만들기
 * 
 * Person 클래스 정의하기
 */
public class Person {
    // TODO: 이름, 나이, 성별을 저장할 수 있는 필드를 정의하세요.
    String name;
    int age;
    String gender;

//    public static void main(String[] args) {
//        birthCheck(1995, 8, 28);
//    }
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    // TODO: 객체 정보를 출력하는 메소드를 작성하세요.
    public void personInfo() {
        System.out.println("이름:" + name);
        System.out.println("나이:" + age);
        System.out.println("성별:" + gender);
    }


    // TODO: 생일이 지났을 때 나이를 한 살 증가시키는 메소드를 작성하세요.
    public void birthCheck(int month, int day) {
        LocalDate localDate = LocalDate.now();
        int currentMonth = localDate.getMonthValue();
        int currentDay = localDate.getDayOfMonth();

        if(currentMonth > month){
            age+=1;
        }else if (currentMonth==month){
            if(currentDay >= day){
                age+=1;
            }
        }
        System.out.println("나이:"+ age);
    }// birth 메서드

}// class 종료