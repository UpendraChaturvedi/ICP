import java.util.*;
public class Stockspan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prices[]={7,1,5,3,6,4};
        int n=prices.length;
        int pr=0;
        int by=Integer.MAX_VALUE;
        for(int i:prices){
            if(i<by){
                by=i;
            }
            else{
                pr=Math.max(pr,i-by);
            }
        }
        // return pr;
        System.out.println(pr);
    }
}
