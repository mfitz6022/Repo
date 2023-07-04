/*
 * Class: CMSC203 
 * Instructor:
 * Description: create patient and procedure application
 * Due: 07/03/2023
 * Platform/compiler:
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Matthew Fitzgerald
*/

import java.util.Scanner;

public class PatientDriverApp {
  Scanner stdin = new Scanner(System.in);
  public static void main(String[] args) {
    Patient patient1 = new Patient("Jenny Elaine Santori", "123 Main St", "Rockville", "MD", "20877", "301-123-4567", "Bill Santori 777-555-1212");
    System.out.println("Patient name: " + patient1.getPatientName());
    System.out.println("Patient address: " + patient1.getPatientAddress());
    System.out.println("Patient city: " + patient1.getPatientCity());
    System.out.println("Patient state: " + patient1.getPatientState());
    System.out.println("Patient zip: " + patient1.getPatientZip());
    System.out.println("Patient phone number: " + patient1.getpatientPhoneNumber());
    System.out.println("Emergency contact info: " + patient1.getEmergencyContact());


    Procedure procedure1 = new Procedure("Physical Exam", "7/20/2023", "Dr. Irvine", 250.0);
    Procedure procedure2 = new Procedure("X-ray", "7/20/2023", "Dr. Jamison", 500.0);
    Procedure procedure3 = new Procedure("Blood Test", "7/20/2023", "Dr. Smith", 200.0);

    // procedure 1
    System.out.println("Procedure: " + procedure1.getProcedureName());
    System.out.println("Date: " + procedure1.getProcedureDate());
    System.out.println("Practitioner: " + procedure1.getPractitioner());
    System.out.println("Charge: " + procedure1.getProcedureCharge() + "\n");

    // procedure 2
    System.out.println("Procedure: " + procedure2.getProcedureName());
    System.out.println("Date: " + procedure2.getProcedureDate());
    System.out.println("Practitioner: " + procedure2.getPractitioner());
    System.out.println("Charge: " + procedure2.getProcedureCharge() + "\n");

    // procedure 3
    System.out.println("Procedure: " + procedure3.getProcedureName());
    System.out.println("Date: " + procedure3.getProcedureDate());
    System.out.println("Practitioner: " + procedure3.getPractitioner());
    System.out.println("Charge: " + procedure3.getProcedureCharge() + "\n");

    System.out.println("Student name: Matthew Fitzgerald");
    System.out.println("Student MC M#: M20995278");
    System.out.println("Due Date: 07/03/2023");
  }
}