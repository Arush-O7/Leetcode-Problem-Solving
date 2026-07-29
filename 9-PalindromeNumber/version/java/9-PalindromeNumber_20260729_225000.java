// Last updated: 29/07/2026, 22:50:00
1class Solution {
2    public boolean isPalindrome(int x) {
3        if (x<0 || (x!=0 && x%10==0)) return false;
4        int rev = 0;
5        while (x>rev){
6            rev = rev*10 + x%10;
7            x = x/10;
8        }
9        return (x==rev || x==rev/10);
10    }
11}