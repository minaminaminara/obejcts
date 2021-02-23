package objects.chapter02.movie.step01.book.pricing;

import objects.chapter02.money.Money;
import objects.chapter02.movie.step01.book.DiscountCondition;
import objects.chapter02.movie.step01.book.DiscountPolicy;
import objects.chapter02.movie.step01.book.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
