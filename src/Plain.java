public class Plain {


    /**
     * Returns if given plaintext is valid for morse code translation
     * @param plain
     * @return boolean
     */

    public static boolean validate(String plain){


        for(int i = 0; i < plain.length(); i++){
            char c = plain.charAt(i);
            if(!Character.isLetterOrDigit(c) && c != ' '){
                System.out.println("Non translateable char found at index: " + i);
                return false;

            }

        }
        return true;
    }

    /**
     * Casts all chars in plain text to lowercase
     * @param plain
     */

    public static String lowercase(String plain){
        for(int i = 0; i < plain.length(); i++){
            char c = plain.charAt(i);

            if(Character.isAlphabetic(c)){
                c = Character.toLowerCase(c);
                plain = plain.replace(Character.toUpperCase(c), c);
            }




        }

        return plain;
    }
}
