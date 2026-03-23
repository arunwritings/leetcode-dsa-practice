package datastructures.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph_133 {

    public static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    private final Map<Node, Node> visitedNodes = new HashMap<>();

    public Node cloneGraph(Node node) {
        return dfs(node);
    }

    private Node dfs(Node node) {
        if (node==null) return null;

        Node clonedNode =visitedNodes.get(node);
        if (clonedNode==null) {
            clonedNode = new Node(node.val);
            visitedNodes.put(node, clonedNode);
            for (Node neighbour : node.neighbors) {
                clonedNode.neighbors.add(dfs(neighbour));
            }
        }
        return clonedNode;
    }
}
