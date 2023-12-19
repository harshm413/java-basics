abstract class Vehicle{
    public String brand;
    protected String model;
    private int year;

    public Vehicle(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    public abstract void startEngine();

    public String getInfo(){
        return brand+" "+model+" "+year+".";
    }
}

class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String brand,String model,int year,int numberOfDoors){
        super(brand,model,year);
        this.numberOfDoors=numberOfDoors;
    }
    @Override
    public void startEngine(){
        System.out.println("Car Engine started.");
    }

    public void getModel(){
        System.out.println(model);
    }
}
public class code{
    public static void main(String[] args){
        Car myCar=new Car("Toyota","Camry",2022,4);
        myCar.getModel();
        System.out.println(myCar.brand);
        System.out.println(myCar.getInfo());
        myCar.startEngine();
    }
}