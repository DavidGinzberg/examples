public class VowelRemover {


    public static void main(String[] args) {




    }


    public String removeVowels(String message){

        String result = "";

        // Let's redo this with stringbuilder
        /*
        for (int i = 0; i < message.length(); i++){
            char currentChar = message.charAt(i);
            if("aeiou".indexOf(currentChar) < 0){
                //currentChar is not a vowel -- add it
                result += currentChar;
            }
        } /* */

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++){
            char currentChar = message.charAt(i);
            if("aeiou".indexOf(currentChar) < 0){
                //currentChar is not a vowel -- add it
                sb.append(currentChar);
            }
        }
        result = sb.toString();
        return result;
    }


}
