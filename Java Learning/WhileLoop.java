public class WhileLoop{
    public static void main(String args[]){
        int x = 10;

        while(x<=20){
            System.out.println("value of x: " + x);
            x+= 1;
            System.out.println("\n");
        }
        if(x>20){
            System.out.println("value of x is greater than 20");
        }
    }
}