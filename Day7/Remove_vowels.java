package Day7;

public class Remove_vowels {
    public static void main(String[] args) {
        String input = "Hello you";
        String vowels = "aeiouAEIOU";
        
        // Convert to StringBuilder so we can delete characters
        StringBuilder str = new StringBuilder(input);

        // Iterate backwards to safely delete characters
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) { 
                str.deleteCharAt(i);        
            }
        }

        System.out.println("Without vowels: " + str);
    }
}
