import java.util.Scanner;

public class Patient {
  Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {

    }

    // fields
    private String patientName, patientAddress, patientCity, patientState, patientZip, patientPhoneNumber, emergencyContact;

    // constructor
    public Patient(String patientName,
    String patientAddress,
    String patientCity,
    String patientState,
    String patientZip,
    String patientPhoneNumber,
    String emergencyContact) {
      this.patientName = patientName;
      this.patientAddress = patientAddress;
      this.patientCity = patientCity;
      this.patientState = patientState;
      this.patientZip = patientZip;
      this.patientPhoneNumber = patientPhoneNumber;
      this.emergencyContact = emergencyContact;
    }

    // setters
    public void setPatientName(String patientName) {
      this.patientName = patientName;
    }
    public void setPatientAddress(String patientAddress) {
      this.patientAddress = patientAddress;
    }
    public void setPatientCity(String patientCity) {
      this.patientCity = patientCity;
    }
    public void setPatientState(String patientState) {
      this.patientState = patientState;
    }
    public void setPatientZip(String patientZip) {
      this.patientZip = patientZip;
    }
    public void setPatientPhoneNumber(String patientPhoneNumber) {
      this.patientPhoneNumber = patientPhoneNumber;
    }
    public void setEmergencyContact(String emergencyContact) {
      this.emergencyContact = emergencyContact;
    }

    // getters
    public String getPatientName() {
      return this.patientName;
    }

    public String getPatientAddress() {
      return this.patientAddress;
    }

    public String getPatientCity() {
      return this.patientCity;
    }

    public String getPatientState() {
      return this.patientState;
    }

    public String getPatientZip() {
      return this.patientZip;
    }

    public String getpatientPhoneNumber() {
      return this.patientPhoneNumber;
    }

    public String getEmergencyContact() {
      return this.emergencyContact;
    }
}
