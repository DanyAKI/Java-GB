
public class Employee {

    private String name;
    private String post;
    private String email;
    private String number;
    private int salary;
    private int age;


 public Employee (String name, String post, String email, String number, int salary, int age){
     this.name = name;
     this.post = post;
     this.email = email;
     this.number = number;
     this.salary = salary;
     this.age = age;
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Inform(){
     System.out.println(
             String.format("Employee[%s] -> Age: %s",name ,age)

     );
 }
}


