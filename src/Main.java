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
        Scanner scanner = new Scanner(System.in);
        int tmp = 1;
        while(tmp!=4){
            System.out.println("======Menu====="+
            "\n1. Daftar Kampanye"+
            "\n2. Baca Artikel"+
            "\n3. Riwayat"+"\n4. Keluar");
            if (tmp == 1){
                //app.showKampanye();
            } else if (tmp==2) {
                //app.showArtikel();
            } else if (tmp==3) {
                //metode memanggil daftar riwayat
            } else if (tmp==4) {
                //logout
            }
        }
    }

    public static void menuAdmin(){
        Scanner scanner = new Scanner(System.in);
        int tmp = 1;
        while(tmp!=4){
            System.out.println("======Menu Admin====="+
                    "\n1. Daftar Kampanye"+
                    "\n2. Daftar Artikel"+
                    "\n3. Daftar Organisasi"+
                    "\n4. Daftar User"+
                    "\n5. Keluar");
            if (tmp == 1){
                //menampilkan daftar Kampanye
            } else if (tmp==2) {
                //menampilkan daftar Artikel
            } else if (tmp==3) {
                //Menampilkan daftar organisasi
            } else if (tmp==4) {
                //Menampikan daftar user
            } else if (tmp==5) {
                //logout
            }
        }
    }

    public static void menuOrganisasi(){
        Scanner scanner = new Scanner(System.in);
        int tmp = 1;
        while(tmp!=4){
            System.out.println("======Menu====="+
                    "\n1. Daftar Kampanye"+
                    "\n2. Baca Artikel"+
                    "\n3. Daftar kampanye yang dibuat" +
                    "\n4. Daftar artikel yang dibuat" +
                    "\n5. Buat kampanye" +
                    "\n6. Buat Artikel" +
                    "\n7. Keluar");
            if (tmp == 1){
                //app.showKampanye();
            } else if (tmp==2) {
                //app.showArtikel();
            } else if (tmp==3) {
                //melihat daftar kampanye yang dibuat
            }else if (tmp==4) {
                //melihat daftar artikel yang dibuat
            } else if (tmp==5) {
                //buat kampanye
            } else if (tmp==6) {
                //buat artikel
            } else if (tmp==7) {
                //logout
            }
        }
    }
}