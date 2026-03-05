//Write a program to print the Fibonacci series up to n terms.
//public class first_program {
//    public static void main(String[] args) {
//        int n = 10;
//        int first =0 ;
//        int second =1;
//        System.out.println(first + " " + second + " ");
//        for (int i=2;i<n;i++){
//            int next = first + second;
//            System.out.println(next);
//            first = second;
//            second = next;
//        }
//    }
//}
//Write a program to reverse a given number
public class first_program{
    public static void main(String[] args) {
        int n = 1204;
        int reversed = 0;
        while (n!=0){
            int digit = n%10;
            reversed= reversed *10 +digit;
            n = n/10;
        }
        System.out.println(reversed);
    }
}