import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {   task1();
        task2();
        task3();
        }
    public static int checkLeapYear(int year ) {
       if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
           year = 1;
       }
       return year;
    }
    public static int checkOS (int clientOS) {
        int iOS = 0, android = 1;
        if (clientOS ==android){
            clientOS=1;
        }else if (clientOS==iOS){
            clientOS=0;
        }
        return clientOS;
    }
    public static int checkYearPhone (int yearPhone){
        int currentYear = LocalDate.now().getYear();
        if (yearPhone==currentYear){
            yearPhone=1;
        }else {yearPhone=0;}
        return yearPhone;
    }
    private static void task1() {
        System.out.println("задача 1");
        int year = 2000;
        int leapYears = checkLeapYear(year);
        if (leapYears == 1) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год неявляется високосным");
        }

    }
    private static void task2() {
        System.out.println("задача 2");
        int clientOS = 0, clientDeviceYear = 2023;
        int phoneOS = checkOS(clientOS);
        int yearPhone = checkYearPhone(clientDeviceYear);
        if (phoneOS==1&&yearPhone==1) {
            System.out.println("Установите приложения для Android по ссылке");
        } else if (phoneOS==1&&yearPhone!=1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (phoneOS==0&&yearPhone==1) {
            System.out.println("Установите приложения для iOS по ссылке");
        } else if (phoneOS==0&&yearPhone==0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else{
            System.out.println("Ваша операционная система не поддерживаеться");
        }
    }
    private static int checkDeliveryDay (int distance){
        int day = 0;
        if (distance<20) {
             day ++;
        } else if (20<=distance&&distance<60) {
             day +=2;
        } else if (60<=distance&&distance<=100) {
            day +=3;
        }else {
            day+=4;
        }
        return day;
    }
    private static void task3() {
        System.out.println("задача 3");
        int deliveryDistance = 60;
        int deliverydays = checkDeliveryDay(deliveryDistance);
        if(deliverydays<=3){
            System.out.println("Потребуется дней: " + (deliverydays));
        }else {
            System.out.println("доставки нет");}

        }
}