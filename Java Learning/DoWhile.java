public class DoWhile{
    public static void main(String args[]){
        int x = 10;

        do {
            System.out.println("value of x: " + x);
            x += 1;
            System.out.println("\n");
        }
        while(x<=20);
        if(x>=20){
            System.out.println("x is greater than or equal to 20");
        }
    }
}