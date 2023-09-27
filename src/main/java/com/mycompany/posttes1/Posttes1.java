/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttes1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author SELLA
 */
public class Posttes1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Anime> animes = new ArrayList<>();

        animes.add(new Anime("One Piece", "Eiichiro Oda"));
        animes.add(new Anime("Shingeki No Kyojin", "Hajime Isayama"));
        animes.add(new Anime("Naruto Shippuden", "Masashi Kishimoto"));
        animes.add(new Anime("Jujutsu Kaisen", "Gege Akutami"));
        animes.add(new Anime("Haikyu!! Fly High! Volleyball!", "Haruichi Furudater"));

        while (true) {
            System.out.println("===============================================================================");
            System.out.println("|                                   DAFTAR ANIME                              |");
            System.out.println("===============================================================================");
            System.out.println("| 1. Tampilkan Keseluruhan                                                    |");
            System.out.println("| 2. Tampilkan Satu Per-Satu                                                  |");
            System.out.println("| 3. EXIT                                                                     |");
            System.out.println("===============================================================================");
            System.out.print("Silahkan Pilih : ");
            int pilihan = input.nextInt();
            input.nextLine();
            if (pilihan == 1) {
                System.out.println("===============================================================================");
                for (Anime anime : animes) {
                    System.out.println("Anime berjudul " + anime.judul + " mangaka oleh " + anime.mangaka + ".");}
                System.out.println("===============================================================================");}
            else if (pilihan == 2) {
                System.out.println("==============================================================================");
                System.out.println("|      Silahkan Pilih angka nya maka akan tertampil anime dan mangaka nya    |");
                System.out.println("==============================================================================");
                for (int i = 0; i < animes.size(); i++) {
                    System.out.println(" " + (i + 1) + ". " + animes.get(i).judul);}
                System.out.println("==============================================================================");
                System.out.print("Silahkan Pilih : ");

                int pilihan2 = input.nextInt();
                input.nextLine();  // Membersihkan newline dari buffer

                if (pilihan2 >= 1 && pilihan2 <= animes.size()) {
                    Anime animeTerpilih = animes.get(pilihan2 - 1);
                    System.out.println("===============================================================================");
                    System.out.println("Anime berjudul " + animeTerpilih.judul + " mangaka oleh " + animeTerpilih.mangaka + ".");
                    System.out.println("===============================================================================");
                } else {
                    System.out.println("Pilihan tidak validS.");
                }
            } else if (pilihan == 3) {
                System.out.println("------------------------------------Terima Kasih--------------------------------");
                break;  // Keluar dari program jika pilihan adalah 3
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}