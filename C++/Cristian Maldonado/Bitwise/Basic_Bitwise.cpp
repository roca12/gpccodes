#include <iostream>

using namespace std;

string decToBin(int n)
{
    if (n == 0)
        return "0";
    // Para almacenar el binario equivalente al decimal
    string bin = "";
    int ayuda = n;
    n = abs(n);
    while (n > 0)
    {
        // Obtener el ultimo digito binario del numero 'n'
        // y acumularlo en el comienzo de la variable 'bin'
        bin = ((n & 1) == 0 ? '0' : '1')+bin;

        // Realizar corrimiento de 1 a la derecha en 'n'
        n >>= 1;
    }
    if(ayuda < 0){
        bin ='-'+bin;
    }
    // Retorno del valor binario
    return bin;
}

void verificarK_EsimoBitSiEstaEncendidoONo()
{
    for(int i = 1; i <= 10; i++){
        int res = i & (1 << 2);
        if(res!=0){
            cout<<i<<" El tercer bit esta activo:"<<endl;
            cout<<decToBin(i)<<" -> "<<decToBin(res)<<endl;
        }
    }
}

void invertirK_EsimoBit()
{
    for(int i = 1; i <= 10; i++){
        int res = i ^(1<<1);
        cout<<i<<" Se invirtio el bit 2 -> "<<res<<endl;
        cout<<decToBin(i)<<" -> "<<decToBin(res)<<endl;
        cout<<endl;
    }
}

void apagarK_EsimoBit()
{
    for(int i = 1; i <= 10; i++){
        int res = i& ~(1<<1);
        cout<<i<<" Se apago el bit 2 -> "<<res<<endl;
        cout<<decToBin(i)<<" -> "<<decToBin(res)<<endl;
        cout<<endl;
    }
}

void encenderK_EsimoBit()
{
    for(int i = 1; i <= 10; i++){
        int res = i | (1<<1);
        cout<<i<<" Se encendio el bit 2 -> "<<res<<endl;
        cout<<decToBin(i)<<" -> "<<decToBin(res)<<endl;
        cout<<endl;
    }
}

void bitApagadoMasALaDerecha()
{
    for(int i = 1; i <= 10; i++){
        int res = ~i & (i + 1);
        cout<<i<<": Bit apagado mas a la derecha -> "<<res<<endl;
        cout<<decToBin(i)<<" -> "<<decToBin(res)<<endl;
        cout<<endl;
    }
}

void apagarBitMasALaDerecha()
{
    for(int i = 1; i <= 10; i++){
        int res = i & (i - 1);
        cout<<i<<" Se apago el bit mas a la derecha -> "<<res<<endl;
        cout<<decToBin(i)<<" -> "<<decToBin(res)<<endl;
        cout<<endl;
    }
}

void encenderBitMasALaDerecha()
{
    for(int i = 1; i <= 10; i++){
        int res = i | (i+1);
        cout<<i<<" Se encendio el bit mas a la derecha -> "<<res<<endl;
        cout<<decToBin(i)<<" -> "<<decToBin(res)<<endl;
        cout<<endl;
    }
}

void busquedaDelPrimerBitEncendido()
{
    for(int i = 1; i <= 10; i++){
        int res = i & -i;
        cout<<i<<" Primer bit encendido encontrado"<<endl;
        cout<<decToBin(i)<<" -> "<<decToBin(res)<<endl;
        cout<<endl;
    }
}

void verificarSiEsImparONo()
{
   for(int i = 1; i <= 30; i++){
        int res = i & 1;
        if(res != 0){
            cout<<i<<" Numero impar -> "<<res<<endl;
            cout<<decToBin(i)<<" -> "<<decToBin(res)<<endl;
            cout<<endl;
        }
    }
}

void cambiarSigno()
{
    for(int i = 1; i <= 10; i++){
        int res = ~i+1;
        cout<<i<<" Se Cambio el signo -> "<<res<<endl;
        cout<<decToBin(i)<<" -> "<<decToBin(res)<<endl;
        cout<<endl;
    }
}



int main()
{
    //verificarK_EsimoBitSiEstaEncendidoONo();
    //invertirK_EsimoBit();
    //apagarK_EsimoBit();
    //encenderK_EsimoBit();
    //bitApagadoMasALaDerecha();
    //apagarBitMasALaDerecha();
    //encenderBitMasALaDerecha();
    //busquedaDelPrimerBitEncendido();
    //cambiarSigno();
    //verificarSiEsImparONo();
    return 0;
}
