public class switchcases{
    public static void main(String args[]){
        // char grade = args[0].charAt(0);
        char grade = 'C';

        switch(grade){
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well Done");
                break;
            case 'D' :
                System.out.println("You Passed");
                break;
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is a(n) " + grade);
    }
}