public class First_missing {
    public static void main(String[] args) {
        int nums[]={1,2,0};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int ele=nums[i];
            // isme hum pehle element ko check karenge agar wo negative hai toh age nikal jayenge agar wo same hai jis index par hona chahiye matlab duplicates hai toh bhi aage nikal jayenge
            if(ele<=0 ||ele>n || ele==i+1 || ele==nums[ele-1]) i++;
            // agar correct index par nahi hai toh swap kar denge
            else swap(i,ele-1,nums);
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1) return j+1;
        }
        return n+1;
    }
    public static void swap(int i,int j,int []nums){
        // code for swaping
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
