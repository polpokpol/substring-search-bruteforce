class Bf{
    public static int search(String text, String pattern){
        
        int lengthOfText = text.length();
        int lengthOfPattern = pattern.length();

        for (int i = 0; i < 1 + (lengthOfText - lengthOfPattern); i++) {
            int j;
            for (j = 0; j < lengthOfPattern; j++) {
                if(text.charAt(i+j) != pattern.charAt(j)){
                    break;
                }
            }
            if(j == lengthOfPattern) return i; // it will only be j == lengthofpattern if all is correct else it will never return the i.
        }
        return lengthOfText;
    }
}