public class NameNtimes {

    public static void printName(int i , int n){
        if(i>n){
            return;
        }
        System.out.println("Raj Striver");
        printName(i+1, n);
    }   

    public static void main(String[] args) {
        printName(1, 5);
    }

    
}
