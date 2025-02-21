public class DomesticDivision extends Division {
    private String state;

    // Constructor requiring all fields, including those from Division
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // Implementation of the display() method for domestic divisions
    @Override
    public void display() {
        System.out.println("Domestic Division:");
        System.out.println("Division Name: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
        System.out.println("------------------------");
    }
}

