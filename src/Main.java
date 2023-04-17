public class Main {
    public static void main(String[] args) {
        task1();task2();task3();task4();task5();task6();task7();task8();task9(); task10();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        for(int i = 1; i <= 10; i++){
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        for(int i = 10; i >= 1; i--){
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Четные от 0 до 17 " + i);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }


    public static void task5 () {
        System.out.println("Задача 5");
        for (int i = 1904 ; i <= 2096 ; i = i + 4) {
        //if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0))
                System.out.println(i + " год является високосным");

        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        for (int i = 7 ; i <= 100 ; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        for (int i = 1 ; i <= 1000 ; i = i *2) {
            System.out.println(i);
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int invest = 29_000;
        int deposit = 0;
        for (int i = 1 ; i <= 12 ; i++) {
            deposit = deposit + invest;
            System.out.println("месяц " + i + " - в копилке " + deposit);
        }
    }

    public static void task9 () {
        System.out.println("Задача 9");
        int invest = 29_000;
        int deposit = 0;
        for (int i = 1 ; i <= 12 ; i++) {
            deposit = (deposit + deposit/100) + invest;
            System.out.println("Месяц " + i + "," + " сумма накоплений равна " + deposit + " рублеймесяц ");
        }
    }

    public static void task10 () {
        System.out.println("Задача 10");
        int two = 2;
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println(two + " * " + i + " = " + two*i);
        }
    }
}