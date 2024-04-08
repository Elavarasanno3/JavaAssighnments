package assign08_04_2024exercism;

public class ElonsToyCar {
    int distance = 0;
    int percentage = 100;
    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven "+ distance + " meters";
    }

    public String batteryDisplay() {
        if(percentage == 0){
            return "Battery empty";
        }
        return "Battery at "+ percentage+"%";
    }

    public void drive() {
        if(percentage == 0){
            System.out.println("Battery empty");
        }else{
            distance += 20;
            percentage--;
        }
    }
}