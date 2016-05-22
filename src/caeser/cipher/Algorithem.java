/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caeser.cipher;

public class Algorithem {

    public static char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static char[] alpha_cap = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static  String convert(String text, int key) {
    
        char arr[] = text.toCharArray();
        String n="";
        String code ="";
        
        int cd ;
        
        for (int i = 0; i < arr.length; i++) {
            
             if(Character.isUpperCase(arr[i]))
        {
            cd =((int)arr[i]-65+key) % 26;
            n=String.valueOf(alpha_cap[cd]);
        }
        //encryption logic for lowercase letters
        else if(Character.isLowerCase(arr[i]))
        {
            cd =((int)arr[i]-97+key) % 26;
            n=String.valueOf(alpha[cd]);
        }
           code+=n;  
        }

        return code;
    }

}
