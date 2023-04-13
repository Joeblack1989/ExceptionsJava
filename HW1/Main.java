package HW1;
// Реализуйте 2 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
// 1. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
// необходимо как-то оповестить пользователя.
// 2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
// необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, 
// которое пользователь может увидеть - RuntimeException, т.е. ваше.


public class Main {

    public static void main(String[] args) {
        int [] array1 = new int [] {6,12,3};
        int [] array2 = new int [] {3,6,0};
        printArray(ArrayDiff(array1, array2));
        printArray(ArrayDivision(array1, array2));
    }


    public static int [] ArrayDiff (int[] array1,int [] array2){
        if (array1.length != array2.length){
            throw new RuntimeException("Массивы не равны");
        }
        int [] finishArray = new int [] {0,0,0};
        for (int i = 0; i < array1.length; i++){
            finishArray[i] = array1[i] - array2[i];
        }
        return finishArray;
    }

    public static int [] ArrayDivision (int[] array1, int[] array2){
        if (array1.length != array2.length){
            throw new RuntimeException("Массивы не равны");
        }
            int [] finishArray = new int [] {0,0,0};
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == 0){
                    throw new RuntimeException("Деление нуля не возможно!");
                    } if (array2[i] == 0){
                        throw new RuntimeException("Деление на ноль не возможно!");
                        } else {
                            finishArray[i] = array1[i] / array2[i]; 
                }
            }
            return finishArray;
    }
    

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}