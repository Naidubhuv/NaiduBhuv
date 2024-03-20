#include<iostream>

using namespace std;

class mainclass{
    public:
    int a=10;
    void displaymsg(){
        cout<<++a<<endl;
    }
};
class subclass : public mainclass{
    public:
    void displaymsg(){
        cout<<a<<endl;
    }
};

int main(){
    subclass obj;
    obj.displaymsg();
}
