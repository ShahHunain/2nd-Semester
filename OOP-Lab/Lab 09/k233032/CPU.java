public class CPU{
    double price;

    public class Processor{
        double cores;
        String manufacturer;

        public double getCache(){
            return 4.2;
        }
    }

    public class RAM{
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.3;
        }
    }

}
