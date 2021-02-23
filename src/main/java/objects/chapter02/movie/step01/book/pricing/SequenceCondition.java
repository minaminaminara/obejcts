package objects.chapter02.movie.step01.book.pricing;

import objects.chapter02.movie.step01.book.Screening;

public class SequenceCondition {

    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
