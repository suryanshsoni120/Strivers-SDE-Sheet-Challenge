import java.util.*;

class Interval {
    int start;
    int finish;

    Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class Problem8 {

    public static List<Interval> mergeIntervals(Interval[] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i.start));
        List<Interval> mergedIntervals = new ArrayList<>();
        Interval currentInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            Interval nextInterval = intervals[i];
            if (currentInterval.finish >= nextInterval.start) {
                currentInterval.finish = Math.max(currentInterval.finish, nextInterval.finish);
            } else {
                mergedIntervals.add(currentInterval);
                currentInterval = nextInterval;
            }
        }
        mergedIntervals.add(currentInterval);
        return mergedIntervals;
    }

    public static void main(String[] args) {
        Interval[] intervals = new Interval[4];
        intervals[0] = new Interval(1, 3);
        intervals[1] = new Interval(2, 6);
        intervals[2] = new Interval(8, 10);
        intervals[3] = new Interval(15, 18);
        List<Interval> merged = mergeIntervals(intervals);
        for (Interval interval : merged) {
            System.out.println(interval.start + " " + interval.finish);
        }
    }
}
