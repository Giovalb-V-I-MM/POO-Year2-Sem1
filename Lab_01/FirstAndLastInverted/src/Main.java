public class Main {
    public static void main(String[] args) {
        String[] words = {"c","ac","pippo"};

        for (String word : words) {
            String result;

            if(word.length() < 2){
                result = "Stringa corta";
            }
            else{
                String tempFirst;
                String tempLast;
                String tempMid;
                tempFirst = word.substring(0,1);
                tempLast = word.substring(word.length()-1);
                tempMid = word.substring(1, word.length()-1);
                result = tempLast + tempMid + tempFirst;
            }

            System.out.println(result);
        }
    }
}