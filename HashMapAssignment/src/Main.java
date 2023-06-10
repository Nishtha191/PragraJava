import java.util.*;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Smith", 30, 50000, "Amazon");
        Employee employee2 = new Employee("Jane", "Doe", 35, 60000, "Apple");
        Employee employee3 = new Employee("Michael", "Johnson", 28, 40000, "Amazon");
        Employee employee4 = new Employee("Emily", "Davis", 32, 35000, "Google");
        Employee employee5 = new Employee("David", "Wilson", 27, 65000, "Amazon");

        Date d1= new Date(23, 9, 16);
        Date d2 = new Date(23,9,20);
        Team team1 = new Team("Digital Wallet", "Feature1, Feature2", "Mark", 100000,d1);
        Team team2 = new Team("Mobile App", "Feature3, Feature4", "Adam", 80000,d2);

        // Add salaries to employees
        employee1.salary = 50000;
        employee2.salary = 60000;
        employee3.salary = 40000;
        employee4.salary = 35000;
        employee5.salary = 65000;

        // Create HashMap with key Employee and value Team
        HashMap<Employee, Team> employeeTeamMap = new HashMap<>();
        employeeTeamMap.put(employee1, team1);
        employeeTeamMap.put(employee2, team1);
        employeeTeamMap.put(employee3, team2);
        employeeTeamMap.put(employee4, team2);
        employeeTeamMap.put(employee5, team1);

        // Print all records each in one line

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("-----Print all records each in one line----");
        System.out.println("--------------------------------------------------------------------------------");
        employeeTeamMap.entrySet().forEach(System.out::println);
        System.out.println("********************************************************************************");




        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("-----Print records with Full Name,Company Name, StakeHolder and Project Name----");
        System.out.println("--------------------------------------------------------------------------------");
        for (Map.Entry<Employee, Team> entry : employeeTeamMap.entrySet()) {
            System.out.println(entry.getKey().firstName + " " + entry.getKey().lastName + " is working under " +
                    entry.getValue().stakeholders + " in " + entry.getValue().projectName + " Team.");
        }
        System.out.println("--------------------------------------------------------------------------------");



        // Remove employees below 50000 salary
        Iterator<Employee> iterator = employeeTeamMap.keySet().iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.salary < 50000) {
                iterator.remove();
            }
        }

        Set<Employee> highSalaryEmployees = employeeTeamMap.keySet();

        // Print that set
        System.out.println("********************************************************************************");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("-----Remove employees below 50000 salary & print all records each in one line----");
        System.out.println("--------------------------------------------------------------------------------");
        for(Employee key : highSalaryEmployees)
        {
            System.out.println(key);
        }


//        System.out.println(highSalaryEmployees);

        // Convert the set to a list
        List<Employee> employeeList = new ArrayList<>(highSalaryEmployees);

        // Print the list
        System.out.println("********************************************************************************");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("-----Get the set of employees which has salary of 50000 or higher & Print that set----");
        System.out.println("--------------------------------------------------------------------------------");
        for(Employee key : employeeList)
        {
            System.out.println(key);
        }
//        System.out.println(employeeList);

        // Remove employee which has salary 50000 from the list
        Iterator<Employee> listIterator = employeeList.iterator();
        while (listIterator.hasNext()) {
            Employee employee = listIterator.next();
            if (employee.salary == 50000) {
                listIterator.remove();
            }
        }

        // Print updated list
        System.out.println("********************************************************************************");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("-----Remove employee which has salary 50000 from that list & print updated list----");
        System.out.println("--------------------------------------------------------------------------------");
        for(Employee key : employeeList)
        {
            System.out.println(key);
        }
//        System.out.println(employeeList);

    }
}