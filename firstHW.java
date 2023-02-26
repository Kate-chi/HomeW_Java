import java.util.Random;
import java.util.ArrayList;

public class firstHW
{
    //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    public static int randNum()
    {
        int i = new Random().nextInt(0, 2001);
        return i;
    }

    //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    public static int seniorBit(int a)
    {
        int n = Integer.toBinaryString(a).length();
        return n;
    }

    //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    public static ArrayList<Integer> multiplesMax(int i, int n)
    {
        ArrayList<Integer> m1 = new ArrayList<Integer>();
        for (int j = i; j <= Short.MAX_VALUE; j++) 
        {
            if (j % n == 0) 
            {
                m1.add(j);
            }
        }
        return m1;
    }

    //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    public static ArrayList<Integer> noMultiplesMin(int i, int n)
    {
        ArrayList<Integer> m2 = new ArrayList<Integer>();
        for (int j = i; j >= Short.MIN_VALUE; j--) 
        {
            if (j % n != 0) 
            {
                m2.add(j);
            }
        }
        return m2;
    }

    public static void main(String[] args) 
    {
        int i = randNum();
        int n = seniorBit(randNum());
        
        System.out.println("Рандомное число: " + i);
        System.out.println("Номер старшего бита: " + n);
        //System.out.println("Кратные числа: " + multiplesMax(i, n));
        //System.out.println("Некратные числа: " + noMultiplesMin(i, n));
        System.out.println("Всего кратных: " + multiplesMax(i, n).size());
        System.out.println("Всего некратных: " + noMultiplesMin(i, n).size());
    }
}