import java.util.Arrays;
//Time: O(nlog(n)) Space: O(1)
public class Question2 {
    public static int minRooms(int[][] meetings){
        int[] start = new int[meetings.length];
        int[] end = new int[meetings.length];
        for (int i=0; i<meetings.length;i++){
            start[i] = meetings[i][0];
            end[i] = meetings[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int room = 0;
        int k = 0;
        for(int i=0; i<start.length;i++){
            if(start[i] < end[k]){
                room++;
            }
            if(start[i] >= end[k]){
                k++;
            }
        }
        return room;
    }
}
