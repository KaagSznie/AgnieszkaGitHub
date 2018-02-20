package Heritage.filesystem;

public abstract class Node {
    String name;
    Directory parent;
    Node[] children = new Node[100];
    
    public Node (String name) {
        this.name = name;
    }  
}
