package aut.company;

public class Music {
    private String name;
    private int index;
    private String year;

     public Music(){
         this("unkhown","unkhown",0);
     }

     public Music(String name,String year,int index){
         this.index=index;
         this.name=name;
         this.year=name;


     }
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
