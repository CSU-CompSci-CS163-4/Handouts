public class KnowledgeCheck {


    private static void initialSwapper(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[min] < arr[i])
                min = i;

        int tmp = arr[min];
        arr[min] = arr[0];
        arr[0] = tmp;

        System.out.println(arr[0]);
    }

    private static void initialSwap(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[min] > arr[i])
                min = i;

        int tmp = arr[min];
        arr[min] = arr[0];
        arr[0] = tmp;

        System.out.println(arr[0]);
    }

    private static int doSomething(int[] arr) {
        int val = 0;
        for(int i = 0; i < arr.length; i++) {
            val += i;
        }
        return val;
    }

    private static void arrayFun() {
        char[] barb = {'m', 'o', 'g', 'g', 'l', 'e'};
        String barb2 = "moggle";
        char[] barb3 = new char[5];

        barb[0] = 0;

        barb[barb2.length()-1] = 'E';
        barb3[3] = barb[barb3.length];
        barb3 = barb;
        /*
        barb3 = bard2;
        barb2[0] = "M";
        barb[0] = "M";


        barb[barb.length] = 'M';
        barb[6] = 'M';
 */
    }


    public static void main(String[] args) {
        int[] arr = { 10, -2, -3, 1, 0, 10 };
        initialSwap(arr);
        initialSwapper(arr);
        int[] arr2 = { 10, 20, -2, 3, 1, 0, 10 };
        initialSwap(arr2);
        initialSwapper(arr2);

        System.out.println(doSomething(arr));

        arrayFun();
    }
    
}
