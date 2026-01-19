import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    public static void main(String[] args) {
        int []nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>>l1=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int l=i+1;
            int h=n-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(l<h){
                int s=nums[i]+nums[l]+nums[h];
                if(s==0){
                    l1.add(Arrays.asList(nums[i],nums[l],nums[h]));
                    l++;
                    h--;
                    while(l<h && nums[l]==nums[l-1])l++;
                    while(l<h && nums[h]==nums[h+1]) h--;
                }
                else if(s<0){
                    // agar sum<0 hai toh l++ karenge kyoki l chote element ko point kar raha hai
                    l++;
                }
                else if(s>0){
                    // agar sum>0 hai toh h-- karenge kyoki l bade element ko point kar raha hai
                    h--;
                }
            }
        }
        return l1;
    }
}
