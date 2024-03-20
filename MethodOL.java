class addition{
    double a;
    double b;
    void add(double x,double y){
        a=x+y;
    }
    void add(double x,double y,double z){
        b=x+y+z;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
}

class methodoverload{
    public static void main(String[]args){
        addition obj= new addition();
        obj.add(99.9,44.4);
        obj.add(44.4,33.3,66.6);
        obj.display();
    }
}
