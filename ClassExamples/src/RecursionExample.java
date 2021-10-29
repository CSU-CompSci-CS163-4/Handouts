public class RecursionExample {

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