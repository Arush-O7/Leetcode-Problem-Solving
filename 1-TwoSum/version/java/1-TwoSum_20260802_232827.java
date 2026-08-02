// Last updated: 02/08/2026, 23:28:27
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int n = nums.length;
4        int arr[] = new int[2];
5        int a=0, b=0;
6        for(int i=0;i<=n-2;i++){
7            for(int j=i+1;j<=n-1;j++){
8                if(nums[i]+nums[j]==target && i!=j){
9                    a = i;
10                    b = j;
11                    break;   
12                }
13            }
14        }
15        arr[0] = a;
16        arr[1] = b;
17        return arr;
18    }
19}
20