/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nisnovr;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Overloaddua {

    Scanner input = new Scanner(System.in);
    String nama, umur, alamat, nisn;

 void bio(String a,String b) {
        System.out.println("Masukkan nama anda:");
        nama = input.nextLine();
  
    }

 void bio(String c) {
        System.out.println("Masukkan umur anda:");
        umur = input.nextLine();

    }

void bio (String d, String e, String f){
        System.out.println("Masukkan Alamat: ");
        alamat = input.nextLine();
  
 
    }
void bio (String g, String h, String i, String j){
        System.out.println("Masukkan Nisn: ");
        nisn = input.nextLine();
  
 
    }
void show(){
        System.out.println("Nama saya adalah "+nama);
        System.out.println("Umur saya adalah "+umur);
        System.out.println("Alamat saya adalah "+alamat);
        System.out.println("NISN saya adalah "+nisn);
    }

}
