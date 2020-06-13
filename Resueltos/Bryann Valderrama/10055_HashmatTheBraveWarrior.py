def run():
    while(True):
        try:
            num1, num2 = input().split()
            num1 = int(num1)
            num2 = int(num2)
            if(num1 > num2):
                print(num1-num2)
            else:
                print(num2-num1)
        except EOFError:
            break
run()
