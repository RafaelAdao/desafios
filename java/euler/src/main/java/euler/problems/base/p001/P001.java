package euler.problems.base.p001;

import java.math.BigInteger;
import java.util.List;
import java.util.function.Predicate;

import euler.problems.Problem;

public class P001 implements Problem {

    @Override
    public String solve(List<String> input) {
        BigInteger n3 = new BigInteger("3");
        BigInteger n5 = new BigInteger("5");
        
        Predicate<BigInteger> pred = n -> n.mod(n3).equals(BigInteger.ZERO) || 
                n.mod(n5).equals(BigInteger.ZERO);
        
        return input.stream()
                .map(BigInteger::new)
                .filter(pred)
                .reduce(BigInteger.ZERO, BigInteger::add)
                .toString();
    }    
}