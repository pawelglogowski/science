import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import math.function.linear.LinearFunction;

/**
 * @author Paweł Głogowski
 */
public class LinearFunctionTest {


	@Test
	public void calculateSolutions() {
		List<Integer> expectedResult = List.of(1, 2, 3, 4);
		Assert.assertEquals(
				expectedResult,
				LinearFunction.calculateSolutions(1, 2, (a, b, x) -> a * x + b, List.of(-1, 0, 1, 2)));
	}
}
