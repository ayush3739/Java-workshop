package Day4;
class A{
    int a;
    String b;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public String getB() {
        return b;
    }
    public void setB(String b) {
        this.b = b;
    }
}

public class getter_setter {
    public static void main(String[] args) {
        A obj=new A();
        obj.setA(11);
        obj.setB("kiet");

        System.out.println(obj.getA());
        System.out.println(obj.getB());


    }
}
