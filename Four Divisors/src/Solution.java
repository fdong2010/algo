import java.util.ArrayList;

class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        
        for (int num: nums)  {            
            ArrayList<Integer> divisors = new ArrayList<>();

            for (int i = 1; i <= (int)Math.floor(Math.sqrt(num)); i++) {
                if (num % i == 0) {
                    divisors.add(i);
                    if (num / i != i)
                        divisors.add(num / i);
                }
            }
            if (divisors.size() == 4) {
                for (int divisor: divisors)
                    sum += divisor;
            }
        }
        return sum;
    }
}
