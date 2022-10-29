import java.util.Scanner;

class Test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sign in" + "\n");
        System.out.print("Enter your username: ");
        String userN = sc.next();

        if (userN.equals("Peter")) {
            System.out.print("Enter you password: ");
            String pass = sc.next();
            if (pass.equals("khoury")) {
                System.out.println("Welcome back " + userN);
            } else {
                System.out.println("Wrong pass! Please try again");
            }
        } else {
            System.out.println("Sorry this username is not registered in our database!");
            System.out.print("If you want to sign up enter R: ");
            String signC = sc.next();
            if (signC.equals("R")) {
                System.out.print("Enter your mail: ");
                String Smail = sc.next();
                System.out.print("Choose a password: ");
                String Spass = sc.next();
            } else {
                System.out.println("Alright then! Come back once you have a right user/pass to sign in.");
                System.out.println("For more info press D: ");
                String Cinfo = sc.next();
                if (Cinfo.equals("D")) {
                    System.out.println("Author: Paraformaldead#4747" + "\n" + "Simple java cmd login code" + "\n"
                            + "For more info feel free to contact me on: paraformaldead@gmail.com");
                } else {
                    System.out.println("GoodBye!");
                }
            }
        }

    }

}