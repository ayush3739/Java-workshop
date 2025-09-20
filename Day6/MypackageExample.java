package Day6;

import Mtpackage1.message;
import Mypackage.Addition;
import Subpackage.*;


public class MypackageExample {
        public static void main(String[] args) {
        Mypackage.message msg=new Mypackage.message();
        Mtpackage1.message m=new Mtpackage1.message();
        Students st=new Students();
        Addition a=new Addition();
        msg.display();
        st.display();
        m.display();

        
        System.out.println("add: "+a.add(7, 3));
        
        
    }
}
