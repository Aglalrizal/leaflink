import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        UserDatabase app = new UserDatabase();
        int tmp = 99;
        Scanner scanner = new Scanner(System.in);
        while (tmp != 0){
            System.out.println("Haloo \n1. Login \n2. Sign Up \n3.Exit");
            tmp=scanner.nextInt();
            if (tmp == 1){
                app.login();
            }else if (tmp == 2){
                app.register();
            }else if (tmp == 3){
                exit(0);
            }
        }
    }
    public static void menuUser(){

    }

    public static void menuAdmin(){

    }

    public static void menuOrganisasi(){

    }
}