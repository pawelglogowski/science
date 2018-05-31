import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import function.linear.LinearFunction;

/**
 * @author Paweł Głogowski
 */
public class LinearFunctionTest {

	@Test
	public void aLessThenZeroAndBLessThenZeroTest() {
		LinearFunction linearFunction = new LinearFunction(new BigDecimal(-1), new BigDecimal(-1));
		BigDecimal[] result = new BigDecimal[5];
		result[0] = new BigDecimal(1);
		result[1] = new BigDecimal(0);
		result[2] = new BigDecimal(-1);
		result[3] = new BigDecimal(-2);
		result[4] = new BigDecimal(-3);

		BigDecimal[] pointsX = new BigDecimal[5];
		for (int i = 0; i < pointsX.length; i++)
			pointsX[i] = new BigDecimal(i - 2);

		Assert.assertArrayEquals(result, linearFunction.getFunctionSolutions(pointsX));
	}

	@Test
	public void aGreaterThenZeroAndBLessThenZeroTest() {
		LinearFunction linearFunction = new LinearFunction(new BigDecimal(1), new BigDecimal(-1));
		BigDecimal[] result = new BigDecimal[5];
		result[0] = new BigDecimal(-3);
		result[1] = new BigDecimal(-2);
		result[2] = new BigDecimal(-1);
		result[3] = new BigDecimal(0);
		result[4] = new BigDecimal(1);

		BigDecimal[] pointsX = new BigDecimal[5];
		for (int i = 0; i < pointsX.length; i++)
			pointsX[i] = new BigDecimal(i - 2);

		Assert.assertArrayEquals(result, linearFunction.getFunctionSolutions(pointsX));
	}
}
