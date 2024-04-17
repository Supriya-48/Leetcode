package top_interview_150;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1, q = m + n - 1, r = n - 1;
        while (p >= 0 && r >= 0) {
            if (nums1[p] > nums2[r]) {
                nums1[q] = nums1[p];
                q--;
                p--;
            } else {
                nums1[q] = nums2[r];
                q--;
                r--;
            }
        }
        while (p >= 0 && p < m) {
            nums1[q] = nums1[p];
            p--;
            q--;
        }
        while (r >= 0 && r < n) {
            nums1[q] = nums2[r];
            q--;
            r--;
        }
    }
}
