public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1.1");
        for( int i = 0; i <= 10; i ++) {
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Задание 1.2");

        for ( int i = 10; i >= 0; i --) {
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Задание 1.3");

        for ( int i = 0; i < 17; i +=2){
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Задание 1.4");

        for (int i = 10; i >= -10; i --) {
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Задание 2.1");

        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + "год является високосным");
            }
        }

        System.out.println("");
        System.out.println("Задание 2.2");

        for (int i = 7; i <= 98; i+=7) {
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Задание 2.3");

        for ( int i = 1; i <= 512; i*=2) {
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Задание 3.1");

        int cash = 29000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += cash;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum + " рублей");
        }

        System.out.println("");
        System.out.println("Задание 3.2");

        double sumPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumPercent = (sumPercent + cash) * (1 + percent);
            System.out.println("Месяц " + i + " сумма накоплений равна " + sumPercent + " рублей");
        }




    }
}