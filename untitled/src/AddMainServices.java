public class AddMainServices {

    private Node sevricename;
    private Node descriptoins;
    private Node carModel;
    private Node help;
    private Node financial;

    static final Node first = new Node("linked list of service");


    public AddMainServices(String Servicename, String CarModel, String Help, String Descriptoin, String Financial) {

        sevricename = new Node();
        carModel = new Node();
        descriptoins = new Node();
        help = new Node();
        financial = new Node();
        crater(Servicename, CarModel, Help, Descriptoin, Financial);

    }

    public void crater(String serviceName, String carModel, String help, String description, String financial) {
        this.first.setNext(this.sevricename);
        this.sevricename.setNext(this.descriptoins);
        this.descriptoins.setNext(this.carModel);
        this.carModel.setNext(this.help);
        this.help.setNext(this.financial);
        this.financial.setNext(null);
        this.sevricename.setData(serviceName);
        this.descriptoins.setData(description);
        this.carModel.setData(carModel);
        this.help.setData(help);
        this.financial.setData(financial);

    }

    public Node getFirst() {
        return first;
    }

    public void listService() {
        print(first);


    }

    public void print(Node node) {
        if (node.getTemp() == 0) {
            System.out.print(node.getData());
            print(node.getNext());
            System.out.print("*");
        } else{
            System.out.print(node.getData());
            System.out.print("(");
            print(node.getChild());
            System.out.print(")");

        }
    }

}
