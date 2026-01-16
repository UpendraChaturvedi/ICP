import java.util.*;
public class SieveofEratosthenes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=2){
            System.out.println(0);
            return ;
        }
        int arr[]=new int [n+1];
        Arrays.fill(arr,1);
        arr[0]=0;
        arr[1]=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            for(int j=i*i;j<=n;j+=i){
                if(arr[i]==1){
                    arr[j]=0;
                }
            }
        }
        int c=0;
        for(int i=0;i<=n;i++){
            if(arr[i]==1){
                c++;
            }
        }
        System.out.println(c);
    }
}
