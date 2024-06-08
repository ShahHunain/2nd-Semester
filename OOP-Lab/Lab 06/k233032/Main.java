public class Main{
    public static void main(String[] args) {

                //Task 01     //SINGLE INHERITENCE
        /*
        MedicalStaff d = new MedicalStaff("Dr. Shah", "Surgeon");
        MedicalStaff n = new MedicalStaff("Sarah","Masters (in progress)");
        MedicalStaff p = new MedicalStaff("Heyhey", "Clinical Pharmacy");

        Patient patient = new Patient("Ali");
        Medication m = new Medication();

        d.scheduleAppointment(patient, "08:00 P.M");
        n.administerMedication(patient, m);
        p.updatePatientRecords(patient,"Ahmed");
        */

                //Task 02     //MULTI-LEVEL INHERITENCE
        /*
        SalesPerson s1 = new SalesPerson("Ali");
        SalesManager s2 = new SalesManager("Ahmed");
        GeneralManager s3 = new GeneralManager("Zohaib");

        s1.handleCustomerInquiries();
        s1.closeDeal();

        s2.handleCustomerInquiries();
        s2.closeDeal();
        s2.manage();

        s3.handleCustomerInquiries();
        s3.closeDeal();
        s3.manage();
        s3.overSee();
        */

                //Task 03     //HIERARCHICAL INHERITENCE
        /*
        String[] s_faculty = {"Dr Aziz","Dr Ali"};
        String[] h_faculty = {"Sarah","Ahmed"};
        String[] b_faculty = {"Shariq","Damil"};

        String[] s_couses = {"Chem","Bio"};
        String[] h_couses = {"Traits","Sociology"};
        String[] b_couses = {"Business Math","Intro to Accountancy"};

        Science science = new Science("Science", s_faculty, s_couses);
        Humanities humanities = new Humanities("Humanities", h_faculty, h_couses);
        Business business = new Business("Business", b_faculty, b_couses);

        science.scheduleClasses();
        science.manageResources();

        humanities.scheduleClasses();
        humanities.manageResources();

        business.scheduleClasses();
        business.manageResources();
        */

                //Task 04     //HYBRID INHERITENCE

        Buyer b = new Buyer("Ali(Buyer)");
        Seller s = new Seller("Ahmed(Seller)");
        Admin a = new Admin("Assasin(Admin)");
        BuyerSeller bs = new BuyerSeller("Smith");     //class of Buyer Seller extends Buyers class

        Product p = new Product("Mac-Book");

        b.manage();
        b.makePurchase(p);
        s.viewSaleProductList(p);
        a.makePurchase(p);
        a.viewSaleProductList(p);
        bs.makePurchase(p,856.70);

    }

}