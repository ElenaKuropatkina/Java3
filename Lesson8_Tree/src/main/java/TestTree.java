public class TestTree {

    public static void main(String[] args) {

        int n = 7;
        int[][] data = new int[][] {{0, -1}, {1, 0}, {2, 0}, {3, 1}, {4, 3}, {5, 4}, {6, 0}};

        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(data[i], false);
        }

        Tree tree = new Tree(nodes);
        tree.passInDepth(nodes[0]);

    }
}
