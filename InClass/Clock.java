class Clock1 {
    static int testVariable = 123123;
    private int hour;
    private int minute;
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    private int second;
    public Clock1(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void showTime(){
        System.out.println("Time: " + hour + ":" + minute + ":" + second);
    }
}


public class Clock {
    private int hour;
    private int minute;
    private int second;
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void showTime(){
        System.out.println("Time: " + hour + ":" + minute + ":" + second);
    }

    public static void main(String[] args){
        Clock1 clock = new Clock1(1,2,3);
        System.out.println(Clock1.testVariable);
        clock.showTime();
    }

}

