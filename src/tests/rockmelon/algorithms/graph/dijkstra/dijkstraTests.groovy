package tests.rockmelon.algorithms.graph.dijkstra

import junit.framework.Assert
import org.junit.Test
import rockmelon.library.algorithms.graph.Dijkstra.DijkstraAlgorithm
import rockmelon.library.algorithms.graph.Edge
import rockmelon.library.algorithms.graph.Graph
import rockmelon.library.algorithms.graph.Vertex

/**
 * Created by reid gareth on 27/11/2017.
 */
public class dijkstraTests
{
    private List<Vertex> nodes;
    private List<Edge> edges;
    @Test
    public void finNearestEdgesTest()
    {
        nodes = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();
        for (int i = 0; i < 11; i++) {
            Vertex location = new Vertex("Node" + i, "Node" + i);
            nodes.add(location);
        }

        addEdge("Edge0", 0, 1, 85);
        addEdge("Edge1", 0, 2, 107);
        addEdge("Edge2", 0, 3, 12);
        addEdge("Edge3", 1, 4, 186);
        addEdge("Edge4", 2, 5, 174);
        addEdge("Edge5", 3, 6, 183);
        addEdge("Edge6", 4, 7, 250);
        addEdge("Edge7", 5, 7, 84);
        addEdge("Edge8", 6, 7, 167);
        addEdge("Edge9", 7, 8, 502);
        addEdge("Edge10", 9, 10, 40);
        addEdge("Edge11", 1, 10, 600);

        // Lets check from location Loc_1 to Loc_10
        Graph graph = new Graph(nodes, edges);
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        dijkstra.execute(nodes.get(0));
        LinkedList<Vertex> path = dijkstra.getPath(nodes.get(8));

        Assert.assertNotNull(path);
        Assert.assertTrue(path.size() > 0);

        for (Vertex vertex : path) {
            System.out.println(vertex);
        }
    }

    private void addEdge(String edgeId, int sourceNode, int destNodeNo,
                         int dist) {
        Edge edge = new Edge(edgeId,nodes.get(sourceNode), nodes.get(destNodeNo), dist );
        edges.add(edge);
    }

}
