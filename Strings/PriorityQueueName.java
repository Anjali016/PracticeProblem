import java.util.*;

public class PriorityQueueName {

  private static class Student {
    String name ;
    int age; 

    Student(String name, int age){
      this.name = name;
      this.age = age;
    }
  }
  
  private static Comparator<Student> ageComparator = new Comparator<Student>(){
    @Override
    public int compare(Student s1, Student s2){ return s1.name.compareTo(s2.name);}
  }; 

  public static void main(String[] args){
    Queue<Student> pq = new PriorityQueue<>(ageComparator);
    pq.add(new Student("Zac", 201));
    pq.add(new Student("Jack", 401));
    pq.add(new Student("Abby", 101));
    pq.add(new Student("Katy", 301));
    while(!pq.isEmpty()){
      Student s = pq.remove();
      System.out.println(s.name + ":" + s.age);
    }
  }
}

