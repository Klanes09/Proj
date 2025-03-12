import java.util.Scanner;

public class Exception{
    static int res1;
    static int res2;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        while(true){
        Menu1(scan);
        Menu2();
        int pick = TheChoicesInMenu(scan);

        switch(pick){
            case 1:
                Add();
                break;
            case 2:
                Mul();
                break;
            case 3:
                Sub();
                break;
            case 4:
                Div();
                break;
            case 5:
                System.out.println("Exiting...");
                scan.close();
                System.exit(0);
            default:
                System.out.println("Invalid operations");
            }
        }
    }

    public static void Menu1(Scanner scan){
        System.out.print("Input 1stnum >>> ");
        res1 = scan.nextInt();
        System.out.print("Input 2ndnum >>> ");
        res2 = scan.nextInt();
    }

    public static void Menu2(){
        System.out.println("Choices:");
        System.out.println("1. [+] 2. [*]\n3. [-] 4. [/]\n5. [Exit]");
        System.out.print("Input: ");
    }

    public static int TheChoicesInMenu(Scanner scan){
        int choice;
        choice = scan.nextInt();
        return choice;
    }

    public static void Add(){
        try{
            int result = res1 + res2;
            System.out.println("No error\nResult: "+result+"\n ");
            }
            catch(ArithmeticException nahh){
                System.out.println("Error fix it!"+"\n ");
            }
    }

    public static void Mul(){
        try{
            int result = res1 * res2;
            System.out.println("No error\nResult: "+result+"\n ");
            }
            catch(ArithmeticException nahh){
                System.out.println("Error fix it!"+"\n ");
            }
    }

    public static void Sub(){
        try{
            int result = res1 - res2;
            System.out.println("No error\nResult: "+result+"\n ");
            }
            catch(ArithmeticException nahh){
                System.out.println("Error fix it!"+"\n ");
            }
    }

    public static void Div(){
        try{
            int result = res1 / res2;
            System.out.println("No error\nResult: "+result+"\n ");
            }
            catch(ArithmeticException nahh){
                System.out.println("Error fix it!"+"\n ");
            }
    }
}