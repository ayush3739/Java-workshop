package Day3;

class Base{
    int a,s;
    public Base(int n,int m){
        a=n;
        s=m;
    }
    public Base(Base b){
        a=b.a;
        s=b.s;
    }
    public void show(){
        System.out.println("Constructor a: " + a + ", s: " + s);
    }
}



public class CopyConstructor {

     public static void main(String[] args) {
        Base b1=new Base(10,20);
        b1.show();
        Base b2=new Base(b1);
        b2.show();

     }
}