import java.util.*;

public class MedianOfStream {
  
  public static void main(String[] args) {
    
  }

  static PriorityQueue<Integer> maxHeap;
  static PriorityQueue<Integer> minHeap; 
  
  MedianOfStream() {
    maxHeap = new PriorityQueue<>();
    minHeap = new PriorityQueue<>();
  }

  private static double getMedian() {
    if (maxHeap.size() == minHeap.size()) return (maxHeap.peek() + minHeap.peek())/2;
    if (maxHeap.size() > minHeap.size()) return 1.0 * maxHeap.peek();   
     return 1.0 * minHeap.peek();   
  }

  private static void processStream(int item) {
    maxHeap.add(item);
    
    if (minHeap.size() > 0 && maxHeap.peek() > minHeap.peek() || (maxHeap.size() - minHeap.size() > 1)) {
      int poll = maxHeap.poll();
      minHeap.add(poll);
    }
    if (minHeap.size() - maxHeap.size() >1) maxHeap.add(minHeap.poll());
  }
}
