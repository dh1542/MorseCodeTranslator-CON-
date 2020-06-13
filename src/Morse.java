public class Morse {
    public static String translate(String plain){

        String morse = "";
        for(int i = 0; i < plain.length(); i++){
            char c = plain.charAt(i);

            if(c == 'a'){
                morse += ". -   ";
            }
            else if(c == 'b'){
                morse += "- . . .   ";
            }
            else if(c == 'c'){
                morse += "- . - .   ";
            }
            else if(c == 'd'){
                morse += "- . .   ";
            }
            else if(c == 'e'){
                morse += ".   ";
            }
            else if(c == 'f'){
                morse += ". . - .   ";
            }
            else if(c == 'g'){
                morse += "- - .   ";
            }
            else if(c == 'h'){
                morse += ". . . .   ";
            }
            else if(c == 'i'){
                morse += ". .   ";
            }
            else if(c == 'j'){
                morse += ". - - -   ";
            }
            else if(c == 'k'){
                morse += "- . -   ";
            }
            else if(c == 'l'){
                morse += ". - . .   ";
            }
            else if(c == 'm'){
                morse += "- -   ";
            }
            else if(c == 'n'){
                morse += "- .   ";
            }
            else if(c == 'o'){
                morse += "- - -   ";
            }
            else if(c == 'p'){
                morse += ". - - .   ";
            }
            else if(c == 'q'){
                morse += "- - . -   ";
            }
            else if(c == 'r'){
                morse += ". - .   ";
            }
            else if(c == 's'){
                morse += ". . .   ";
            }
            else if(c == 't'){
                morse += "-   ";
            }
            else if(c == 'u'){
                morse += ". . -   ";
            }
            else if(c == 'v'){
                morse += ". . . -   ";
            }
            else if(c == 'w'){
                morse += ". - -   ";
            }
            else if(c == 'x'){
                morse += "- . . -   ";
            }
            else if(c == 'y'){
                morse += "- . - -   ";
            }
            else if(c == 'z'){
                morse += "- - . .   ";
            }
            else if(c == '1'){
                morse += ". - - - -   ";
            }
            else if(c == '2'){
                morse += ". . - - -   ";
            }
            else if(c == '3'){
                morse += ". . . - -   ";
            }
            else if(c == '4'){
                morse += ". . . . -   ";
            }
            else if(c == '5'){
                morse += ". . . . .   ";
            }
            else if(c == '6'){
                morse += "- . . . .   ";
            }
            else if(c == '7'){
                morse += "- - . . .   ";
            }
            else if(c == '8'){
                morse += "- - . . .   ";
            }
            else if(c == '9'){
                morse += "- - - - .   ";
            }
            else if(c == '0'){
                morse += "- - - - -   ";
            }
            else if(c == ' '){
                morse += "       ";
            }





        }
        return morse;
    }
}
