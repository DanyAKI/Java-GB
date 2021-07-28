
public class main {
    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Irina Kruz", "Devrloper", "Irina@mailbox.com", "897578389", 50000, 40);
        employeesArray[1] = new Employee("Max Oblibixin", "Engineer", "Max@mailbox.com", "892346646", 40000, 20);
        employeesArray[2] = new Employee("Olga Titova", "Asistent", "Olga@mailbox.com", "893475867", 20000, 55);
        employeesArray[3] = new Employee("Igor Olkov", "Master", "Igor@mailbox.com", "895653442", 10000, 69);
        employeesArray[4] = new Employee("Ignat Bond", "Director", "Ignat@mailbox.com", "895675345", 100000, 22);

        printEmployByAge(employeesArray, 40);

    }

    static void printEmployByAge(Employee[] employees, int age) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > age) {
                employees[i].Inform();
            }
        }
    }
}


