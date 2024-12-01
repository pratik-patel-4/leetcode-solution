public class Solution {
    
    /**
     * 1346. Check If N and Its Double Exist
     * Link: https://leetcode.com/problems/check-if-n-and-its-double-exist/description/?envType=daily-question&envId=2024-12-01
     * Easy
     * Given an array arr of integers, check if there exist two indices i and j such that :
     *      1) i != j
     *      2) 0 <= i, j < arr.length
     *      3) arr[i] == 2 * arr[j]
     * 
     * Example 1: 
     *      Input: arr = [10,2,5,3]
     *      Output: true
     *      Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
     * 
     * Example 2: 
     *      Input: arr = [3,1,7,11]
     *      Output: false
     *      Explanation: There is no i and j that satisfy the conditions.
     * 
     * Constraints:
     *      2 <= arr.length <= 500 
     *      -103 <= arr[i] <= 103    
     */

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[] {10,2,5,3}));
    }

    public static boolean checkIfExist(int[] arr) {
        for(int i = 0 ; i < arr.length; i++){
            float t = (float) arr[i]/2;
            int x = Search(arr, t);
            if(x != i && x != -1 ) {
                return true;
            }
        }   
        return false;
    }

    private static int Search(int[] arr, float target) {
        for(int i = 0; i < arr.length; i++) {
            if((float) arr[i] == target){
                return i;
            }
        }
        return -1;
    } 

}
