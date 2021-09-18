package com.company;

public class Main {

public static String getPrefix(String[] array){
    String prefix = array[0].substring(0,1);
    for (int i = 0; i < array.length ; i++) {
        if (!prefix.equals(array[i].substring(0,1))){

        }
    }
    return null;
}

    public static void main(String[] args) {
	String[] array = new String[]{"abcde" , "abcd" , "abd" , "abxy" , "abda" , "abc"};
        System.out.println(getPrefix(array));
    }
}
