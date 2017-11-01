import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by Reshetuyk on 06.10.2017.
 */
public class FactorialTest {


    @Test
    public void testFactorial() throws Exception {
        Assert.assertThat(new Factorial().calculate(4), is(24L));

    }
}
