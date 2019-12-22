import java.util.*;

public class GraphNode {

  Map<Integer, List<Integer>> graph ;
  
  public GraphNode(Map<Integer, List<Integer>> graph){
    graph = new HashMap<Integer, List<Integer>>(); 
  }

  public void addEdge(int source, int des){
    List<Integer> neighbours = graph.getOrDefault(source, new ArrayList<Integer>()); 
    neighbours.add(des);
    graph.put(source, neighbours);
  }
 
} 
