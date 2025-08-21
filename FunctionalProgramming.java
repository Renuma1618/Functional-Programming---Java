
import java.util.*;
import java.util.stream.*;
//class
class Employees{
    int id;
    String Name;
    String department;
    int Salary;
  //constructors
    Employees(int id , String Name, String department, int Salary){
        this.id = id;
        this.Name = Name;
        this.department  = department;
        this.Salary = Salary;

        }
        public String toString(){
          return id + " " + Name + " " + department + " "+ Salary;

    }
}
//main function
public class FunctionalProgramming{
    public static void main(String[] args){
        List<Employees>employees = Arrays.asList(
                new Employees(1,"Renuka","IT",100000),
                new Employees(2,"Shiva","IT", 500000),
                new Employees(3,"Kamala","HR",70000),
                new Employees(4,"Karthik","Finance",600000)
        );
        // filter //Stream
        employees.stream()
                .filter(e->e.department.equals("IT"))
                .forEach(System.out::println);

        //Sort byy salary
        employees.stream()
                .sorted((e1,e2)->Double.compare(e1.Salary,e2.Salary))
                //method refernce
                .forEach(System.out::println);

        //map:transforms names to employees
        employees.stream()
                .map(e->e.Name.toUpperCase())
                .forEach(System.out::println);

        //reduce
        int totalsalary = employees.stream()
                .map(e->e.Salary)
                .reduce(0,(a,b)->a+b);
        System.out.println("total salary" +totalsalary);

          //collect
        List<Employees> itEmployees = employees.stream()
                .filter(e -> e.department.equals("IT"))
                .collect(Collectors.toList());
        System.out.println("IT Employees: " + itEmployees);


    }

}
// we can aslo perfrom at a time like
//classname stream()
//.filter(condition)
//.map()
//.sorted()