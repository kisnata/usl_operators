public class Main {
    public static void main(String[] args) {
//task 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
//task 2
        int productionYear = 2015;
        int deviceYear = 2018;
        if (deviceYear < productionYear) {
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.print("Установите версию приложения для ");
        }

         if (clientOS == 1) {
            System.out.println("Android по ссылке");
        } else {
            System.out.println("iOS по ссылке");
        }
//task 3
        int year = 2020;
         if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
             System.out.println(year + " Год является високосным");
         } else {
             System.out.println("Год не является високосным");
         }
//task 4
        int deliveryDistance = 95;
         int deliveryDays = 1;
         int interval = 40;
         int startInterval = 20;
         if (deliveryDistance <= startInterval) {
             deliveryDays = 1;
         } else {
             deliveryDays = deliveryDays + (int) Math.ceil ((deliveryDistance - startInterval) / (double) interval);
         }
        System.out.println("Потребуется дней:" + deliveryDays);
//task 5
        int monthNumber = 4;
        switch (monthNumber) {
        case 1:
        case 2:
        case 12:
        System.out.println("Зима");
        break;
        case 3:
        case 4:
        case 5:
        System.out.println("Весна");
        break;
        case 6:
        case 7:
        case 8:
        System.out.println("Лето");
        break;
        case 9:
        case 10:
        case 11:
        System.out.println("Осень");
        break;
        default:
        System.out.println("Такого месяца не существует");
        }

    }
}





