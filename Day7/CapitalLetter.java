package Day7;

public class CapitalLetter {
    
    public static void main(String[] args) {
        String str="HeLLo WorLd From Java";
        
        StringBuilder capitals=new StringBuilder();

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (Character.isUpperCase(ch)){
                capitals.append(ch);
            }
        }


            
        
        System.out.println("Capital letters: "+str);
        System.out.println("Capitals Letters Appended: "+capitals.toString());
    }
}
