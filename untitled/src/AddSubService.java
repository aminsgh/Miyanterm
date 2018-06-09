public class AddSubService {
    private String data;
    private String subData;
    private Node newNod;
    private Node fatherNewNod;
    private Node linkedlist;

    public AddSubService(String subData, String data) {
        this.linkedlist=AddMainServices.first;
        this.data = data;
        this.subData = subData;
        this.newNod = new Node(data);
        addintion(newNod);

    }

    public Node searchNode(Node node) {
        while (node.getData() != data) {

            if (node.getChild() == null && node.getNext() == null) {
                break;
            } else {
                searchNode(node.getChild());
                searchNode(node.getNext());
            }
        }
        return node;
    }

    public void addintion(Node addintion) {
        this.fatherNewNod = searchNode(linkedlist);
        if (fatherNewNod.getTemp() == 1) {
            while (fatherNewNod.getNext() != null) {
                fatherNewNod = fatherNewNod.getNext();
            }
            fatherNewNod.setNext(addintion);
            fatherNewNod.setTemp(1);
        } else {
            fatherNewNod.setChild(addintion);
            fatherNewNod.setTemp(1);
        }
    }

}
