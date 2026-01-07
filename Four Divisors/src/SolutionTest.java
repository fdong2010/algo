import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSumFourDivisors() {
        Solution mySolution = new Solution();
        int result = mySolution.sumFourDivisors(new int[]{3,20,10});
        assertEquals(18, result);
    }
}
