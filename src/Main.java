
public class Main{
    public static void main(String[] args) {
        Company company = new Company(100);

        company.addEmployee(new FullTimeEmployee("E001", "Alice", 31, "123456789", "alice@example.com", 5000, 1000, 20000));
        company.addEmployee(new FullTimeEmployee("E002", "Bob", 29, "987654321", "bob@example.com", 3000, 500, 18000));
        company.addEmployee(new PartTimeEmployee("E003", "Charlie", 26, "555666772", "charlie@example.com", 40));
        company.addEmployee(new PartTimeEmployee("E004", "David", 22, "888999000", "david@example.com", 35));

        System.out.println("Average salary: " + company.calculateAverageSalary());
        System.out.println("Full-time employees with salary below average:");
        company.listFullTimeEmployeesBelowAverage();
        System.out.println("Total part-time salary: " + company.calculateTotalPartTimeSalary());
    }
}
