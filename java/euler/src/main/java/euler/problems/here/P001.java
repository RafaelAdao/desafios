package euler.problems.here;

import java.math.BigInteger;
import java.util.List;

import euler.problems.Problem;

public class P001 implements Problem {

	@Override
	public String solve(List<String> input) {
		BigInteger b0 = BigInteger.valueOf(0); 
		BigInteger b3 = BigInteger.valueOf(3); 
		BigInteger b5 = BigInteger.valueOf(5); 
		return input
				.stream()
				.map(BigInteger::new)
				.filter(n -> n.mod(b3).equals(b0) || n.mod(b5).equals(b0))
				.reduce(
						BigInteger.valueOf(0),
						(a,b) -> a.add(b)
						)
				.toString();
	}
}
