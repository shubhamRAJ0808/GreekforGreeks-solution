class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int windowSum = 0;
        
        // pahla window banaw
        for(int i=0; i<k;i++){
            windowSum += arr[i];
        }
        
        int maxSum = windowSum;
        // forward loop chala ke maxSum nikalna hain
        for(int i=k; i<arr.length; i++){
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(windowSum,maxSum);
        }
        return maxSum;
        
    }
}