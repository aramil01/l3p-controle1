package fr.dm.proxy.composite;
import java.util.*;
public class Employee{
  String name;
  String category;
  private Boolean Worker;
  private Set<Employee> Employer = new HashSet<>();

  @Override
   public String toString() {
       return "Employee{" +
               "name='" + name + '\'' +
               ", category=" + category +
                ", Worker=" + Worker +
                 ", Employer=" + Employer +
               '}';
   }


public String getCategory(){
  return category;
}
public string getName(){
  return name;
}
}
public void setName(String name) {
    this.name = name;
}
public void setCategory(String name) {
    this.category = category;
}

public Boolean isWorker(){
  return Worker;
}
public void setWorker(String name) {
    this.Worker = Worker;
}
public Set<Employee> getEmployer() {
     return Employer;
 }
public void setEmployee(Set<Employee> Employer) {
     this.Employer = Employer;
 }







public static void main(String[] args) {
  Employee empl1 = new Employee();
  empl1.SetName("Yvette");
  empl1.setCategory("CEO");

  Employee empl2 = new Employee();
  empl2.SetName("Jean-Patrick");
  empl2.setCategory("Developper");

  Employee empl3 = new Employee();
  empl3.SetName("Jean-Christophe");
  empl3.setCategory("Developper");

  Employee empl4 = new Employee();
  empl4.SetName("Jean-Yves");
  empl4.setCategory("Developper");

  Employee empl5 = new Employee();
  empl5.SetName("Jean-Mouloud");
  empl5.setCategory("Developper");

  Employee empl6 = new Employee();
  empl6.SetName("Sylvie");
  empl6.setCategory("Accountant");

  Employee empl7 = new Employee();
  empl7.SetName("Marie-Jeanne");
  empl7.setCategory("Marketing");

  Employee empl8 = new Employee();
  empl8.SetName("Marie-Christelle");
  empl8.setCategory("Marketing");

  Employee empl9 = new Employee();
  empl9.SetName("Marie-Claire");
  empl5.setCategory("Marketing");





















}
