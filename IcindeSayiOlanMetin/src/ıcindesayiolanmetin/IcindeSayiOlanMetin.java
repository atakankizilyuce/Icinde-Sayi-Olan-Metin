package ıcindesayiolanmetin;
import java.util.Scanner;
public class IcindeSayiOlanMetin {
 
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner girdi = new Scanner(System.in); 
  		int toplam = 0; 
  		System.out.println("Icinde sayi olan bir metin giriniz :"); 
  		String sayiliMetin = girdi.nextLine(); 
  		 
  		char[] arr = sayiliMetin.trim().toCharArray(); 
   
  		for(char element : arr) { 
  			if(Character.isDigit(element)) { 
  				toplam += Character.getNumericValue(element); 
  			} 
  		} 
  		System.out.println("Toplam : " + toplam); 
  		girdi.close();
}
 
}
