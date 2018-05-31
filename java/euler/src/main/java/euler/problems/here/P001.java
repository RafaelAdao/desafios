package euler.problems.here;

import java.math.BigInteger;
import java.util.List;
import java.util.function.Predicate;

import euler.problems.Problem;

public class P001 implements Problem {

	@Override
	public String solve(List<String> input) {
		Predicate<BigInteger> multiples = n -> /**/
		/**/ n.mod(new BigInteger("3")).equals(BigInteger.ZERO) || /**/
		/**/ n.mod(new BigInteger("5")).equals(BigInteger.ZERO);

		return input /**/
				.stream() /**/
				.map(BigInteger::new) /**/
				.filter(multiples) /**/
				.reduce(BigInteger.ZERO, BigInteger::add) /**/
				.toString();
	}

}
