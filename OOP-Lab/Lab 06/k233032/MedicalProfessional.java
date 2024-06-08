public class MedicalProfessional {
    String name;
    String specialization;

    MedicalProfessional(){
        this.name="null";
        this.specialization="null";
    }

    MedicalProfessional(String n, String specialization){
        this.name=n;
        this.specialization=specialization;
    }

    public String getName(){
        return this.name;
    }

    public String getSpecialization(){
        return this.specialization;
    }

    public void scheduleAppointment(Patient patient, String t){
        System.out.println("Patient Name: "+patient.getName()+"\nTime: "+t);
    }

    public void updatePatientRecords(Patient patient, String n){
        System.out.println("Updated\nName: "+patient.getName()+" to "+n);
    }

    public void administerMedication(Patient patient, Medication medication){
        System.out.println("Medication Administered to\nName: "+patient.getName()+" by "+name);
    }
    
}
