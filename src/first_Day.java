//Write a program to create the Fibonacci series up to n terms.
public class first_Day {
    public static void main(String[] args) {
        int n = 10;
        int first =0 ;
        int second =1;
        System.out.println(first + " " + second + " ");
        for (int i=2;i<n;i++){
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}
//Write a program to reverse a given number
public class first_Day {
    public static void main(String[] args) {
        int number = 12901;
        int reversed = 0;
        while (number!=0){
            int Digit = number % 10;
            reversed = reversed*10+Digit;
            number /=10;
        }
        System.out.println(reversed);
    }
}
