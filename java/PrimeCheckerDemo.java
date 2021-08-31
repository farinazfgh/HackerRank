import java.math.BigInteger;
import java.util.stream.IntStream;

public class PrimeCheckerDemo {
    public boolean isPrime(Long number) {
        BigInteger bigInt = BigInteger.valueOf(number);
        return bigInt.isProbablePrime(100);
    }
    public boolean isPrime(Integer number) {
        return number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }


}
