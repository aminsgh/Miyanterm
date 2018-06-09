package aut.company;

import aut.company.Rectangle;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
///////4

        int time = 0;
        Random random = new Random();
        Queue newQueue = new Queue();
        Person person1 = new Person("a1", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person1);
        Person person2 = new Person("a2", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person2);
        Person person3 = new Person("a3", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person3);
        Person person4 = new Person("a4", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person4);
        Person person5 = new Person("a5", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person5);
        Person person6 = new Person("a6", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person6);
        Person person7 = new Person("a7", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person7);
        Person person8 = new Person("a8", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person8);
        Person person9 = new Person("a9", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person9);
        Person person10 = new Person("a10", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person10);
        Person person11 = new Person("a11", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person11);
        Person person12 = new Person("a12", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person12);
        Person person13 = new Person("a13", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person13);
        Person person14 = new Person("a14", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person14);
        Person person15 = new Person("a15", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person15);
        Person person16 = new Person("a16", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person16);
        Person person17 = new Person("a17", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person17);
        Person person18 = new Person("a18", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person18);
        Person person19 = new Person("a19", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person19);
        Person person20 = new Person("a20", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person20);
        Person person21 = new Person("a21", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person21);
        Person person22 = new Person("a22", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person22);
        Person person23 = new Person("a23", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person23);
        Person person24 = new Person("a24", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person24);
        Person person25 = new Person("a25", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person25);
        Person person26 = new Person("a26", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person26);
        Person person27 = new Person("a27", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person27);
        Person person28 = new Person("a28", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person28);
        Person person29 = new Person("a29", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person29);
        Person person30 = new Person("a30", newQueue.getPersonQueue().size() * 2 + random.nextInt(10));
        newQueue.enqueue(person30);
        for (int i = 0; i < newQueue.getPersonQueue().size(); i++) {
            time += newQueue.getPersonQueue().get(i).getTime();
        }
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        newQueue.dequeue();
        System.out.println("queue size :" + newQueue.getPersonQueue().size());
        System.out.println(time / 30);
        System.out.println("queue size :" + newQueue.getPersonQueue().size());

        ////////////////////
////////5
        Point p1 = new Point(2, 3);
        Circle c1 = new Circle(p1, 3);
        p1.setX(5);
        p1.setY(6);
        System.out.println("Perimeter circle : " + c1.getPerimeter() + "/ area circle : " + c1.getArea());

        System.out.println(c1.getCenter().getX() + "," + c1.getCenter().getY());
        Point p2 = new Point(0, 0);
        Square s1 = new Square(p2, 4);
        s1.setStart(p1);
        System.out.println(s1.getStart().getX() + "," + s1.getStart().getY());
        System.out.println("Perimeter Square  : " + s1.getPerimeter() + "/ area Square : " + s1.getArea());
        Point p3 = new Point(1, 1);
        Rectangle.setStart(p3);
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(7, 6, p1);


        System.out.println(r1.getStart().getX() + "," + r1.getStart().getY());
        System.out.println("Perimeter rectangle1  : " + r1.getPerimeter() + "/ area rectangle1 : " + r1.getArea());
        System.out.println("Perimeter rectangle2 : " + r2.getPerimeter() + "/ area rectangle2 : " + r2.getArea());


    }


}
