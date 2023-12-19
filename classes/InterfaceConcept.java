interface MyInterface{
    void doSomething();
    void doAnotherThing();
    int calculateSum(int a,int b);
}

class MyClass implements MyInterface{
    @Override
    public void doSomething(){
        System.out.println("Doing something");
    }
    @Override
    public void doAnotherThing(){
        System.out.println("Doing another thing...");
    }
    @Override
    public int calculateSum(int a,int b){
        return a+b;
    }
    //override is not required in java but good practice
}
public class InterfaceConcept{
    public static void main(String[] args){
        MyClass myObj=new MyClass();
        myObj.doSomething();
        myObj.doAnotherThing();

        int sum=myObj.calculateSum(5,10);
        System.out.println(sum);
    }
}