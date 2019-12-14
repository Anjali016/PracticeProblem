import java.util.*;

public class PrintAllPaths {

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

    public boolean hasNode(int node) {
      return graph.containsKey(node);
    }

    public List<Integer> getNeighbours(int node) {
      return graph.getOrDefault(node, new ArrayList<Integer>());
    }
  }

  public static void printAllPaths(Graph graph, int source, int dest) {
    Set<Integer> isVisited = new HashSet<>();
    String path = "";
    printAllPathsUtil(graph, source, dest, isVisited, path);
  }
 
  private static void printAllPathsUtil(Graph graph, int current, int dest, Set<Integer> visited, String path) {
     if (visited.contains(current)) return;
     else if (current == dest)  System.out.println(path + " " + dest);
     else {
        for (int neighbour : graph.getNeighbours(current)) {
          Set<Integer> visitedNodes = new HashSet<>();
          visitedNodes.addAll(visited);
          visitedNodes.add(current);       
          printAllPathsUtil(graph, neighbour, dest, visitedNodes, path + " "+ current);	
        } 
     }
  }

  public static void main(String[] args) {
    Graph graph = new Graph(new HashMap<Integer, List<Integer>>());
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(0, 3);
    graph.addEdge(2, 0);
    graph.addEdge(2, 1);
    graph.addEdge(1, 3);
    
    printAllPaths(graph, 2, 3);  
    }
}

