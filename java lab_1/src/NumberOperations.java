//КМ-33, Сивоконь Валерія, лаб. №1

import java.util.ArrayList;

public class NumberOperations {
    public static void main(String[] args) {

            //4
        ArrayList<Number> list = new ArrayList<>();
        list.add(10); list.add(20.5); list.add(30); list.add(40.7); list.add(50); list.add(60.3); list.add(70); list.add(80.1); list.add(90); list.add(100.9);
        System.out.println("Всі числа: " + list);

            //5
        ArrayList<Number> list2 = new ArrayList<>(list);
        list2.replaceAll(Number::intValue);
        System.out.println("Цілі числа: " + list2);

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
            if (num instanceof Integer)
                list_a.add(num);
            else if (num instanceof Double)
                list_b.add(num);
        }
        System.out.println("Цілі числа: " + list_a);
        System.out.println("Дробові числа: " + list_b);

        //Варіант 8
        float sum = 0;
        for (Double num : list3) {
            if (num > 50) {
                sum += num;}
        }
        System.out.println("Сума чисел більші за 50: " + String.format("%.1f", sum));
    }
}