import java.util.Scanner;

class AccessSpecifierDemo{
    int pubvar;
    protected 
        int provar;
    private
        int privar;
    
    void setVar( int pubValue,int priValue,int proValue)
    {
        pubvar = pubValue;
        privar = priValue;
        provar = proValue;
    }
    void getvar(){
        System.out.println("public variable : "+pubvar);
        System.out.println("private variable : "+privar);
        System.out.println("protected variable : "+provar);
        int pubValue;
    }
}
class AbsEncap{
    public static void main(String[] args){
        int pri,pro,pub;
        Scanner ip = new Scanner(System.in);
        AccessSpecifierDemo obj=new AccessSpecifierDemo();
        System.out.println("Enter the public,private,protected variables : ");
        pub = ip.nextInt();
        pri =ip.nextInt();
        pro = ip.nextInt();
        obj.setVar(pub,pri,pro);
        obj.getvar();
        ip.close();
    }
}

