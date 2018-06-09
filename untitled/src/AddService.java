public class AddService {
    private Node linkedlist;
    private Node service;

    public AddService(String serviceName) {
        this.linkedlist = AddMainServices.first;
        this.service = new Node(serviceName);
        search(this.linkedlist.getChild()).setNext(this.service);


    }

    public Node search(Node linkedlist) {
        if (linkedlist.getNext() == null) {
            return linkedlist;
        } else {
            while (linkedlist.getNext() != null) {
                search(linkedlist.getNext());
            }

        }
        return linkedlist;
    }

    public Node searchService(Node node, String service) {
        if (node.getData() == service) {
            return node;
        } else {
            searchService(node.getNext(), service);
        }
        return node;
    }

    public void listServiceFrom(String serviceName) {
        print(searchService(this.linkedlist.getChild(), serviceName));

    }

    public void print(Node node) {
        System.out.print(node.getData());
        print(node.getChild());
        print(node.getNext());
    }

    public void addOffer(String service, String agency) {
        if (searchService(linkedlist, service).getAgencyNumber() != 0) {
            searchService(linkedlist, service).setAgency(agency);
        } else {
            searchService(linkedlist, service).setAgencyNumber(searchService(linkedlist, service).getAgencyNumber() + 1);


        }
    }

    public void deleteService(String service, String agency) {
       if (deleteSearch(linkedlist,service,agency)){
           System.out.println("true");
       }


    }

    public boolean deleteSearch(Node node, String service, String agency) {
      while (node!=null) {
            if (node.getNext().getData() == service && node.getNext().getAgency() == agency) {
                if (node.getNext().getNext() != null) {
                    node.setNext(node.getNext().getNext());
                    return true;
                } else {
                    node.setNext(null);
                    return true;
                }
            } else {
                deleteSearch(node.getNext(), service, agency);

            }
        }
        return false;
    }
}

