
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama             : Alvin Lukman Nulhakim
 * Nim              : 10117095
 * Kelas            : IF-3
 * Deskripsi        : Menjelaskan Warna Kepribadian Seseorang
 */
public class WarnaKepribadian {

    public static void main(String[] args) {
        Warna wrn = new Warna();
        User usr = new User();
        Scanner scn = new Scanner(System.in);

        wrn.menampilkanTemplate();
        wrn.pilihWarnaFavorit();
        usr.memasukkanNama();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "+ 
                            usr.namaUser.toUpperCase()+"====");
        wrn.tesKepribadian(wrn.namaWarna,usr.namaUser);


    }
    
}
