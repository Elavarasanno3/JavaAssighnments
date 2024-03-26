package assign26_03_2024;

class MathOperation{
    /// Via Integer
    public void add(int no1,int no2){
        System.out.println("Add int : " + (no1+no2));
    }
    public void subtract(int no1,int no2){
        System.out.println("subtract int : " + (no1-no2));
    }
    public void divide(int no1,int no2){
        System.out.println("Divide int : " + (no1/no2));
    }
    public void multiply(int no1,int no2){
        System.out.println("Multiply int : " + (no1*no2));
    }

    //Via double

    public void add(double no1,double no2){
        System.out.println("Add Double : " + (no1+no2));
    }
    public void subtract(double no1,double no2){
        System.out.println("subtract Double : " + (no1-no2));
    }
    public void divide(double no1,double no2){
        System.out.println("Divide Double : " + (no1/no2));
    }
    public void multiply(double no1,double no2){
        System.out.println("Multiply Double : " + (no1*no2));
    }

    // Via double int

    public void add(double no1,int  no2){
        System.out.println("Add Double int : " + (no1+no2));
    }
    public void subtract(double no1,int no2){
        System.out.println("subtract Double int : " + (no1-no2));
    }
    public void divide(double no1,int no2){
        System.out.println("Divide Double int : " + (no1/no2));
    }
    public void multiply(double no1,int no2){
        System.out.println("Multiply Double int : " + (no1*no2));
    }

    //Via int double

    public void add(int no1,double no2){
        System.out.println("Add int Double : " + (no1+no2));
    }
    public void subtract(int no1,double no2){
        System.out.println("subtract int Double : " + (no1-no2));
    }
    public void divide(int no1,double no2){
        System.out.println("Divide int Double : " + (no1/no2));
    }
    public void multiply(int no1,double no2){
        System.out.println("Multiply int Double : " + (no1*no2));
    }

}

public class MathDemo{
    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        math.add(5,3);
        math.add(5.3,3.3);
        math.add(5.3,3);
        math.add(5,3.5);
        math.subtract(5,3);
        math.subtract(5.3,3.3);
        math.subtract(5.3,3);
        math.subtract(5,3.5);
        math.divide(5,3);
        math.divide(5.3,3.3);
        math.divide(5.3,3);
        math.divide(5,3.3);
        math.multiply(5,3);
        math.multiply(5.3,3.3);
        math.multiply(5.3,3);
        math.multiply(3,5.3);




    }
}