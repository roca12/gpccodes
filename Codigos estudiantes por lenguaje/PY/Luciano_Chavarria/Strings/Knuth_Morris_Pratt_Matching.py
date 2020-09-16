def KMPsearch(pat,txt):
	M = len(pat)
	N = len(txt)

	lps = [None for x in range(M)]
	j = 0

	computeLPSArray(pat, M, lps)

	i = 0

	while i < N:
		if pat[j] == txt[i]:
			i+=1
			j+=1
		if j == M:
			print("Encontrado patrón (" , pat , ") en el indice " , (i - j) , "-" , ((i - j) + M - 1))
			j = lps[j - 1]
		elif i < N and pat[j] != txt[i]:
			if j != 0:
				j = lps[j-1]
			else:
				i+=1

def computeLPSArray(pat,M,lps):
	leng = 0
	i = 1
	lps[0] = 0
	while i < M:
		if pat[i] == pat[leng]:
			leng+=1
			lps[i] = leng
			i+=1
		else:
			if leng != 0:
				leng = lps[leng-1]
			else:
				lps[i] = leng
				i+=1

def variasBusquedas(arr,txt):
	for i in range(len(arr)):
		KMPsearch(arr[i],txt)

if __name__ == '__main__':
	txt = "lalalalalalalalalalala"
	arr = ["la", "lal", "lala"]
	variasBusquedas(arr, txt)
