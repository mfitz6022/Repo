import java.util.Scanner;

public class Procedure {
  Scanner stdin = new Scanner(System.in);
    private String procedureName, procedureDate, practitioner;
    private double procedureCharge;

    public static void main(String[] args) {

    }

    // constructor
    public Procedure(String procedureName, String procedureDate, String practioner, double procedureCharge) {
      this.procedureName = procedureName;
      this.procedureDate = procedureDate;
      this.practitioner = practioner;
      this.procedureCharge = procedureCharge;
    }

    // setter
    public void setProcedure() {
      procedureName = stdin.nextLine();
      System.out.print("Date: ");
      procedureDate = stdin.nextLine();
      System.out.print("Practitioner: ");
      practitioner = stdin.nextLine();
      System.out.print("Charge: ");
      procedureCharge = stdin.nextFloat();
    }

    // getters
    public String getProcedureName() {
      return this.procedureName;
    }

    public String getProcedureDate() {
      return this.procedureDate;
    }

    public String getPractitioner() {
      return this.practitioner;
    }

    public double getProcedureCharge() {
      return this.procedureCharge;
    }
}
