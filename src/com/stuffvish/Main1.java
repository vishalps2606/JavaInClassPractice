class newException extends Exception{
    public newException(String s){
        super(s);
    }
}
public class Main1
{
    public static void main(String[] args) {
        try {
            throw new newException("newException");

        } catch(newException ne) {
            System.out.print("Catched the Exception: ");
            System.out.println(ne.getMessage());
        }
    }
}