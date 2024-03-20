#include<iostream>

using namespace std;

class addition{
    public:
        int a;
        int b;
        void add(float x,float y){
           a= x+y;
        }

        void add(float x,float y,float z){
            b=x+y+z;
        }
        void display(){
            cout<<"The Surface area of a box : "<<a<<endl;
            cout<<"The volume of a box : "<<b<<endl;
        }      
};

int main(){
    addition obj;
    obj.add(23,33.4);
    obj.add(33,23.4,34.5);
    obj.display();
}
