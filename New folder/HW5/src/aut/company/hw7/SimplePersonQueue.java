package aut.company.hw7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SimplePersonQueue extends PersonQueue {

    private ArrayList<Person> personArrayList;
    private int head;
    private int end;

    public SimplePersonQueue() {
        personArrayList = new ArrayList<>();
        head = 0;
        end = 0;

    }
    //WRITE YOUR OWN IMPLEMENTATION --> Any fields?! HOW ABOUT AN "ARRAYLIST"?

    /**
     * TODO
     * Returns the number of elements in this collection.  If this collection
     * contains more than {@code Integer.MAX_VALUE} elements, returns
     * {@code Integer.MAX_VALUE}.
     *
     * @return the number of elements in this collection
     */
    @Override
    public int size() {
       return personArrayList.size();

    }

    /**
     * TODO
     * Returns {@code true} if this collection contains no elements.
     *
     * @return {@code true} if this collection contains no elements
     */
    @Override
    public boolean isEmpty() {
        if (personArrayList.size()==0) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * TODO
     * Retrieves, but does not remove, the head of this queue.  This method
     * differs from {@link #peek peek} only in that it throws an exception
     * if this queue is empty.
     *
     * @return the head of this queue
     */
    @Override
    public Person element() {
        return personArrayList.get(head);
    }

    /**
     * TODO
     * Retrieves, but does not remove, the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    @Override
    public Person peek() {
        if (isEmpty()) {
            return null;
        } else
            return personArrayList.get(head);

    }

    /**
     * TODO
     * Returns {@code true} if this collection contains the specified element.
     * More formally, returns {@code true} if and only if this collection
     * contains at least one element {@code e} such that
     * {@code Objects.equals(o, e)}.
     *
     * @param o element whose presence in this collection is to be tested
     * @return {@code true} if this collection contains the specified
     * element
     */
    @Override
    public boolean contains(Object o) {
        Person p = (Person) o;
        boolean returned = false;
        Iterator iterator = personArrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(o)) {
                returned = true;

            } else {
                returned = false;
            }
        }
        return returned;
    }

    /**
     * TODO
     * Inserts the specified element into this queue if it is possible to do so
     * immediately without violating capacity restrictions, returning
     * {@code true} upon success and throwing an {@code IllegalStateException}
     * if no space is currently available.
     *
     * @param person the element to add
     * @return {@code true} (as specified by {@link Collection#add})
     */
    @Override
    public boolean add(Person person) {
        personArrayList.add(person);
        end++;
        if (end >= Integer.MAX_VALUE) {
            return false;
        } else {
            return true;
        }

    }

    /**
     * TODO
     * Removes a single instance of the specified element from this
     * collection, if it is present (optional operation).  More formally,
     * removes an element {@code e} such that
     * {@code Objects.equals(o, e)}, if
     * this collection contains one or more such elements.  Returns
     * {@code true} if this collection contained the specified element (or
     * equivalently, if this collection changed as a result of the call).
     *
     * @param o element to be removed from this collection, if present
     * @return {@code true} if an element was removed as a result of this call
     */
    @Override
    public boolean remove(Object o) {
        Person p = (Person) o;
        Iterator iterator=personArrayList.iterator();
        while (iterator.hasNext()){
            if (p.equals(iterator.next())){
                remove();
                return true;
            }
        }
        return false;
    }

    /**
     * TODO
     * Retrieves and removes the head of this queue.  This method differs
     * from {@link #poll poll} only in that it throws an exception if this
     * queue is empty.
     *
     * @return the head of this queue
     */
    @Override
    public Person remove() {
     return personArrayList.remove(head);

    }

    /**
     * TODO
     * Retrieves and removes the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    @Override
    public Person poll() {
      return personArrayList.remove(head);
    }

    /**
     * TODO
     * Removes all of the elements from this collection (optional operation).
     * The collection will be empty after this method returns.
     */
    @Override
    public void clear() {
        personArrayList.clear();
    }

}
