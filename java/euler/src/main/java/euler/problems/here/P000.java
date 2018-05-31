package euler.problems.here;

import java.math.BigInteger;
import java.util.List;

import euler.problems.Problem;

public class P000 implements Problem {

	@Override
	public String solve(List<String> input) {
		return input.stream().map(BigInteger::new).reduce(BigInteger.ZERO, BigInteger::add).toString();
	}

}
