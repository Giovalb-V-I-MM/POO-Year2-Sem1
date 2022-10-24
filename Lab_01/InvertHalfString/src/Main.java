public class Main {
   public static void main(String[] args) {
      String[] words = {"c","ac","ciao","pippo"};

      for (String word : words) {
         String result;

         String firstHalf;
         String secondHalf;

         if (word.length() < 2) {
            result = "Stringa corta";
         }
         else{
            firstHalf = word.substring(0, word.length()/2);
            secondHalf = word.substring(word.length()/2);
            result = secondHalf + firstHalf;
         }

         System.out.println(result);
      }
   }
}