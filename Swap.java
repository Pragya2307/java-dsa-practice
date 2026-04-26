import java.util.Scanner;

public class Swap {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();

    }
}
    for(int j=0;j<m;j++){
        int temp=arr[0][j];
        arr[0][j]=arr[n-1][j];
        arr[n-1][j]=temp;


    }
    
    System.out.println("After swapping");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.println(arr[i][j]);
        }

    }
}
    }

