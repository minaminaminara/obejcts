package objects.chapter02.movie.step01.book.pricing;

import objects.chapter02.money.Money;
import objects.chapter02.movie.step01.book.DiscountPolicy;
import objects.chapter02.movie.step01.book.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
