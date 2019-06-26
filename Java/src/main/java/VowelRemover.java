public class VowelRemover {


    private String removeVowelsWithConcatenation(String message){

        String result = "";

        // This uses a lot of memory -- we'll redo it with a StringBuilder later
        for (int i = 0; i < message.length(); i++){
            char currentChar = message.charAt(i);
            if("aeiou".indexOf(currentChar) < 0){
                //currentChar is not a vowel -- add it
                result += currentChar; // Notice that some IDEs (eg: IntelliJ) warn you that this is a bad idea...
            }
        }

        return result;
    }

    private String removeVowelsWithStringBuilder(String message){
        String result = "";

        // Same thing but with a StringBuilder
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

    public String removeVowels(String message){
        //delegate the entire thing to one of our private methods above
        return removeVowelsWithConcatenation(message);
    }


}
