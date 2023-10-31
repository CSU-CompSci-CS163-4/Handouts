public class SumArray {
    public static int sumAr(int array[], int i){
        if(i == array.length) return 0;
        return array[i] + sumAr(array, i+1);
    }
    public static void main(String args[]){
         int a[] = {1,2,3,4};
         System.out.println(sumAr(a, 0));
    }
}
