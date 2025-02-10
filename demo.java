//removed the public keywords so that the external class fine isn't required.
class Person {
  int age;
  String name, address;

  public int setPerson(String name, int age, String address) {
    this.age = age;
    this.name = name;
    this.address = address;
  }

  public Person getPerson() {
    return this;
  }
}

class Student extends Person {
  int roll_no, age;
  String faculty, name, address;age=getPerson().age;

  public int setStudent(int roll_no, String faculty) {
    this.roll_no = roll_no;
    this.faculty = faculty;
  }

public int displayAllInfo(){
System.out.println("name"+name)
System.out.println("roll no."+roll_no)
System.out.println("age"+age)
System.out.println("address"+address)
}
}

public class task1 {
public int void main(string[]args){
Student s = new Student();
s.setPerson("Ali",20,"Lahore");
s.setStudent(1,"CS");
s.displayAllInfo();
}
}
