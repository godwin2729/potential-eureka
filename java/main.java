public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private String time;

public void setTime(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;

    if (minutes < 0 || minutes > 59) {
        throw new IllegalArgumentException("Minutes must be between 0 and 59");
    } else if (seconds < 0 || seconds > 59) {
        throw new IllegalArgumentException("Seconds must be between 0 and 59");
    } else {
        hours %= 12;
        String strHours = String.format("%02d", hours);
        String strMinutes = String.format("%02d", minutes);
        String strSeconds = String.format("%02d", seconds);
        time = strHours + ":" + strMinutes + ":" + strSeconds;
        System.out.println(time);
    }

}}