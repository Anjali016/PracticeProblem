
import java.util.*;

public class ShortestPath {
  
   private static class GraphNode {
     Map<Integer, List<Integer>> graph ;

   public GraphNode(Map<Integer, List<Integer>> graph){
     this.graph = graph;
  }

  public void addEdge(int source, int des){
    List<Integer> neighbours = graph.getOrDefault(source, new ArrayList<Integer>());
    neighbours.add(des);
    graph.put(source, neighbours);
  }

  public List<Integer> getNeighbours(int node){
    return  graph.getOrDefault(node, new ArrayList<Integer>());
  }

  }

 public static void shortestPath(Graph graph, int source, int dest) {
   
 }


 }
