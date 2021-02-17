package objects.chapter02.movie.step01.pricing;

import objects.chapter02.money.Money;
import objects.chapter02.movie.step01.DiscountCondition;
import objects.chapter02.movie.step01.DiscountPolicy;
import objects.chapter02.movie.step01.Screening;

import java.time.DayOfWeek;
import java.time.LocalTime;

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
