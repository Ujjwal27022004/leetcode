1class Solution {
2    public int[] plusOne(int[] digits) {
3        int n = digits.length;
4        
5        // Traverse from last digit
6        for (int i = n - 1; i >= 0; i--) {
7            if (digits[i] < 9) {
8                digits[i]++; 
9                return digits; // No carry left, return result
10            }
11            
12            digits[i] = 0; // Set current to 0 and carry continues
13        }
14        
15        // If all digits were 9 -> [9,9] -> [1,0,0]
16        int[] result = new int[n + 1];
17        result[0] = 1;
18        return result;
19    }
20}
21