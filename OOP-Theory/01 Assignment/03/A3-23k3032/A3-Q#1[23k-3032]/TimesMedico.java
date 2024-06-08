public class TimesMedico{

    static double overallRevenue=2500.99;

    public static void main(String[] args) {

        System.out.println("\n--------Shah Hunain(23K-3032)--------\n");
        
        Tablet[] t = new Tablet[2];
        t[0]=new Tablet("Panadol", "abcd", 100, "23-3-24", "29-7-24", 0.449);
        t[1]=new Tablet("Disprin", "abcdef", 100, "23-3-24", "29-7-24", 0.379);

        Capsule[] c = new Capsule[2];
        c[0]=new Capsule("Evion", "xyz", 45.99, "1-5-24", "1-8-24", 59.99);
        c[1]=new Capsule("Callo", "vwxyz", 39.00, "10-2-24", "11-8-24", 59.99);

        Syrup[] s = new Syrup[2];
        s[0]=new Syrup("Calpol", "abxy", 250.0,"3-3-24", "5-6-24");
        s[1]=new Syrup("Actified-P", "defghi", 300.99,"9-9-23", "10-7-24");

        Counter counter = new Counter();
        boolean counterFound = counter.searchMedicine(t, c, s);

        if(!counterFound){
            Pharmacist p = new Pharmacist();
            p.searchMedicine(t, c, s);
        }

    }

}