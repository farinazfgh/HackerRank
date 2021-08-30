import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static BigDecimal calculateTotalAmount(
            BigDecimal quantity,
            BigDecimal unitPrice
            , BigDecimal discountRate
            , BigDecimal taxRate) {

        BigDecimal amount = quantity.multiply(unitPrice);
        System.out.println(amount);
        BigDecimal discount = amount.multiply(discountRate);
        System.out.println(discount);

        BigDecimal discountedAmount = amount.subtract(discount);
        System.out.println(discountedAmount);

        BigDecimal tax = amount.multiply(taxRate);
        System.out.println(tax);

        BigDecimal total = discountedAmount.add(tax);
        System.out.println(total);

        return total.setScale(2, RoundingMode.HALF_EVEN);
    }

    public static void main(String[] args) {
        BigDecimal quantity = new BigDecimal("4.5");
        BigDecimal unitPrice = new BigDecimal("2.69");
        BigDecimal discountRate = new BigDecimal("0.10");
        BigDecimal taxRate = new BigDecimal("0.0725");

        BigDecimal amountToBePaid = BigDecimalDemo
                .calculateTotalAmount(quantity, unitPrice, discountRate, taxRate);
        System.out.println(amountToBePaid);
    }
}
