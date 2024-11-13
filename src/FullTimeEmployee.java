class FullTimeEmployee extends Employee {
    private double bonus;
    private double fine;
    private double baseSalary;

    public FullTimeEmployee(String id, String name, int age, String phone, String email, double bonus, double fine, double baseSalary) {
        super(id, name, age, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (bonus - fine);
    }

    public double getBonus() {
        return bonus;
    }

    public double getFine() {
        return fine;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
