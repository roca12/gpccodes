def solution( A, k):

	N = len(A)
	if (N < k or N < 1 or k < 1):
		return 0
	if (N == k):
		return 1
	v1 = [0]*(N)
	v2 = [0]*N
	v3 = [0]*N
	v2[N - 1] = 1
	v3[A[N - 1] - 1] = 1

	for i in range(N - 2,-1,-1):
		v2[i] = v2[i + 1]
		if (v3[A[i] - 1] == 0):
			v2[i] += 1
			v3[A[i] - 1] = 1
		
	for j in range( 1, k) :
		v3 = [0]*N
		v1[N - 1] = 0
		for i in range( N - 2, -1, -1) :
			v1[i] = v1[i + 1]
			v1[i] = v1[i] + v2[i + 1]
			v1[i] = v1[i] - v3[A[i] - 1]
			v3[A[i] - 1] = v2[i + 1]
	
		for i in range(len(v1)):
			v2[i] = v1[i]
	
	return v2[0]

def solve(a, n, k):
	v = a
	print( solution(v, k))


a = [ 1, 2, 3, 4 ]
n = len(a)
k = 3
solve(a, n, k)

