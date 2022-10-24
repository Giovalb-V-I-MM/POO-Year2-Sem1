public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "sasso", "pippo", "test"};

        for (String word : words) {
            int position = -1;

            if(word.length() <= 1){
                position = -1;
            }
            else{
                position = word.indexOf(word.substring(0, 1), 1);
            }

            System.out.println(position);
        }
    }
}