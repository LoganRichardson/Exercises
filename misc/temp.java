package misc;

public class temp {

    public static void main(String[] args) {
        binaryPatternMatching("010", "ama");
    }

    public static int binaryPatternMatching(String pattern, String s) {
        int matches = 0;
        int tempM = 0;
        int sLength = s.length();
        int pLength = pattern.length();
        String subS = s;
        System.out.println(subS);
        for (int i = 0; i < sLength; i++) {
            if (i + pLength <= sLength) {
                subS = s.substring(i, pLength + i);
            }
            if (sLength == pLength) {
                for (int j = 0; j < pLength - 1; j++) {
                    if (pattern.charAt(j) == '0'
                            && subS.charAt(j) == 'a'
                            && subS.charAt(j) == 'e'
                            && subS.charAt(j) == 'i'
                            && subS.charAt(j) == 'o'
                            && subS.charAt(j) == 'u') {
                        tempM++;
                    } else if (pattern.charAt(j) == '1'
                            && subS.charAt(j) != 'a'
                            && subS.charAt(j) != 'e'
                            && subS.charAt(j) != 'i'
                            && subS.charAt(j) != 'o'
                            && subS.charAt(j) != 'u') {
                        tempM++;
                    }
                    if (tempM > 2) {
                        matches = 2;
                    }
                }
            } else {
                for (int j = 0; j < pLength - 1; j++) {
                    if (pattern.charAt(j) == '0'
                            && subS.charAt(j) == 'a'
                            && subS.charAt(j) == 'e'
                            && subS.charAt(j) == 'i'
                            && subS.charAt(j) == 'o'
                            && subS.charAt(j) == 'u') {
                        tempM++;
                    } else if (pattern.charAt(j) == '1'
                            && subS.charAt(j) != 'a'
                            && subS.charAt(j) != 'e'
                            && subS.charAt(j) != 'i'
                            && subS.charAt(j) != 'o'
                            && subS.charAt(j) != 'u') {
                        tempM++;
                    }
                    if (tempM > 2) {
                        matches = 2;
                    }
                }
            }
        }

        System.out.println(matches);
        return matches;
    }

}
