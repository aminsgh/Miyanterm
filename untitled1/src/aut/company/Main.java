package aut.company;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student[] studentsList=new Student[2];
        student1.setId(1);
        student2.setId(2);
        student1.setGrade(13);
        student2.setGrade(17);
        Lab lab = new Lab(3, "1/1/2222");
        lab.addNewStudent(student1);
        lab.addNewStudent(student2);
        lab.clculateAverege();
        lab.print();
        lab.setStudents(lab.getStudents());
        String[] courses = new String[2];
        courses[0]="AP";
        courses[1]="lab";
        Teacher teacher1 = new Teacher("a", "5,10", courses);
        Class clazz = new Class("ad,", "3.5", "5.7");
        String[] course = new String[2];

        Teacher teacher = new Teacher("a", "4", course);

        studentsList[0]=student1;
        studentsList[1]=student2;
        Class clazz1=new Class("102","1,2","8,1");
        clazz1.setStudents(studentsList);
        teacher1.toStrings();



    }
}
