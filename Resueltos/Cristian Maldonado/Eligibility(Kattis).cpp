#include <iostream>
#include <string.h>

using namespace std;

bool firstAndSecondCondition(string studies, string born){
    if(atoi(studies.c_str())>= 2010 || atoi(born.c_str()) >= 1991){
        return true;
    }
    return false;
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int cases; cin>>cases;
    while(cases--){
        string name, studies, born;
        int courses;
        cin>>name>>studies>>born>>courses;
        studies = studies.substr(0, 4);
        born = born.substr(0, 4);
        if(firstAndSecondCondition(studies, born)){
            cout<<name<<" "<<"eligible"<<endl;
            continue;
        }else if(courses >= 41){
            cout<<name<<" "<<"ineligible"<<endl;
            continue;
        }else{
            cout<<name<<" "<<"coach petitions"<<endl;
            continue;
        }
    }
    return 0;
}
