package model;

public final class Konveksi {
    // Variabel final
    private final String namaKonveksi = "Konveksi B19 ";

    // Metode final
    public final void ShowMainMenu() {
        System.out.println(  "\n Selamat datang di " + namaKonveksi  );
        System.out.println("  Silakan melihat koleksi kami      ");
        System.out.println("+-------------------------+");
        System.out.println("|        [ Menu ]         |");
        System.out.println("+-------------------------+");
        System.out.println("| 1. Manage Products      |");
        System.out.println("| 2. Manage Orders        |");
        System.out.println("| 3. Exit                 |");
        System.out.println("+-------------------------+");
    }

}