def compute(S, X):
    A = (S - X) / 2
    a = 0
    b = 0
    LONG_FIELD_SIZE = 8
    leng=8*LONG_FIELD_SIZE
    for i in range (leng):
        Xi = (X & (1 << i))
        Ai = (A & (1 << i))
        if (Xi == 0 and Ai == 0):
            c=0
        elif (Xi == 0 and Ai > 0):
            a = ((1 << i) | a)
            b = ((1 << i) | b)
        elif (Xi > 0 and Ai == 0):
            a = ((1 << i) | a);
        else:
            cout << "Not Possible" << endl;
            return;
    print("a = " + str(a) + "\nb = " + str(b))
S = 17
X = 13
compute(S, X);