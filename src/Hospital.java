import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital {

    public Hospital() {
        addPatient(patientInformation());
    }

    Scanner input = new Scanner(System.in);
//    public Map<Integer, List<Patient>> addPatient(){
//
//        Map<Integer, List<Patient>>
//
//
//    }

    /**
     * to add patien in a formel list
     * @param info takes user all information about patient
     * @return list of patient data
     */
    public List<Patient> addPatient(Patient info) {
        List<Patient> savePatient = new ArrayList<>();
        savePatient.add(patientInformation());
        return savePatient;
    }

    /**
     * takes user information
     * @return user data
     */
    private Patient patientInformation() {
        Patient information = new Patient();

        System.out.println("please Enter your Name");
        String name = input.nextLine();
        information.setName(name);

        System.out.println("please Enter your Lastname");
        String lastname = input.nextLine();
        information.setLastName(lastname);

        //   System.out.println("please Enter your roomnumber ");
        // roomnumber genrate method and logik


        System.out.println("please Enter your room number ");
        String roomNum = input.nextLine();
        information.setRoomNumber(roomNum);

        System.out.println("please Enter your phone number");
        String phoneNumber = input.nextLine();
        information.setPhoneNumber(phoneNumber);

        System.out.println("please Enter your Address");
        String addressOFPatient = input.nextLine();
        information.setAdress(addressOFPatient);

        return information;

    }


}
