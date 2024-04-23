public class Node {
    private Planet planet;
    private Node next;
    
    public Node( Planet planet ) {
        this.planet = planet;
    }

    public Planet getPlanet() {
        return this.planet;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext( Node next ) {
        this.next = next;
    }
}