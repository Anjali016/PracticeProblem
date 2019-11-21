import java.util.*;
import java.lang.*;

public class MeetingRooms {
  
  private static class Meeting {
    Long startTime;
    Long endTime;
   
    Meeting(Long startTime, Long endTime) {
      this.startTime = startTime;
      this.endTime = endTime;
    }
  }
  
  public static int maxRooms(List<Meeting> meetings) {
    int maxRooms = Integer.MIN_VALUE;
    int room = 0;
    int start = 0;
    int end = 0;
    List<Long> startTimes = new ArrayList<>();
    List<Long> endTimes = new ArrayList<>();
    for(Meeting meeting : meetings) {
      startTimes.add(meeting.startTime);
      endTimes.add(meeting.endTime);
    }
    
    Collections.sort(startTimes,  timeComparator);
    Collections.sort(endTimes, timeComparator);

     while(start < startTimes.size() - 2 || end < endTimes.size() - 2 ) {
       if (startTimes.get(start)  <  endTimes.get(end)) {
         room++;
         start++;
       }
       else {
           room--;
           end++; 
       }
     maxRooms = Math.max(maxRooms, room);
     }
    return maxRooms;
  }

  public static Comparator<Long> timeComparator = new Comparator<Long>() {
     
     @Override
     public int compare(Long start, Long end) {
       return start.compareTo(end);
   }
  }; 
  
  public static void main(String[] args) {
    List<Meeting> meetings = new ArrayList<>();
    meetings.add(new Meeting(900L, 910L)); 
    meetings.add(new Meeting(940L, 1200L)); 
    meetings.add(new Meeting(950L, 1120L)); 
    meetings.add(new Meeting(1100L, 1130L));
    meetings.add(new Meeting(1500L, 1900L));
    meetings.add(new Meeting(1800L, 2000L));
    System.out.println(maxRooms(meetings));
  }
}
