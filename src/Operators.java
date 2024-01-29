public class Operators {

    public static void IncDec(){
        //Operators are of 3 types 1.Unary 2.Binary 3.Ternary
        //Unary -- Increment, Decrement, Logical NOT
        int a = 3;
        System.out.println(a--);//a
        System.out.println(--a);//a-2
        System.out.println(a++);//a-2

        boolean b = true;
        boolean c = !b;
        System.out.println(c);
    }
    public static void AND_OR(){
        int d = 5;
        int e =7 ;
        System.out.println(d<e && d<1?"Hello":"Goddnight");
        System.out.println(d<e || d<1?"Hello":"Goddnight");
    }
    public static void Arithmetic(){
        int f=3;
        int g =2;
        int sum = g+f;//5
        int sub = g-f;//-1
        int mult= g*f;//6
        int div = g/f;//0
        int mod = g%f;//2
        System.out.println(sum+","+ sub+","+mult+","+div+","+ mod);
    }

    public static void main(String[] args) {

       //IncDec();
       //AND_OR();
        Arithmetic();
    }
}
