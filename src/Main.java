import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {   task1();
        task2();
        task3();
        }
    public static boolean checkLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    private static void task1() {
        System.out.println("задача 1");
        int year = 2023;
        boolean leapYears = checkLeapYear(year);
        if (leapYears) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год неявляется високосным");
        }

    }
    public static int checkYearsAndOS (int clientOS, int clientDeviceYear ) {
        int currentYear = LocalDate.now().getYear();
        int androidOS =1, iOS=0;
        if(clientOS==androidOS&&clientDeviceYear>=currentYear){
           return 1;
        } else if (clientOS==androidOS&&clientDeviceYear<currentYear) {
            return 2;
        } else if (clientOS==iOS&&clientDeviceYear>=currentYear) {
            return 3;
        } else if (clientOS==iOS&&clientDeviceYear<currentYear) {
            return 4;
        }else {return -1;}
    }
    private static void task2() {
        System.out.println("задача 2");
        int clientOs = 3;
        int clientDeviceYear= 2021;
        int versionApplication= checkYearsAndOS(clientOs,clientDeviceYear);
        //названия переменных в коде и методы не обязанны совпадать.
        if (versionApplication==1){
            System.out.println("Установите приложение для Android по ссылке");
        } else if (versionApplication==2) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (versionApplication==3) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (versionApplication==4) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else{
            System.out.println("Ваша операционная система не поддерживаеться");}

    }
    private static int checkDeliveryDay (int distance){
        if (distance<20) {
             return 1;
        } else if (20<=distance&&distance<60) {
             return 2;
        } else if (60<=distance&&distance<=100) {
            return 3;
        }else {
            return 4;
        }
    }
    private static void task3() {
        System.out.println("задача 3");
        int deliveryDistance = 47;
        int deliveryDay = checkDeliveryDay(deliveryDistance);
        if(deliveryDay<=3){
            System.out.println("Потребуется дней: " + (deliveryDay));
        }else {
            System.out.println("доставки нет");}

        }
}