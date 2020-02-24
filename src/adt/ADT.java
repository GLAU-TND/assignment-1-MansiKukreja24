package adt;
public interface ADT<Person>{
    boolean add(Person person);
    boolean remove(int index);
    void search(String name);
    void viewAll();
  }
  
