// Last updated: 04/08/2026, 23:35:34
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int arr[] = new int[n];
5        int product = 1;
6        boolean f=false;
7        int cnt=0;
8
9        for(int i=0;i<n;i++){
10            if(nums[i]!=0){
11                product *= nums[i];
12            }
13            else{
14                f=true;
15                cnt++;
16                continue;
17            }
18        }
19
20        for(int i=0;i<n;i++){
21            if(nums[i]!=0){
22                if(f)arr[i]=0;
23                
24                else arr[i] = product/nums[i];
25            }
26            else{
27                if(cnt>1)arr[i]=0;
28                else arr[i] = product;
29            }
30        }
31
32        return arr;
33    }
34}  
35