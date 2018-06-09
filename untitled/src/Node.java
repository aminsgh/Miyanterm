public class Node {
    private Node child;
    private Node next;
    private int temp;
    private int agencyNumber;
    private String data, agency;

    public Node(String data) {
        this.temp = 0;
        this.data = data;
        this.agency = null;
        this.child = null;
        this.next = null;
    }

    public Node(Node child) {
        this.temp = 1;
        this.data = null;
        this.child = child;
        this.next = null;
    }

    public Node() {
        this.temp = 0;
        this.data = null;
        this.child = null;
        this.next = null;
    }

    public void addChildNode(Node father, Node child) {
        father.child = child;
    }

    public void addNextNode(Node father, Node child) {
        father.next = child;
    }

    public int getTemp() {
        return temp;
    }

    public Node getChild() {
        return child;
    }

    public Node getNext() {
        return next;
    }

    public String getData() {
        return data;
    }

    public void setChild(Node child) {
        this.child = child;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(int agencyNumber) {
        this.agencyNumber = agencyNumber;
    }
}
