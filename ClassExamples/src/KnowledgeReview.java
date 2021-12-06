

public class KnowledgeReview {
  
    public long method(int n) {
        //System.out.println("In method: " + n);
        if (n <= 1)
            return n;
        return method(n - 1) + method(n - 2);
    }

    public long fibLoop(int n) {
        int ans = 0;
        int prev = 1;
        int prev2 = 0;
        for(int  i = 1; i < n; i++) {
            ans = prev + prev2;
            prev2 = prev;
            prev = ans;
        }

        return ans;
    }

    public static void main(String[] args) {
        KnowledgeReview review = new KnowledgeReview();
        System.out.println(review.fibLoop(160));
        System.out.println(review.method(160));   
    }
    
}
