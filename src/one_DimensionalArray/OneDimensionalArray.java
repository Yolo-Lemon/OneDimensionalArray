package one_DimensionalArray;

import java.util.Arrays;
import java.util.Random;

public class OneDimensionalArray {

    public static void main(String[] args) {
        oneDimensionalTask1();
        oneDimensionalTask2();
        oneDimensionalTask3();
        oneDimensionalTask4();
        oneDimensionalTask5();
        oneDimensionalTask6();
        oneDimensionalTask7();
        oneDimensionalTask8();
        oneDimensionalTask9();
        oneDimensionalTask10();
        oneDimensionalTask11();
        oneDimensionalTask12();
        oneDimensionalTask13();
        oneDimensionalTask14();
        oneDimensionalTask15();
        oneDimensionalTask16();
        oneDimensionalTask17();
        oneDimensionalTask18();
        oneDimensionalTask19();
        oneDimensionalTask20();
        oneDimensionalTask21();
        oneDimensionalTask22();
        oneDimensionalTask23();
        oneDimensionalTask24();
    }

    //Заполнить массив нулями и единицами, при этом данные значения чередуются, начиная с нуля.
    private static void oneDimensionalTask1() {
        int[] nums = new int[5];
        for (int index = 0; index < nums.length; index++) {
            if (index % 2 == 0) {
                nums[index] = 0;
            } else {
                nums[index] = 1;
            }
        }
        System.out.println("Task1: " + Arrays.toString(nums));
        System.out.println();
    }

    //Заполнить массив последовательными нечетными числами, начиная с единицы.
    private static void oneDimensionalTask2() {
        int[] nums = new int[7];
        int counter = 1;
        for (int index = 0; index < nums.length; index++) {
            if (index == 0) {
                nums[index] = 1;
            } else {
                counter += 2;
                nums[index] = counter;
                ;
            }
        }
        System.out.println("Task2: " + Arrays.toString(nums));
        System.out.println();
    }

    //Создать массив, каждый элемент которого равен квадрату своего индекса.
    private static void oneDimensionalTask3() {
        double[] nums = new double[10];
        for (int index = 0; index < nums.length; index++) {
            nums[index] = Math.pow(index, 2);
        }
        System.out.println("Task3: " + Arrays.toString(nums));
        System.out.println();
    }

    //Заполните массив простыми числами от 2 до 100.
    private static void oneDimensionalTask4() {
        int[] nums = new int[30];
        int index = 0;
        for (int i = 2; i < 100; i++) {
            boolean primeNum = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNum = false;
                    break;
                }
            }
            if (primeNum == true) {
                nums[index] = i;
                index++;
            }
        }
        System.out.println("Task4: " + Arrays.toString(nums));
        System.out.println();
    }

    //Сформировать возрастающий массив из четных чисел.
    private static void oneDimensionalTask5() {
        int[] nums = new int[7];
        int counter = 2;
        for (int index = 0; index < nums.length; index++) {
            if (index == 0) {
                nums[index] = 2;
            } else {
                counter += 2;
                nums[index] = counter;
            }
        }
        System.out.println("Task5: " + Arrays.toString(nums));
        System.out.println();
    }

    //Сформировать убывающий массив из чисел, которые делятся на 3.
    private static void oneDimensionalTask6() {
        int[] nums = new int[10];
        int startNum = 51;
        for (int index = 0; index < nums.length; index++) {
            for (int k = startNum; k > 0; k--) {
                if (k % 3 == 0) {
                    nums[index] = k;
                    startNum -= 3;
                    break;
                }
            }
        }
        System.out.println("Task6: " + Arrays.toString(nums));
        System.out.println();
    }

    //Сформировать массив из случайных целых чисел от 0 до 9 , в котором единиц от 3 до 5 и двоек больше троек.
    private static void oneDimensionalTask7() {
        int[] nums = new int[10];
        int numb = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int index = 0;; index++) {

            if (index == nums.length) {
                index -= 9;
                count1 = 0;
                count2 = 0;
                count3 = 0;
            }
            numb = new Random().nextInt(0, 9);

            switch (numb) {
                case 1: {
                    count1++;
                    break;
                }
                case 2: {
                    count2++;
                    break;
                }
                case 3: {
                    count3++;
                    break;
                }
                default: {
                }
            }
            nums[index] = numb;
            if (count1 >= 3 && count1 <= 5 && count2 > count3) {
                break;
            }
        }
        System.out.println("Task7: " + Arrays.toString(nums));
        System.out.println();
    }

    //Определить закономерность, согласно которой формируется числовая последовательность 1, 0, 2, 0, 3, 0, 4… 
    //Написать функцию, которая формирует первые N элементов данной последовательности в виде целочисленного массива и выводит элементы массива на экран.
    private static void oneDimensionalTask8() {
        int[] nums = new int[12];
        int startNum = 1;
        int k = 1;
        for (int index = 0; index < nums.length; index++) {
            if (index == 0) {
                k++;
            } else if (index % 2 == 0) {
                startNum += k;
                k++;
            } else {
                startNum *= 0;
            }
            nums[index] = startNum;
        }
        System.out.println("Task8: " + Arrays.toString(nums));
        System.out.println();
    }

    //Определить закономерность, согласно которой формируется числовая последовательность 
    //1, -4, 9, -16, 25… Написать функцию, которая формирует первые N элементов данной последовательности в виде целочисленного массива и выводит элементы массива на экран.

    private static void oneDimensionalTask9() {
        int[] nums = new int[12];
        int startNum = 0;
        int num1 = 1;
        int num2 = -4;
        int l = 1;
        for (int index = 0; index < nums.length; index++) {
            if (index == 0) {
                startNum = num1;
            } else if (index == 1) {
                startNum = num2;
            } else if (index % 2 == 0) {
                num1 += 8 * l;
                l++;
                startNum = num1;
            } else {
                num2 *= num2 * (-1);
                startNum = num2;
            }
            nums[index] = startNum;
        }
        System.out.println("Task9: " + Arrays.toString(nums));
        System.out.println();
    }

    //Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение. 
    //Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
    private static void oneDimensionalTask10() {
        double[] nums = new double[6];
        double numb = 0;
        double min = 1;
        double max = 0;
        double middle = 0;
        for (int index = 0; index < nums.length; index++) {
            numb = Math.random();
            nums[index] = numb;
            middle += nums[index];
            if (max < nums[index]) {
                max = nums[index];
            }
            if (min > nums[index]) {
                min = nums[index];
            }
        }
        middle = middle / nums.length;

        System.out.println("Task10: " + Arrays.toString(nums));
        System.out.println("Task10: " + "max = " + max + " min = " + min + " middle = " + middle);
        System.out.println();
    }

    //Определить, содержит ли массив заданное число Х.
    private static void oneDimensionalTask11() {
        int[] nums = new int[10];
        int x = 1;
        int numb = 0;
        int foundIndex;
        for (int index = 0; index < nums.length; index++) {
            numb = new Random().nextInt(0, 9);
            nums[index] = numb;
        }
        Arrays.sort(nums);
        System.out.println("Task11: " + Arrays.toString(nums));
        foundIndex = Arrays.binarySearch(nums, x);
        if (foundIndex < 0) {
            System.out.println("Task11: Заданного числа \"" + x + "\" нет в массиве");
            System.out.println();
        } else {
            System.out.println("Task11: индекс искомого числа \"" + x + "\" = " + foundIndex);
            System.out.println();
        }
    }

    //Найдите сумму четных чисел массива.
    private static void oneDimensionalTask12() {
        int[] nums = new int[10];
        int numb = 0;
        int summ = 0;
        for (int index = 0; index < nums.length; index++) {
            numb = new Random().nextInt(0, 5);
            nums[index] = numb;
            if (numb % 2 == 0) {
                summ += numb;
            }
        }
        System.out.println("Task12: " + Arrays.toString(nums));
        System.out.println("Task12: Сумма четных чисел = " + summ);
        System.out.println();
    }

    //Найдите сумму нечетных чисел массива, которые не превосходят 11.
    private static void oneDimensionalTask13() {
        int[] nums = new int[10];
        int numb = 0;
        int summ = 0;
        for (int index = 0; index < nums.length; index++) {
            numb = new Random().nextInt(0, 15);
            nums[index] = numb;
            if (numb % 2 != 0 && numb <= 11) {
                summ += numb;
            }
        }
        System.out.println("Task13: " + Arrays.toString(nums));
        System.out.println("Task13: Сумма нечетных чисел не превышающих 11  = " + summ);
        System.out.println();
    }

    //Найдите сумму чисел массива, которые стоят на четных местах.
    private static void oneDimensionalTask14() {
        int[] nums = new int[10];
        int numb = 0;
        int summ = 0;
        for (int index = 0; index < nums.length; index++) {
            numb = new Random().nextInt(0, 10);
            nums[index] = numb;
            if (index % 2 != 0) {
                summ += numb;
            }
        }
        System.out.println("Task14: " + Arrays.toString(nums));
        System.out.println("Task14: Сумма чисел массива, которые стоят на четных местах  = " + summ);
        System.out.println();
    }

    //Дан массив x из n элементов. Найдите x1−x2+x3−…−xn−1+xn. &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    private static void oneDimensionalTask15() {
        int[] nums = new int[20];
        int numb = 0;
        int result = 0;
        for (int index = 0; index < nums.length; index++) {
            numb = new Random().nextInt(0, 10);
            nums[index] = numb;
            if (index % 2 == 0) {
                result += nums[index];
            } else {
                result -= nums[index];
            }
        }
        System.out.println("Task15: " + Arrays.toString(nums));
        System.out.println("Task15: Результат  = " + result);
        System.out.println();
    }

    //Переставить элементы массива в обратном порядке. С использованием Arrays и без него.
    private static void oneDimensionalTask16() {
        int[] nums = new int[10];
        int[] numsReverse = new int[10];
        int numb = 0;
        int copy = nums.length - 1;
        int t = 0;
        for (int index = 0; index < nums.length; index++) {
            numb = new Random().nextInt(0, 10);
            nums[index] = numb;
        }
        for (int index = 0; index < numsReverse.length; index++) {
            numb = nums[copy];
            numsReverse[index] = numb;
            copy--;
        }
        System.out.println("Task16:  " + Arrays.toString(nums));
        System.out.println("Task16: инвертирован через второй цикл " + Arrays.toString(numsReverse));

        for (int index1 = 0, index2 = nums.length - 1; index1 < nums.length / 2; index1++, index2--) {
            t = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = t;
        }
        System.out.println("Task16: инвертирован через переменную " + Arrays.toString(nums));
        System.out.println();
    }

    //Дан целочисленный массив размера N. Преобразовать его, прибавив к четным числам последний элемент. Последний элемент массива не изменять.
    private static void oneDimensionalTask17() {
        int[] nums = new int[15];
        int numb = 0;
        for (int index = 0; index < nums.length; index++) {
            numb = new Random().nextInt(0, 10);
            nums[index] = numb;
        }
        System.out.println("Task17: " + Arrays.toString(nums));
        for (int index = 0; index < nums.length - 1; index++) {
            if (index % 2 == 0) {
                continue;
            } else {
                nums[index] += nums[nums.length - 1];
            }
        }
        System.out.println("Task17: " + Arrays.toString(nums));
        System.out.println();
    }

    //Задан массив a размера n. Необходимо посчитать количество уникальных элементов в данном массиве. Элемент называется уникальным, если встречается в массиве ровно один раз.
    private static void oneDimensionalTask18() {
        int[] nums = new int[10];
        int numb = 0;
        int hitCounter = 0;
        int counter = 0;
        int result = 0;
        for (int index = 0; index < nums.length; index++) {
            numb = new Random().nextInt(0, 10);
            nums[index] = numb;
        }
        for (int index = 0; index < nums.length; index++) {
            counter++;
            for (int k = index + 1; k < nums.length; k++) {
                if (nums[index] == nums[k]) {
                    hitCounter++;
                    break;
                }
            }
            result = counter - hitCounter;
        }
        System.out.println("Task18: " + Arrays.toString(nums));
        System.out.println("Task18: количество уникальных элементов в масиве " + result);
        System.out.println();
    }

    //В массиве заменить все числа, большие данного числа Х, на среднее арифметическое всех чисел массива.
    private static void oneDimensionalTask19() {
        int[] nums = new int[10];
        int numb = 0;
        int x = 5;
        int summ = 0;
        for (int index = 0; index < nums.length; index++) {
            numb = new Random().nextInt(0, 10);
            nums[index] = numb;
            summ += numb;
        }
        System.out.println("Task19: " + Arrays.toString(nums));
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > x) {
                nums[index] = summ / nums.length;
            }
        }
        System.out.println("Task19: " + Arrays.toString(nums));
        System.out.println();
    }

    //Поменять местами наибольший и наименьший элементы массива.
    private static void oneDimensionalTask20() {
        int[] nums = new int[6];
        int numb = 0;
        int min = 101;
        int max = 0;
        int indexMax = 0;
        int indexMin = 0;
        int z = 0;
        for (int index = 0; index < nums.length; index++) {
            numb = new Random().nextInt(0, 100);
            nums[index] = numb;
            if (max < nums[index]) {
                max = nums[index];
                indexMax = index;
            }
            if (min > nums[index]) {
                min = nums[index];
                indexMin = index;
            }
        }
        System.out.println("Task20: " + Arrays.toString(nums));
        z = nums[indexMin];
        nums[indexMin] = nums[indexMax];
        nums[indexMax] = z;
        System.out.println("Task20: " + Arrays.toString(nums));
        System.out.println();
    }

    //Заменить каждый элемент массива с четным номером на соседний слева элемент.
    private static void oneDimensionalTask21() {
        int[] nums = new int[10];
        int numb = 0;
        for (int index = 0; index < nums.length; index++) {
            numb = new Random().nextInt(0, 10);
            nums[index] = numb;
        }
        System.out.println("Task21: " + Arrays.toString(nums));
        for (int index = 0; index < nums.length; index++) {
            if (index % 2 != 0) {
                nums[index] = nums[index - 1];
            }
        }
        System.out.println("Task21: " + Arrays.toString(nums));
        System.out.println();
    }

    //В данном массиве найдите количество чисел, соседи у которых отличаются более чем в 2 раза.
    private static void oneDimensionalTask22() {
        int[] nums = new int[10];
        int numb = 0;
        int counter = 0;
        for (int index = 0; index < nums.length; index++) {
            numb = new Random().nextInt(0, 100);
            nums[index] = numb;
        }
        for (int index = 0; index < nums.length; index++) {
            if (index == 0) {
                if (nums[index] * 2 < nums[index + 1] || nums[index] / 2 > nums[index + 1]) {
                    counter++;
                }
            } else if (index == nums.length - 1) {
                if (nums[index] * 2 < nums[index - 1] || nums[index] / 2 > nums[index - 1]) {
                    counter++;
                }
            } else {
                if ((nums[index] * 2 < nums[index + 1] || nums[index] / 2 > nums[index + 1])
                        && (nums[index] * 2 < nums[index - 1] && nums[index] / 2 > nums[index - 1])) {
                    counter++;
                }
            }
        }
        System.out.println("Task22: " + Arrays.toString(nums));
        System.out.println("Task22: " + counter);
        System.out.println();
    }

    //Даны два массива A и B размера 5, элементы которых упорядочены по возрастанию. Объединить эти массивы так, чтобы результирующий массив остался упорядоченным.
    private static void oneDimensionalTask23() {
        int[] nums1 = new int[5];
        int[] nums2 = new int[5];
        for (int index = 0, numb = 1; index < nums1.length; index++) {
            nums1[index] = numb;
            numb += 2;
        }
        for (int index = 0, numb = 0; index < nums2.length; index++) {
            nums2[index] = numb;
            numb += 2;
        }
        int nums3[] = Arrays.copyOf(nums1, nums1.length + nums2.length);
        for (int index = nums1.length, index2 = 0; index < nums3.length; index++) {
            nums3[index] = nums2[index2];
            index2++;
        }
        Arrays.sort(nums3);
        System.out.println("Task23: " + Arrays.toString(nums1));
        System.out.println("Task23: " + Arrays.toString(nums2));
        System.out.println("Task23: " + Arrays.toString(nums3));
        System.out.println();
    }

    //Удалить самый маленький элемент массива.
    private static void oneDimensionalTask24() {
        int[] nums = new int[10];
        int[] nums1 = new int[nums.length - 1];
        int numb = 0;
        int min = 101;
        int indexMin = 0;
        for (int index = 0; index < nums.length; index++) {
            numb = new Random().nextInt(0, 100);
            nums[index] = numb;
            if (min > nums[index]) {
                min = nums[index];
                indexMin = index;
            }
        }
        for (int index = 0; index < nums1.length; index++) {
            if (index < indexMin) {
                nums1[index] = nums[index];
            } else if (index >= indexMin) {
                nums1[index] = nums[index + 1];
            }
        }
        System.out.println("Task24: " + Arrays.toString(nums));
        System.out.println("Task24: " + Arrays.toString(nums1));
        System.out.println("");
    }
}
