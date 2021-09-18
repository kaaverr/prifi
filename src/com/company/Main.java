package com.company;

public class Main {

public static String getPrefix(String[] array){
    String prefix = "";
    String shortest = getShortest(array);
    for (int i = 0; i < shortest.length(); i++) {
        char symvol = shortest.charAt(i);
        for (int j = 0; j < array.length; j++) {
            if (symvol != array[j].charAt(i)){
                return prefix;
            }
        }
//        prefix = prefix + symvol;
        prefix += symvol;
    }
    return prefix;

}

public static String getShortest(String[] array){
    String shortest = array[0];
    for (int i = 0; i <array.length; i++) {
        if (array[i].length() < shortest.length()){
            shortest = array[i];
        }
    }
    return shortest;
}

public static void main(String[] args) {
	String[] array = new String[]{"abcde" , "abcd" , "abcb" , "abcxy" , "aba" , "ah"};
	System.out.println(getPrefix(array));
//    System.out.println(getShortest(array));
}
}
