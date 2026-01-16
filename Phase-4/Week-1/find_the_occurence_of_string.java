import java.util.*;
public class find_the_occurence_of_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int n=s1.length();
        int m=s2.length();
        boolean f=false;
        for(int i=0;i<=n-m;i++){
            if(s1.substring(i,i+s2.length()).equals(s2)){
                System.out.println(i);
                f=true;
                break;
                
            }
        }
        if(!f)System.out.println(-1);
    }
}
