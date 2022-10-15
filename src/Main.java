public class Main {
    public static void main(String[] args) {
        //Домашние задание 1
        //Задание 1
        for (byte i=1;i<=10;i++) {
            System.out.println(i);
        }
        //Задание 2
        for (byte i=10;i>0;i--) {
            System.out.println(i);
        }
        //Задание 3
        for (byte i=0;i<=17;i+=2) {
            System.out.println(i);
        }
        //Задание 4
        for (byte i=10;i>=-10;i--) {
            System.out.println(i);
        }
        //Домашнее задание 2
        //Задание 5
        for (int i=1904;i<=2096;i=i+4) {
            System.out.println(i + " год является високосным");
        }
        //Задание 6
        for (int i=7;i<=98;i=i+7) {
            System.out.println(i);
        }
        //Задание 7
        for (byte i=0;i<=9;i++) {
            System.out.println(Math.pow(2, i));
        }
        //Домашнее задание 3
        //Задание 8
        int sum=0;
        for (byte i=1;i<=12;i++) {
            sum=sum+29000;
            System.out.println("Месяц " + i +" сумма накоплений равна " +sum+ " рублей");
        }
        //Задание 9
        double sum1=0;
        for (byte i=0;i<=12;i++) {
            sum1=sum1+(sum1*0.01);
            sum1=sum1+29000;
            System.out.println("Месяц " + i +" сумма накоплений равна " +sum1+ " рублей");
        }

    }
}