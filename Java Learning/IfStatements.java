// If statements with Java
public class IfStatements {
    public static void main(String args[]){
        int x=10;
        int y=10;

        if(x<20){
            if(y<20){
                System.out.println("x and y are less than 20");
            }
        }
        else if(x>20){
            System.out.println("x is greater than 20");
        }
        else {
            System.out.println("x is equal to 20");
        }
    }
}