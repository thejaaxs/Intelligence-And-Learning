// Arithmetic Exception In Java !

public class firstExampleEH {
    public static void main(String args[]){
        try{
            int result = 10 / 0 ;
            System.out.println("Result : "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by Zero Error !");
        }
        System.out.println("Program Continous...!!");
    }
}
