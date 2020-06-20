package ru.geekbrains;

public class Main {

    public static void main(String[] args) {

        // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        // Numeric types
        int a = 1;
        short b = 2;
        long c = 3;
        float d = 4;
        double f = 5.6;

        // Character types
        char g = 'A';
        String str = "This is \"Hello World\" string";

        // Boolean types
        boolean isFlag = false;

        
    }

    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int SomeMathFunc(int a, int b, int c, int d) {

        int result = a * (b + (c/d));
        return result;
    }

    // 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean isIntervalValid(int a, int b) {

        return ((a + b) >= 10 || ((a + b) <= 20));
    }

    // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void printSign(int a) {
        if (a >= 0) {
            System.out.println("Число \t" + a + "\tполодительное");
        } else {
            System.out.println("Число \t" + a + "\tотрицательное");
        }
    }

    // 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean isAboveZero(int a) {

        return (a >= 0);
    }

    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void GreteengsUser(String name) {
        System.out.printf("Привет, %s", name);
    }

    // 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void LeapYear(int year) {

        if ((year % 4 == 0) || (year % 100 != 0)) {
            System.out.println("Год " + year + " = високосный");
        } else if ((year % 400 == 0) || (year % 100 != 0)) {
            System.out.println("Год " + year + " = високосный");
        } else {
            System.out.println("Год " + year + " = не високосный");
        }
    }

}
