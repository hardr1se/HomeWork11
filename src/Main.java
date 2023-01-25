public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задание 1");
        int year = 2021;
        isYearLeap(year);
    }
    public static void isYearLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static void task2() {
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        int mobileModel = 1; // 0 - IOS, 1 - Android
        mobileAppHelper(clientDeviceYear, mobileModel);
    }
    public static void mobileAppHelper(int clientDeviceYear, int mobileModel) {
        if (clientDeviceYear < 2015) {
            if (mobileModel == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (mobileModel == 0) {
                System.out.println("Установите приложение для iOS по ссылке");
            } else {
                System.out.println("Установите приложение для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        durationOfDelivery(deliveryDistance);
    }
    public static void durationOfDelivery(int deliveryDistance) {
        int i = 0;
        if (deliveryDistance < 20 && deliveryDistance >= 0) {
            i++;
            System.out.println("Потребутся дней: " + i);
        } else if (deliveryDistance < 60 && deliveryDistance >= 20) {
            i += 2;
            System.out.println("Потребутся дней: " + i);
        } else if (deliveryDistance < 100 && deliveryDistance >= 60) {
            i += 3;
            System.out.println("Потребутся дней: " + i);
        } else {
            System.out.println("Доставки нет");
        }
    }
}