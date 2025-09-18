public class Time {

    // Instance variables
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters
    public int getHour() {
        return hour;
    }

    // Get minute
    public int getMinute() {
        return minute;
    }

    // Get second
    public int getSecond() {
        return second;
    }

    // Setters
    public void setHour(int hour) {
        this.hour = hour;
    }

    // Set minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // Set second
    public void setSecond(int second) {
        this.second = second;
    }

    // Set time
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Output to String with proper formatting
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Methods to increment time by one second
    public Time nextSecond() {

        // Check if second rolls over
        second++;
        if (second == 60) {
            second = 0;
             minute++;

            // Check if minute rolls over
            if (minute == 60) {
                minute = 0;

                // Check if hour rolls over
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;  // Return nextSecond() 
    }   

    // Method to decrement time by one second
    public Time previousSecond() {
        second--;
        if (second == -1) {
            second = 59;

            // Check if minute rolls over
            minute--;
            if (minute == -1) {
                minute = 59;

                // Check if hour rolls over
                hour--;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;  // Return previousSecond()
    }
}