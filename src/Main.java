public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1() {
        System.out.println("Задача 1");
        System.out.println("Последовательность чисел в заданном промежутке на возрастание:");
        for(int i = 1; i < 11; i++)
           System.out.print(i + " ");
        System.out.println("");
    }
    public static void task2() {
        System.out.println("Задача 2");
        System.out.println("Последовательность чисел на убывание в заданном промежутке:");
        for(int i = 10; i >= 1; i--)
            System.out.print(i + " ");
        System.out.println("");
    }
    public static void task3() {
        System.out.println("Задача 3");
        System.out.println("Последовательность чисел в заданном промежутке, кратных 2:");
        for(int i = 0; i < 18; i = i + 2)
            System.out.print(i + " ");
        System.out.println("");
    }
    public static void task4() {
        System.out.println("Задача 4");
        System.out.println("Последовательность чисел в заданном промежутке:");
        for(int i = 10; i >= -10; i = i - 1)
            System.out.print(i + " ");
        System.out.println("");
    }
    public static void task5() {
        System.out.println("Задача 5");
        System.out.println("Високосные годы в заданном промежутке времени:");
        for(int year = 1904; year <= 2096; year += 4)
            if(year % 4 == 0 || (year % 400 == 0 && year % 100 != 0))
               System.out.print(year + " ");
        System.out.println("");
    }
    public static void task6() {
        System.out.println("Задача 6");
        System.out.println("Последовательность чисел через каждые 7 единиц:");
        for(int i = 7; i <= 98; i = i + 7)
            System.out.print(i + " ");
        System.out.println("");
    }
    public static void task7() {
        System.out.println("Задача 7");
        System.out.println("Последовательность чисел c увеличением в 2 раза:");
        for(int i = 1; i <= 512; i *= 2)
            System.out.print(i + " ");
        System.out.println("");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for(int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ". Сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task9() {
        System.out.println("Задача 9");
        int salary = 29000;
        double total = 0;
        for(int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = (double) total + salary;
            System.out.println("Месяц " + i + ". Сумма накоплений  с 12% годовых равна " + total + " рублей");
        }
    }
    public static void task10() {
        System.out.println("Задача 10");
        for(int i = 1; i <= 10; i++) {
           int sum = 2 * i;
           System.out.println("2 * " + i + " = " + sum);
        }
    }
}