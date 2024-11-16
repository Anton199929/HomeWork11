//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void definitionLeadYear(int desiredYear) {
        if (desiredYear % 4 == 0 && desiredYear % 100 != 0 || desiredYear % 400 == 0){
            System.out.println(desiredYear + " год - високосный год");
        } else {
            System.out.println(desiredYear + " год - невисокосный год");
        }
    }

    public static void determinationVersionSystem(int currentYear, int operatingSystem) {
        if (currentYear == 0 && operatingSystem < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (currentYear == 0 && operatingSystem >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (currentYear == 1 && operatingSystem < 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        } else if (currentYear == 1 && operatingSystem >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int findOutDeliveryTime(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days += 1;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days += 2;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
        return days;

    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int desiredYear = 2025;
        definitionLeadYear(desiredYear);
    }

    public static void task2() {
        int operatingSystem = 0;
        int currentYear = 2021;
        determinationVersionSystem(operatingSystem, currentYear);
    }

    public static void task3() {
        int deliveryDistance = 95;
        findOutDeliveryTime(deliveryDistance);

    }
}