public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "alice", "bob", "pippo", "pluto"};

        for (String word : words) {
            String uppedWord = "";

            if(word.length() <= 1){
                uppedWord = word.toUpperCase();
            }
            else{
                String firstChar = word.substring(0, 1);
                firstChar = firstChar.toUpperCase();
                String string = word.substring(1);
                uppedWord = firstChar + string;
            }

            System.out.println(uppedWord);
        }
    }
}