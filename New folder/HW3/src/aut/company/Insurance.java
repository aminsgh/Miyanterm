package aut.company;

public class Insurance {
    private String name;

    public Insurance(String name) {
        this.name = name;
    }

    public void register(Employee employee){
    if (employee.getFirstName().equals(employee.getFirstNameOfSpouse())||employee.getLastName().equals(employee.getFirstNameOfSpouse())){
        System.out.println("*"+"<<Insurance record for employee :"+employee.getFirstName()+employee.getLastName()+"cannot be registered!>>");
    }else {
        System.out.println("/"+"An Insurance record for employee :"+employee.getFirstName()+employee.getLastName()+" successfully registered by company :" +this.name);
    }

}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
