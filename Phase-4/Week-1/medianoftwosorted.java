public class medianoftwosorted {
    public static void main(String[] args) {
        int nums1[] = {1, 3};
        int nums2[] = {2};
        System.out.println(median(nums1, nums2));
    }
    public static double median(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int c[] = new int[n + m];
        int i = 0, j = 0, k = 0;

        // Merge two arrays
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                c[k++] = nums1[i++];
            } else {
                c[k++] = nums2[j++];
            }
        }

        while (i < n) {
            c[k++] = nums1[i++];
        }

        while (j < m) {
            c[k++] = nums2[j++];
        }

        int x = c.length;
        if (x % 2 != 0) {
            return (double) c[x / 2];
        } else {
            return (double) (c[x / 2 - 1] + c[x / 2]) / 2.0;
        }
    }
}
