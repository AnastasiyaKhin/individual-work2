import phone.Phone;
import test.math.Geometry;
import utils.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        // генерирую массив случайных чисел
        int[] nums = RandomData.generateArray();
        System.out.println(Arrays.toString(nums));

        // Задача 2
        // возвращаю true если число четное, иначе false
        boolean even = Check.isOdd(4);
        System.out.println(even);

        // возвращаю true если число делится на 3, иначе false
        boolean multipleThree = Check.isDevidedByThree(6);
        System.out.println(multipleThree);

        // возвращаю true если число делится и на 5 и на 7

        boolean multiple = Check.isDevidedByFiveAndSeven(35);
        System.out.println(multiple);

        // Задача 3
        // Возвращаю мах значение из рандомных элементов массива
        int max = Calculate.getMax(nums);
        System.out.println(max);

        // Возвращаю мin значение из рандомных элементов массива
        int min = Calculate.getMin(nums);
        System.out.println(min);

        // Возвращаю сумму элементов массива из рандомных элементов массива
        int sum = Calculate.getSumOfArrayElements(nums);
        System.out.println(Calculate.getSumOfArrayElements(nums));

        // Возвращаю среднее значение мах, мин и суммы элементов массива

        double result = Calculate.getEverage(max, min, sum);
        System.out.println(result);

        // Задача 4
        // Возврат времени с учетом окончаний слов
        String time = MyTime.getTimeHoursMinutesSeconds(110578);
        System.out.println(time);

        // Задача 5
        // Возврат корней квадратного уравнения в строком формате
        String resulRoots = utils.Geometry.getRoots(1, 1, 1);
        System.out.println(resulRoots);

        // Задача 6
        // возврат гипотенузы по теореме Пифагора из пакета test.math
        int k3 = test.math.Geometry.getHyp(6, 3);
        System.out.println(k3);

        // Задача 7
        // Вывод на консоль треугольника из звездочек
        Printer.printStars();

        // Задача 8
        // Вывод на консоль результата проверки чисел

        Printer.checkNumbers(0, 0, 0);

        // Задача 9
        // Объект 1
        Phone siemens = new Phone();
        siemens.setModel("Сименс");
        siemens.setNumber("A521");
        siemens.setWeight(" 50гр");
        System.out.println(siemens.getModel() + " " + siemens.getNumber() + " " + siemens.getWeight());
        siemens.receiveCall("Вася");
        siemens.receiveCall("Коля ", "524-48-65");
        siemens.getNumber();
        siemens.sendMessage("541-78-86", "245-56-58", "583-369-587");

        // Объект 2
        Phone motorola = new Phone();
        motorola.setModel("Моторола");
        motorola.setNumber("S349");
        motorola.setWeight(" 70гр");
        System.out.println(motorola.getModel() + " " + motorola.getNumber() + " " + motorola.getWeight());
        motorola.receiveCall("Саша");
        motorola.receiveCall("Саша ", "728-93-89");
        motorola.getNumber();
        motorola.sendMessage("541-55-86", "895-56-56", "584-300-577");

        // Объект 3
        Phone samsung = new Phone();
        samsung.setModel("Samsung");
        samsung.setNumber("Q678");
        samsung.setWeight(" 100gr");
        System.out.println(samsung.getModel() + " " + samsung.getNumber() + " " + samsung.getWeight());
        samsung.receiveCall("Вера");
        samsung.receiveCall("Вера ", "+375-29-698-56-89");
        samsung.getNumber();
        samsung.sendMessage("22-15-96", "798-44-00", "01", "999");

    }
}
