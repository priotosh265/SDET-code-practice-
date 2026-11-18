public class ReverseWordsStrings {
    public static void main(String[] args) {
        String str = "Java is easy";
        String[] Sentence = str.split(" ");
        String S2="";

        for (int i =0 ; i <=Sentence.length-1  ; i++) {
            String Nword = Sentence[i];
            for (int j = Nword.length() - 1; j >= 0; j--) {
                System.out.print(Nword.charAt(j));
            }
//            S2= S2+ " " + Nword;
            System.out.print(" ");
        }
        System.out.println(S2);
    }
}