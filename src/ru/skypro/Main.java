package ru.skypro;


public class Main {
    //    //  задание 1
    public static void printYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

    public static void main(String[] args) {
        printYear(2023);
        getClientOS("ios");
        currentYear(2022);
        distance(105);
        exampleMean("abccddefgghiijjkk");
        replace();

    }

    //    //    задание 2
    public static void getClientOS(String name) {
        if (name.equals("ios")) {
            System.out.println(name + " у вас €блоко");
        } else {
            System.out.println(name + " у вас R2D2");
        }
    }

    public static void currentYear(int date) {
        if (date <= 2021) {
            System.out.println("Ќа дворе " + date + " установите облегченную версию приложени€");
        } else {
            System.out.println("Ќа дворе " + date + " установите обычную версию приложени€");
        }
    }

    //        задание 3
    public static void distance(int km) {
        int deliveryDay = 1;
        if (km <= 20) {
            System.out.println("ѕотребуетс€ " + deliveryDay + " день дл€ доставки ");
        } else if (km >= 21 && km <= 60) {
            System.out.println("ѕотребуетс€ " + deliveryDay * 2 + " дн€ дл€ доставки");
        } else if (km >= 61 && km <= 100) {
            System.out.println("ѕотребуетс€ " + deliveryDay * 3 + " дн€ дл€ доставки");
        } else {
            System.out.println("“ы свою посылку не получишь ");
        }
    }

    //    задание 4
    public static void exampleMean(String mean) {
        int exampleLength = mean.length();
        for (int i = 0; i < exampleLength - 1; i++) {
            if (mean.charAt(i) == mean.charAt(i + 1))
                System.out.println(mean.charAt(i));
        }
    }

    //    задание 5
    public static void replace () {
        int[] numbers = {3, 2, 1, 6, 5};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
        }
    }
}