//Create a class Person with the following data members: name, age, and address. Also, create functions to set and get these data members. Derive the Person class into a Student class, which has two data members: rollNo and faculty. Create functions to set and get these two data members and display all the details using display functions.

class Person {
  int age;
  String name, address;

  public void setPerson(String name, int age, String address) {
    this.age = age;
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }
}

class Student extends Person {
  int rollNo;
  String faculty;

  public void setStudent(int rollNo, String faculty) {
    this.rollNo = rollNo;
    this.faculty = faculty;
  }

  public void displayAllInfo() {
    System.out.println("Name: " + getName()); // Use getters
    System.out.println("Roll No: " + rollNo);
    System.out.println("Age: " + getAge()); // Use getters
    System.out.println("Address: " + getAddress()); // Use getters
    System.out.println("Faculty: " + faculty);

  }
}

public class Task1 { // Class names should start with a capital letter
  public static void main(String[] args) { // main must be static and void
    Student s = new Student();
    s.setPerson("Ali", 20, "Lahore");
    s.setStudent(1, "CS");
    s.displayAllInfo();
  }
}
