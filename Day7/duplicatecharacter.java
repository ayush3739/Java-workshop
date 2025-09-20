package Day7;

public class duplicatecharacter {
    public static void main(String[] args) {
        String input = "Hello Everyone";
        char[] a = new char[input.length()];
        int[] n = new int[input.length()];

        StringBuilder str = new StringBuilder(input); 

        for (int i = 0; i < input.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < input.length(); j++) {
                char pi = str.charAt(j);    
                if (ch == pi) { 
                    count++;
                }
            }
            a[i] = ch;
            n[i] = count;
        }

        for (int i = 0; i < input.length(); i++) {
            if (n[i]>1){
                System.out.println("Characters  "+a[i]+" occur "+n[i]+" times");
            }
        }
    }
}
