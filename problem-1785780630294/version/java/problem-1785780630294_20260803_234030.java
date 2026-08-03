// Last updated: 03/08/2026, 23:40:30
1public class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) {
4            return false;
5        }
6        char[] a = s.toCharArray();
7        char[] b = t.toCharArray();
8        Arrays.sort(a);
9        Arrays.sort(b);
10        return Arrays.equals(a,b);
11    }
12}