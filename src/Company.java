class Company {
    private Employee[] employees;
    private int size;

    public Company(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size] = employee;
            size++;
        } else {
            System.out.println("Company is at full capacity!");
        }
    }
    // trung binh luong
    public double calculateAverageSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calculateSalary();
        }
        return totalSalary / size;
    }
    // luong fulltime
    public void listFullTimeEmployeesBelowAverage() {
        double averageSalary = calculateAverageSalary();
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof FullTimeEmployee && employees[i].calculateSalary() < averageSalary) {
                System.out.println(employees[i]);
            }
        }
    }
    //luong parttime
    public double calculateTotalPartTimeSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof PartTimeEmployee) {
                totalSalary += employees[i].calculateSalary();
            }
        }
        return totalSalary;
    }
}
