package objects.chapter02.movie.step01.pricing;

import objects.chapter02.money.Money;
import objects.chapter02.movie.step01.DiscountCondition;
import objects.chapter02.movie.step01.DiscountPolicy;
import objects.chapter02.movie.step01.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
