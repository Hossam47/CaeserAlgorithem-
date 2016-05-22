/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caeser.cipher;


public class Encap {
    
    private String plainText ;
    private int key ;
    private String Generate ;

    public String getGenerate() {
        return Generate;
    }

    public void setGenerate(String Generate) {
        this.Generate = Generate;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    
    public void print (){
        System.out.println("Detalis  :"+key +"   "+plainText);
    }
    
}
