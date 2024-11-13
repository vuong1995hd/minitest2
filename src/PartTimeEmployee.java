class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee(String id, String name, int age, String phone, String email, int workingHours) {
        super(id, name, age, phone, email);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return workingHours * 100000;
    }

    public int getWorkingHours() {
        return workingHours;
    }
}
