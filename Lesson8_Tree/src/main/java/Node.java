public class Node {
    private int[] value;
    private boolean isVisited;

    public Node(int[] value, boolean isVisited) {
        this.value = value;
        this.isVisited = isVisited;
    }

    public int[] getValue() {
        return value;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

}

