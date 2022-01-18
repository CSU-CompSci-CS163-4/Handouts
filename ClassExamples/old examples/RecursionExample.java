public class RecursionExample {
    public static int simple_sum(int[] values) {
        return simple_sum(values, 0);
    }

    public static int simple_sum(int[] values, int index) {
            if (index >= values.length) return 0;
            return values[index] + simple_sum(values, index + 1);

    }

   /* public static void main(String[] args) {
        System.out.println(simple_sum(new int[]{}));
       System.out.println(simple_sum(new int[]{ 1 }));
       System.out.println(simple_sum(new int[]{1,2,3,4}));
    }*/
    

    public static int sum(Object[] values) {
        return sum(values, 0); // overload, for easier initial call
    }
    public static int sum(Object[] values, int current) {
        if(current >= values.length) return 0; // past end of array, return 0
        if(values[current] instanceof Object[]) // another array!
            return sum((Object[])values[current], 0) + sum(values, current+1);
        return (Integer)values[current] + sum(values, current+1); // number plus something
    }
    public static void main(String[] args) {
        Object[] values = new Object[]{1, 2, 3, 
            new Object[]{4, 5, new Object[]{1,1}},
            10, new Integer[]{2,2}, 1, 10};
        System.out.println(sum(values));                              
    }
}