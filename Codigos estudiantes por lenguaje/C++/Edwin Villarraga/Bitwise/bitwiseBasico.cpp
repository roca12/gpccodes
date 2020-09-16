#include<bits/stdc++.h>
#include<cstdlib>
#define c(x) cout<<x<<endl;
#define cn(x) cout<<x;
using namespace std;
int countSetBits(int x){
    int cont=0;
    while(x){
        x&=(x-1);
        cont++;
    }
    return cont;
}
int log_2(int x){
    int res=0;
    while(x>>=1){
        res++;
    }
    return res;
}
int isPower2(int x){
    return (x&&!(x&x-1));
}
void set_1(int &x,int pos){
    int v=x|=(1<<pos);
    c(v);
}
void unset(int &num,int pos){
    num&=(~(1<<pos));
    c(num);
}
void par(int x){
    bool v=x&1;
    if(!v){
        c("es par");
    }else{
        c("es impar");
    }
}
void kth_bitEncendido(int x,int index){
    bool v=x&(1<<index);
    if(!v){
        c("el bit esta encendido");
    }else{
        c("el bit no esta encendido");
    }
}
void encenderKth_bit(int x,int index){
    int v=x|(1<<index);
    c(v);
}
void apagaKh_bit(int x,int index){
    int v=x&~(1<<index);
    c(v);
}
void invierteKh_bit(int x,int index){
    int v=x^(1<<index);
    c(v);
}
void invierteTodosBits(int x){
    c(~x);
}
void bitEncendido_Rigth(int x){
    int v=x&-x;
    c(v);
}
void bitApagado_Rigth(int x){
    int v=~x &(x+1);
    c(v);
}
void enciendeBit_Apagado_Rigth(int x){
    int v=x|(x+1);
    c(v);
}
void apagaBit_encendido_Rigth(int x){
    int v=x|(x-1);
    c(v);
}
void toggle(int &num,int pos){
    num^=(1<<pos);
    c(num);
}
int lowest_set_bit(int num){
    int ret=num&(-num);
    return ret;
}
void strip_last_set_bit(int &num){
    num=num&(num-1);
    c(num);
}
int main() {
    int a=7;
    par(a);
    a=7;
    kth_bitEncendido(a,4);
    a=7;
    encenderKth_bit(a,5);
    a=7;
    apagaKh_bit(a,3);
    a=7;
    invierteKh_bit(a,2);
    a=7;
    invierteTodosBits(a);
    a=7;
    bitEncendido_Rigth(a);
    a=7;
    bitApagado_Rigth(a);
    a=7;
    enciendeBit_Apagado_Rigth(a);
    a=7;
    apagaBit_encendido_Rigth(a);
    a=7;
    c(countSetBits(a));
    a=7;
    c(log_2(a));
    a=7;
    c(isPower2(a));
    a=7;
    set_1(a,2);
    a=7;
    unset(a,2);
    a=7;
    toggle(a,4);
    a=7;
    c(lowest_set_bit(a));
    a=7;
    strip_last_set_bit(a);
}
