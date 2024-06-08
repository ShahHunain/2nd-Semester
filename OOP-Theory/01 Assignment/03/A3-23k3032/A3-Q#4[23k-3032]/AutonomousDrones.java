public class AutonomousDrones{

    public static void main(String[] args) {

        System.out.println("\n--------Shah Hunain(23K-3032)--------\n");
        
        try{
            ReconDrone d = new ReconDrone(40, 74, 100, 30, 16, 10);
            d.takeoff();
            d.navigateTo(46, 94, 150);
            d.scanArea(100);
            d.land();
        }
        catch(Exception e){
            System.out.println("Exception occurred");
            System.out.println(e);
        }

    }

}