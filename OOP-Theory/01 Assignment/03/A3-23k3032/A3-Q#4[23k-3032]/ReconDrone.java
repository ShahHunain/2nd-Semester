public class ReconDrone extends Drone implements Flyable, Scannable{

    int cameraResolution;
    int maxFlightTime;

    ReconDrone(float latitude, float longitude, float altitude, float speed, int cameraResolution, int maxFlightTime){
        super(latitude, longitude, altitude, speed);
        this.cameraResolution=cameraResolution;
        this.maxFlightTime=maxFlightTime;
    }

    public void land(){
        System.out.println("ReconDrone is landing");
    }

    public void takeoff(){
        System.out.println("ReconDrone is taking off");
    }

    public void adjustAltitude(float meters){
        this.altitude=this.altitude+meters;
        System.out.println("Altitude: "+altitude);
    }

    public void setSpeed(float speed){
        this.speed=speed;
        System.out.println("Speed: "+speed);
    }

    public void navigateTo(float latitude, float longitude, float altitude){
        System.out.println("Navigating to latitude: "+latitude+" longitude: "+longitude+" altitude: "+altitude);
        float differentLat=this.latitude-latitude;
        float differentLon=this.longitude-longitude;
        float differentAlt=this.altitude-altitude;
        float distance = differentAlt + differentLat + differentLon;
        distance=Math.abs(distance);
        float time= distance/this.speed;
        time=Math.abs(time);
        System.out.println("Time to reach: "+time);
        this.latitude=latitude;
        this.longitude=longitude;
        this.altitude=altitude;
    }

    public void scanArea(float radius){
        System.out.println("Radius: "+radius+"is geeting scanned");

        int detectedObjects=3;
        System.out.println("Number of objects detected: "+detectedObjects);

        float lat=18;
        float lon=28;

        for(int i=0; i<detectedObjects; i++){
            System.out.println((i+1)+" object detected at latitude: "+lat+" and longitude: "+lon);
            lat+=9;
            lon+=5;
        }
    }

}