import java.math.BigDecimal;
import java.util.List;

import math.function.linear.LinearFunction;

/**
 * @author Paweł Głogowski
 */
public class Main {

	public static void main(String... args) {

		System.out.println(LinearFunction.calculateSolutions(
				new BigDecimal(1),
				new BigDecimal(2),
				(a, b, x) -> a.multiply(x).add(b),
				List.of(new BigDecimal(1), new BigDecimal(2))));

		System.out.println(
				LinearFunction.calculateSolutions(
						1.0,
						2.0,
						(a, b, x) -> (a * x) + b,
						List.of(-1, 0, 1, 2)));
	}
}
