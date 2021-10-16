public class Main {

    public static void main(String[] args) {
        ClockDisplay myClock = new ClockDisplay();
        printer(myClock);
        myClock.setTime(9 , 59 , 58);
        printer(myClock);
        myClock.timeTick();
        printer(myClock);
        myClock.timeTick();
        printer(myClock);
    }

    public static void printer(ClockDisplay clock){
        System.out.println(clock.getTime());
    }
}
