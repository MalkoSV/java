package Hw7;

public class Triple {
    public static String tripleTrouble(String one, String two, String three) {
        // Solution
        String newString = "";
        for (int i = 0; i < one.length(); i++) {
            System.out.println(one.charAt(i));
            newString += one.charAt(i) + "" + two.charAt(i) + three.charAt(i);
        }
        return newString;
    }
}
