import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] mas;//объявляется переменная типа массив с именем mas
        int mas1[];

        //Сразу после создания массива, его элемнты инициализируются значениями по умолчанию.
        //В данном случае - 0
        int[] ints = new int[5];

        //Обращение к элементам массива
        System.out.println(ints[4]);

        //Cоздание массива, с его одновременной инициализацией
        int[] mas2 = new int[]{3, 2, 1};
        //альтернативный вариант
        int[] mas3 = {4, 5, 6};

        System.out.println(mas3.length);
        mas3 = new int[]{1, 2, 3};

        int[][] mas4 = new int[5][5];//двумерный массив
        int[][][] mas5 = new int[5][5][5];//трехмерный массив

        mas4[2][1] = 3;

        int[][] mas6 = new int [3][];
        mas6[0] = new int[4];


        //Пример вывода значений массива
        int[] numbers = new int[] {4,3,2,1};

        //Вывод каждого значения в консоль
        for (int number : numbers) {
            System.out.println(number);
        }

        //Вывод содержимого массива в консоль
        System.out.println(Arrays.toString(numbers));

        //System.arraycopy(src, srcPos, dest, destPos, length)
        //src - откуда копировать
        //dest - куда копировать
        //length - кол-во копируемых элементов
        //srcPos - индекс, с которого начинать копирование
        //destPos - индекс, в который начать копирование
        int[] src = new int[] {1,2,3,4,5};
        int[] dest = new int[] {5,4,3,2,1};
        int length = 3;
        int srcIndex = 1;
        int destIndex = 2;
        System.arraycopy(src, srcIndex, dest, destIndex, length);
        System.out.println(Arrays.toString(dest));

        //Пример вывода в консоль, содержимого многомерного массива
        String[][] objects = new String[3][3];
        String content = Arrays.deepToString(objects);
        System.out.println(content);

        //заполнение массива одинаковыми значениями
        boolean[] test1 = new boolean[3];
        Arrays.fill(test1, true);

        int[] mas7 = new int[10];
        int startIndex = 1;
        int endIndex = 4;
        Arrays.fill(mas7, startIndex, endIndex, 2);

        //сортировка массива
        int[] mas8 = new int[] {3,1,4,5,2};
        Arrays.sort(mas8);
        System.out.println(Arrays.toString(mas8));

        Integer[] mas9 = new Integer[] {3,1,4,6,2};
        Arrays.sort(mas9, Collections.reverseOrder());
        System.out.println(Arrays.toString(mas9));

        //Поэлементное сравнение массивов
        int[] mas10 = {1,2,3};
        int[] mas11 = {1,2,3};
        boolean isEqual = Arrays.equals(mas10, mas11);
        System.out.println(isEqual);

        //Поиск значения по массиву
        int index = Arrays.binarySearch(mas11, 3);
        System.out.println(index);


        //------------------------------------------------------

        //Строки

        //Создание строки
        String name = "Вася";
        System.out.println(name);
        name = "";

        String name1 = new String("Вася");
        name1 = new String();

        //Преобразование числа в строку
        int num = 10;
        String value = String.valueOf(num);
        value = String.valueOf(0.5);
        value = String.valueOf(true);

        //%a - шестнадцатиричное значение с плавающей точкой
        //%b - булево значение
        //%c - символьное представление
        String result = String.format("Жили у бабуси %d веселых гуся", 2);
        System.out.println(result);

    }
}
