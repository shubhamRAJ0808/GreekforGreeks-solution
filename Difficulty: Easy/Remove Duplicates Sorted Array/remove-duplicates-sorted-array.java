class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        if(arr.length == 0) return result;
        
        result.add(arr[0]);
        
        for(int fast=1; fast<arr.length; fast++){
            if(arr[fast] != arr[fast-1]){
                result.add(arr[fast]);
            }
        }
        return result;
        
    }
}
