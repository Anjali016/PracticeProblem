
import java.util.*;

public class ShortestPath {
  
//We say that BFS is the algorithm to use if we want to find the shortest path in an undirected, unweighted graph. The claim for BFS is that the first time a node is discovered during the traversal, that distance from the source would give us the shortest path.

 private static class ResultNode {
   int x;
   int y;
   int distance;
 }

 public static int shortestPath(Graph graph, int source, int dest) {
   
   Set<Integer> visited = new HashSet<>();
 }


 public static void shortestPathUtil(int[][] graph, int source, int dest) {
   Queue<ResultNode> queue = new Queue<>();
   visited.add(source);
   queue.add(source);
   while(!queue.isEmpty()) {
     int currNode = queue.poll();
     if (currNode.x == ) return currNode.distance;
     else {
       for (int[] move : moves)
       visited.add(source);
       int nextMovex = currNode.x + move[0];
       int nextMovey = currNode.y + move[1];
       if()
     }
   }
 }


 }
