import java.util.Scanner;
public class CaesarCipherCaseSensitive{

public static String encrypt(String plainText, int shiftKey){
   String encrypted = "";
   int x;
   for(int i = 0; i<plainText.length(); i++){
      if(plainText.charAt(i) >= 97 && plainText.charAt(i) <= 122){
         x = ((((int)plainText.charAt(i))+ (7 + shiftKey)) %26);
         encrypted += ((char)(x + 97));}
      else{
         x = ((((int)plainText.charAt(i))+ (13 + shiftKey)) %26);
         encrypted += ((char)(x + 65));}
   }
   return encrypted;
}

public static String decrypt(String cipherText, int shiftKey){
   String decrypted = "";
   int x;
   for(int i = 0; i<cipherText.length(); i++){
      if(cipherText.charAt(i) >= 97 && cipherText.charAt(i) <= 122){  
         x = (( ((int)cipherText.charAt(i)) + (7 - shiftKey)) %26);
         decrypted += ((char)(x+97));}
      else{
         x = ((((int)cipherText.charAt(i))+ (13 - shiftKey)) %26);
         decrypted += ((char)(x + 65));}
   }
   return decrypted;
}

   public static void main (String[] args){
      String message1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      
      System.out.println(encrypt(message1,3));
      System.out.println(decrypt(encrypt(message1,3),3));
      System.out.println(encrypt(message1.toLowerCase(),5));
      
      System.out.println(decrypt(encrypt(message1.toLowerCase(),5),5));
      
   }
}