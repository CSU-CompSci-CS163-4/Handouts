import java.util.Arrays;

public class SearchingSorting {
    public static void selectionSort(int [] array){
        for(int i = 0; i < array.length-1; i++){
            int indexMin = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[indexMin]){
                    indexMin = j;
                }
            }
            int tmp = array[i];
            array[i] = array[indexMin];
            array[indexMin] = tmp;
        }
    }
    public static void selectionSort2(int [] array){
        for(int i = 0; i < array.length-1; i++){
            int index = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] > array[index]){
                    index = j;
                }
            }
            int tmp = array[i];
            array[i] = array[index];
            array[index] = tmp;
        }
    }

    public static void bubbleSort(int []array){
        for(int i = 0; i < array.length; i ++){
            for(int j = 0; j < array.length-1; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
    public static void bubbleSort2(int []array){
        for(int i = 0; i < array.length; i ++){
            for(int j = 0; j < array.length-1; j++){
                if(array[j] < array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        char[] array = new char[]{'k', 'i','n','n', 'i', 'k', 'i', 'n', 'n', 'i', 'k'};
        System.out.println(linearSearch('i',array));
        System.out.println(linearSearch('n',array));
        int [] a = new int[] {1,2,3,4};
        System.out.println(binarySearch(a, 3, 0, a.length));
        System.out.println(binarySearch(a, 13, 0, a.length));
        int [] ar2 = {10, 40, 1, 3, 5};
        System.out.println(Arrays.toString(ar2));
        bubbleSort(ar2);
        System.out.println(Arrays.toString(ar2));
        bubbleSort2(ar2);
        System.out.println(Arrays.toString(ar2));
        selectionSort(ar2);
        System.out.println(Arrays.toString(ar2));
        selectionSort2(ar2);
        System.out.println(Arrays.toString(ar2));

    }

    public static int binarySearch(int [] array, int key, int l, int h){
        int middle = (l+h)/2;
        if(l >= h)  return -1;
        if(key == array[middle]){
            return middle;
        }
        if(key > array[middle]){
            l = middle + 1;
            return binarySearch(array, key, l, h);
        }
        h = middle - 1;
        return binarySearch(array, key, l, h);
    }

     public static int linearSearch(char key, char[] array) {
        for(int i = 0; i < array.length; i++) {
            if(key == array[i])
                return i;
        }
        return -1;
    }

}
