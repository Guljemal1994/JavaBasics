package com.syntax.class17;

public class Task2 {

	 protected String word1(String a) {
         char []word1=a.toCharArray();
         String reverse="";
        for (int x=a.length()-1; x>=0; x--)
            reverse+=word1[x];
    return reverse;
}
public static void main (String[] args) {
    Task2 word=new Task2();
    String newWord=word.word1("julia Mert");
    System.out.println(newWord);
}
}
