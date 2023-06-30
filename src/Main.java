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
    public static void checkYearsAndOS (int clientOS, int clientDeviceYear ) {
        int currentYear = LocalDate.now().getYear();
        int androidOS =1, iOS=0;
        if(clientOS==androidOS&&clientDeviceYear>=currentYear){
            System.out.println("Установите приложения для Android по ссылке");
        } else if (clientOS==androidOS&&clientDeviceYear<currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS==iOS&&clientDeviceYear>=currentYear) {
            System.out.println("Установите приложения для iOS по ссылке");
        } else if (clientOS==iOS&&clientDeviceYear<currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else {System.out.println("Ваша операционная система не поддерживаеться");}

    }
    private static void task2() {
        System.out.println("задача 2");
        checkYearsAndOS(1,2018);
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