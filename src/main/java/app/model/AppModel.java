package app.model;

import net.time4j.ClockUnit;
import net.time4j.Duration;

public class AppModel {
    public String transformSecToHHMMSS(long sec) {
        Duration<ClockUnit> duration = Duration.of(sec, ClockUnit.SECONDS).with(Duration.STD_CLOCK_PERIOD);
        return Duration.Formatter.ofPattern(ClockUnit.class, "hh:mm:ss").format(duration);
    }
}
