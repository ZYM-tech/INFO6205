import java.util.ArrayList;
import java.util.Comparator;
//Time: O(nlog(n)) Space: O(n)
public class Question_2 {

    //Question 2: define Interval
    public static class Interval {

        public int start;
        public int end;

        public Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }


    public static boolean Allmeeting(ArrayList<Interval> meetings) {
        if(meetings == null || meetings.size() <= 1  )
            return true;

        //sort intervals(meetings) by start time
        meetings.sort(new Comparator<>() {
            @Override
            public int compare(Interval x, Interval y) {
                return Integer.compare(x.start, y.start);
            }
        });

        //compare if these sorted meetings have time conflicts
        for (int i = 1; i < meetings.size(); i++) {
            Interval rear = meetings.get(i-1);
            Interval current = meetings.get(i);
            if (rear.end > current.start || rear.start == current.start) {
                return false;
            }
        }
        return true;
    }
}

