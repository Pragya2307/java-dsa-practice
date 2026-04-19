import java.util.Scanner;

public class EvenNumbers {
    public static boolean iseven(int n){
        if(n%2==0){
            return true;
        }
        return false;

    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        boolean even=iseven(n);
        if(even){
            System.out.println(n+" is an even number"); 
        }else{
            System.out.println(n+" is not an even number");
    }
    

}
}
