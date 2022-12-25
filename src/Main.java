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
    public static void task1 (){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void task2(){
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
    }
    public static void task3 () {
        for (int i = 2; i <17; i=i+2){
            System.out.println(i);
        }
    }
    public static void task4(){
        for (int i = 10; i > - 11; i--){
            System.out.println(i);
        }
    }
    public static void task5 (){
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }
    public static void task6 () {
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
    }
    public static void task7 () {
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
    }
    public static void task8() {
        int a = 29000;
        int total = 0;
        for (int i = 1; i <13; i++){
            total = total + a;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task9() {
        int a = 29000;
        int total = 0;
        for (int i = 1; i <13; i++){
           total = total + total/100;
            total = total + a;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task10() {
        int a =2;
        for (int i = 1; i < 11; i++){
            int c = a*i;
            System.out.println(a + "*" + i + "=" + c);
        }
    }
        }

