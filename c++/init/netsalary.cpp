#include<iostream>
using namespace std;

int main(){
    float netsalary, basicsalary, ptofallowance, ptofdeduction;
    
    cout<<"Enter the amount of basic salary"<<endl;
    cin>>basicsalary;

    cout<<"Enter the percentage of allowance"<<endl;
    cin>>ptofallowance;

    cout<<"Enter the percentage of deduction"<<endl;
    cin>>ptofdeduction;

    cout<<" "<<endl;

    netsalary=basicsalary+basicsalary*ptofallowance-basicsalary*ptofallowance;
    cout<<"Netsalary: "<<netsalary<<endl;

    return 0;
}