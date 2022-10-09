import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class EinstiegsbeispielTest {
    
    @Test
    public void resultWithPositiveNumbers()
    {
        int[] num = { 1, 2, 3 };
        int[] num2 = { 1, 2, 3 };

        assertEquals(14, Einstiegsbeispiel.getInnerProduct(num, num2));
    }
    @Test
    public void resultWithNegativeNumbers()
    {
        int[] num = {-1,2,3};
        int[] num2 = { -1, -2, 3 };
    
        assertEquals(6, Einstiegsbeispiel.getInnerProduct(num, num2)); 
    }



}
