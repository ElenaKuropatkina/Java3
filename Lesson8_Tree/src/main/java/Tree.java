public class Tree {

    Node[] nodes;

    Tree(Node[] nodes){
        this.nodes = nodes;
    }

    public void passInDepth(Node node) {
        node.setVisited(true);
        System.out.println(node.getValue()[0]);
        for (Node n : nodes) {
            if (n.isVisited() == false && n.getValue()[1] == node.getValue()[0]) {
                passInDepth(n);
            }
        }
    }
}






