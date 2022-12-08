package Hw7;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        name = name.toUpperCase();
        String abbreviature = name.charAt(0) + ".";
        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                abbreviature += name.charAt(i+1);
                break;
            }
        }
        return abbreviature;
    }
}
