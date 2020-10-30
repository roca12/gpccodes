print("Digite el radio del circulo: ")
radio=int(input())
A=((22/7)*radio*radio)
print("El area es ", A)

print("Digita dos numeros: ")
numero1,numero2=input().split()
print(numero1)
if numero1==numero2:
    print("Son iguales")
    print
else:
    print("Son distintos")

print("Digita un numero: ")
numero3=int(input())
if numero3<0:
    print("Es negativo")
else:
    print("Es positivo")

print("Digita dos numeros: ")
numero4,numero5=input().split()
if numero4>numero5:
    print("El numero mayor es ",numero4)
elif numero4==numero5:
    print("Son iguales")            
else:
    print("El numero mayor es ",numero5)

print("Digita un numero")
numero6=int(input())
if numero6<10:
    print("Tiene un digito")
elif numero6<100:
    print("Tiene dos digitos")
elif numero6<1000:
    print("Tiene tres digitos")
elif numero6 < 10000:
    print("Tiene cuatro digitos")
else:
    print("Numero no valido")
