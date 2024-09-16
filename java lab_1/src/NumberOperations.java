//КМ-33, Сивоконь Валерія, лаб. №1

import java.util.ArrayList;
import java.math.BigDecimal;

public class NumberOperations {
    public static void main(String[] args) {

            //4
        ArrayList<Number> list = new ArrayList<>();
        list.add(10); list.add(20.5); list.add(30); list.add(40.7); list.add(50); list.add(60.3); list.add(70); list.add(80.1); list.add(90); list.add(100.9);

        list.add(5.75f); list.add(new BigDecimal("12345.6789"));
        byte b = 100;
        short s = 1000;
        int i = 100000;
        list.add(b); list.add(s); list.add(i);
        System.out.println("Всі числа: " + list);

            //5
        ArrayList<Double> list2 = new ArrayList<>();
        for (Number num : list) {
            list2.add(num.doubleValue());
        }

        System.out.print("Цілі числа: [");
        for (Double num : list2) {
            System.out.print(String.format("%.0f", num) + "; ");
        } System.out.print("]\n");

            //6
        ArrayList<Double> list3 = new ArrayList<>();
        for (Number num : list) {
            list3.add(num.doubleValue());
        }

        System.out.print("Числа з двома знаками після коми: [");
        for (Double num : list3) {
            System.out.print(String.format("%.2f", num) + "; ");
        } System.out.print("]\n\n");

            //7
        ArrayList<Number> list_a = new ArrayList<>();
        ArrayList<Number> list_b = new ArrayList<>();
        for (Number num : list) {
            if (num instanceof Integer || num instanceof Short || num instanceof Byte)
                list_a.add(num);
            else if (num instanceof Double || num instanceof Float || num instanceof BigDecimal)
                list_b.add(num);
        }
        System.out.println("Лише цілі числа: " + list_a);
        System.out.println("Лише дробові числа: " + list_b);
        System.out.print("\n");

        //Варіант 8
        double sum = 0;
        for (Number num : list) {
            if ((num instanceof Integer) && (num.intValue()>50))
                sum += num.intValue();
            else if ((num instanceof Short) && (num.shortValue()>50))
                sum += num.shortValue();
            else if ((num instanceof Float) && (num.floatValue()>50))
                sum += num.floatValue();
            else if ((num instanceof Byte) && (num.byteValue()>50))
                sum += num.byteValue();
            else if (num instanceof Double && num.doubleValue() > 50)
                sum += num.doubleValue();
            else if ((num instanceof BigDecimal) && (num.doubleValue()>50))
                sum += num.doubleValue();
        }
        System.out.println("Сума чисел більші за 50: " + String.format("%.4f", sum));
    }
}