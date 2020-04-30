import java.util.*;

public class Subject {
    private String number;
    private String name;
    private LinkedList<Activity> activities = new LinkedList<Activity>();

    //    Approach #1
//    public void addActivity(Activity activity) {
//        activities.add(activity);
//    }
//    Approach #2
    public void addActivity(String group, int number, String day, int
            start, int duration, String room, int capacity) {activities.add(new Activity(this, group, number, day, start,duration, room, capacity));
    }



    @Override
    public String toString() {
        return "Subject tostring";
    }


}