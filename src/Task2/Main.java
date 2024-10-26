package Task2;

/*
Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
 */

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 3, 5, 6};
        Integer[] arr2 = {1, 3, 2, 6};

        System.out.println(compareArrays(arr1, arr2));
    }

    public static <T> boolean compareArrays(T[] arr1, T[] arr2){
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if(!arr1[i].equals(arr2[i])){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
