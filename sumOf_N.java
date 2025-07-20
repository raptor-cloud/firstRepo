public class sumOf_N {
    public static int sum(int n){
        if(n==1){
            return 1;
        }

        int sum1 = sum(n-1);
        int totalsum = n + sum1;
        return totalsum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
}
  