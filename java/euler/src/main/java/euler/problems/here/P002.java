package euler.problems.here;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import euler.problems.Problem;

public class P002 implements Problem {

	@Override
	public String solve(List<String> input) {
		StringBuilder ret = new StringBuilder();
		input.stream().map(Integer::parseInt).forEach(times -> {
			List<BigInteger> nums = getFibonatti(times);
			String fib = nums.stream().map(Object::toString).collect(Collectors.joining(", "));
			ret.append(fib).append("\r\n");
		});

		return ret.toString();
	}

	private static List<BigInteger> getFibonatti(int times) {
		List<BigInteger> fib = new ArrayList<>();
		BigInteger num1 = BigInteger.ZERO;
		BigInteger num2 = new BigInteger("1");

		if (times == 0)
			return fib;

		fib.add(num1);
		if (times == 1)
			return fib;

		fib.add(num2);
		if (times == 2)
			return fib;

		for (int i = 2; i < times; i++) {
			BigInteger sum = num1.add(num2);
			fib.add(sum);
			num1 = num2;
			num2 = sum;
		}
		return fib;
	}

}
