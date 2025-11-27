1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.replaceAll(" ", "");
4        s = s.replaceAll("[^a-zA-Z0-9]", "");
5        s = s.toLowerCase();
6        char ch;
7        String ns="";
8
9        for (int i = 0; i < s.length(); i++) {
10            ch = s.charAt(i);
11            ns = ch + ns;
12        }
13        if (ns.equals(s)) {
14            return true;
15        }
16        return false;
17    }
18}