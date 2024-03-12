#include<iostream>

using namespace std;

class AccessSpecifierDemo{
    public:
        int pubvar;
    private:
        int privar;
    protected:
        int provar;
    public:
        void setVar(int pubValue,int priValue,int proValue){
            pubvar= pubValue;
            privar= priValue;
            provar= proValue;
        }
        void getvar(){
            cout<<"The value of public variable : "<<pubvar<<endl;
            cout<<"The value of private variable : "<<privar<<endl;
            cout<<"The value of protected variable : "<<provar<<endl;
        };
};
int main(){
    AccessSpecifierDemo obj;
    int pri,pub,pro;
    cout<<"Enter the public,private,protected integer values : "<<endl;
    cin>>pub;
    cin>>pri;
    cin>>pro;
    obj.setVar(pub,pri,pro);  
    obj.getvar();
}

