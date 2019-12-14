import java.util.*;

public class BreadthFirst {

  private static class Graph {
    Map<Integer, List<Integer>> graph;

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

  public static void breadthFirst(Graph graph, int source) {
    Set<Integer> visited = new HashSet<>();
    Queue<Integer> queue = new LinkedList<>();
    queue.add(source);
    while(!queue.isEmpty()) {
      int polled = queue.poll(); 
      visited.add(polled);
      System.out.print(polled + ",");
      if(!graph.getNeighbours(polled).isEmpty())
        for(int node : graph.getNeighbours(polled)){
          if(!visited.contains(node)) queue.add(node);
        }
    }
  }

  public static void main(String[] args){
    Graph graph = new Graph(new HashMap<Integer, List<Integer>>());
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 3);
    breadthFirst(graph, 2);
  }
} 
