package function.linear;

import java.math.BigDecimal;

/**
 * @author Paweł Głogowski
 */
public class LinearFunction {

	private BigDecimal a;
	private BigDecimal b;

	public LinearFunction(BigDecimal a, BigDecimal b) {
		this.a = a;
		this.b = b;
	}

	public BigDecimal[] getFunctionSolutions(BigDecimal... pointsX) {
		BigDecimal[] result = new BigDecimal[pointsX.length];

		for (int i = 0; i < pointsX.length; i++) {
			result[i] = calculate(pointsX[i]);
		}

		return result;
	}

	private BigDecimal calculate(BigDecimal x) {
		return a.multiply(x).add(b);
	}
}
