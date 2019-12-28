import java.util.*;

public class DepthFirst {

  private static class Graph {
    Map<Integer, List<Integer>> graph ;

    public Graph(Map<Integer, List<Integer>> graph) {
      this.graph = graph;
    }

    public void addEdge(int source, int des) {
      List<Integer> neighbours = graph.getOrDefault(source, new ArrayList<Integer>());
      neighbours.add(des);
      graph.put(source, neighbours);
    }

    public List<Integer> getNeighbours(int node) {
      return  graph.getOrDefault(node, new ArrayList<Integer>());
    } 
  }

  public static void depthFirst(Graph graph, int source) {
    Set<Integer> visited = new HashSet<>();
    visited.add(source); 
    System.out.print(source + ", ");
    for(int node : graph.getNeighbours(source)) if(!visited.contains(node)) depthFirstUtil(graph, visited, node);
   }

  private static void depthFirstUtil(Graph graph, Set<Integer> visited, int current) {
    visited.add(current);
    System.out.print(current + " ,");
    for(int node : graph.getNeighbours(current))
      if(!visited.contains(node)) {
        depthFirstUtil(graph, visited, node);
      }
  }

  public static void main(String[] args) {
    Graph graph = new Graph(new HashMap<Integer, List<Integer>>());
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 3);
    depthFirst(graph, 2);
  }
}
