import java.util.Scanner;

public class Elements_Removal {

    public static int Costcalc(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=0;

                if(arr[i]<arr[j]){
                    temp=arr[j];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int cost=0;
        for(int i=0;i<arr.length;i++){
            cost=cost+(arr[i]*(i+1));
        }
        return cost;


    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : " );
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int val=Costcalc(arr);
        System.out.println("The value is :"+val);
    }
}