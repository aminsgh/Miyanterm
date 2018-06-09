public class HeapNode {

    private String data;
    private String service;
    private String agency;
    private int preference;
    private int[] preferencePlus = new int[5];

    public HeapNode(String service, String agency, String name, char ch, int[] preferencePlus) {
        this.service = service;
        this.agency = agency;
        this.data = name;
        if (ch == 'a')
            this.preference = 1;
        if (ch == 'b')
            this.preference = 2;
        if (ch == 'c')
            this.preference = 3;
        this.preferencePlus = preferencePlus;

    }

    public HeapNode() {

    }


    public void setPreference(int year, int month, int day, int hour, int second) {
        this.preferencePlus[0] = year;
        this.preferencePlus[1] = month;
        this.preferencePlus[2] = day;
        this.preferencePlus[3] = hour;
        this.preferencePlus[4] = second;

    }

    public int getPreference() {
        return preference;
    }

    public void setPreference(int preference) {
        this.preference = preference;
    }

    public String getData() {
        return data;
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

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getPreferencePlus(int i) {
        return preferencePlus[i];
    }
}
