import java.util.*;

public class SortByAge {

  private static class Person {
    String name;
    int weight;

    public Person(String name, int weight){
      this.name = name;
      this.weight = weight;
    } 
  }
  
  static List<Person> sortAge(List<Person> person){
    Collections.sort(person, ageComparator);
    return person;
  }
 
  public static Comparator<Person> ageComparator = new Comparator<Person>() {
    @Override
    public int compare(Person p1, Person p2){ return p1.weight - p2.weight ;}
  };

  public static void main(String[] args){
    List<Person> person = new ArrayList<>();
    person.add(new Person("John", 43));
    person.add(new Person("Mary", 14));
    person.add(new Person("Alex", 23));
    person.add(new Person("Bob", 12));
    List<Person> res = sortAge(person);
    for(Person p : person) System.out.println(p.name + ":" + p.weight);    
  }
}
     
