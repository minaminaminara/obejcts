package objects.chapter02.movie.step01.taylor;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class Screening {

    private int screeningId;

    private int seq;

    private Movie screeningMovie;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

}
