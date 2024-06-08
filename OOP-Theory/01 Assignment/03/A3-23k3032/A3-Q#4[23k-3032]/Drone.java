public abstract class Drone {

    float latitude;
    float longitude;
    float altitude;
    float speed;

    Drone(float latitude, float longitude, float altitude, float speed){
        this.latitude=latitude;
        this.longitude=longitude;
        this.altitude=altitude;
        this.speed=speed;
    }

    abstract void adjustAltitude(float meters);

    abstract void setSpeed(float speed);

}
