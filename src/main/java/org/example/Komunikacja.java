package org.example;

public class Komunikacja {
    private String text;
    public Komunikacja(String text) {
        this.text = text;
    }
    public int marker(){
        int licznik =0;
        for (int i = 0; i < text.length()-3; i++) {
            if (text.charAt(i+3) == text.charAt(i) || text.charAt(i+2) == text.charAt(i) || text.charAt(i+1) == text.charAt(i)){
                licznik = 0;
            }else {
                licznik++;
            }
            if (licznik>4){
                return i;
            }
        }
        return -1;
    }
}
