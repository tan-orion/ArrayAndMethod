package CountCharInString;

public class CountCharInString {
        public static void main(String[] args) {
            String string = "damquocthanh";
            char findChar = 'a';
            int count = 0;
            for (int i = 0; i < string.length(); i++) {
                char thisChar = string.charAt(i);
                if (thisChar == findChar) {
                    count++;
                }
            }
            System.out.println(count);

    }
}
