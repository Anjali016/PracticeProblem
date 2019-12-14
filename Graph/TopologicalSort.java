import java.util.*;

public class TopologicalSort {
  
  private static class Graph {
    Map<Integer, List<Integer>> graph ;

    public Graph(Map<Integer, List<Integer>> graph) { this.graph = graph; }

    public void addEdge(int source, int des) {
      List<Integer> neighbours = graph.getOrDefault(source, new ArrayList<Integer>());
      neighbours.add(des);
      graph.put(source, neighbours);
    }
  
    public List<Integer> allNodes() {
      List<Integer> nodes = new ArrayList<>();  
      for(Integer key : graph.keySet()) nodes.add(key);
      return nodes;
    }
   
    public List<Integer> getNeighbours(int node) {  return  graph.getOrDefault(node, new ArrayList<Integer>()); }
  }
  
  public static Stack<Integer> topologicalSort(Graph graph, int source ) {
    Set<Integer> visited = new HashSet<>();
    Stack<Integer> stack = new Stack<>();
    for (int node : graph.allNodes()) if (!visited.contains(node))  tSort(graph, node, stack, visited);
    return stack;
  }

  private static void tSort(Graph graph, int node, Stack<Integer> stack, Set<Integer> visited) {
   visited.add(node);
   for (int neighbour : graph.getNeighbours(node)) {
     if(!visited.contains(neighbour)) tSort(graph, neighbour, stack, visited); 
   }  
   stack.push(node);
  }

  public static void main(String[] args) {
    Graph graph = new Graph(new HashMap<Integer, List<Integer>>());
    graph.addEdge(2, 3);
    graph.addEdge(3, 1);
    graph.addEdge(4, 1);
    graph.addEdge(4, 0);
    graph.addEdge(5, 2);
    graph.addEdge(5, 0);
    Stack<Integer> res = topologicalSort(graph, 0);
    while(!res.isEmpty()) {
     int temp = res.pop(); 
     System.out.print(temp + ", ");
    }
  }
}
