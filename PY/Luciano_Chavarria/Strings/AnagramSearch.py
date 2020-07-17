from sys import stdout,stdin

MAX = 256

def compare(arr1,arr2):
	global MAX
	for i in range(MAX):
		if arr1[i] != arr2[i]:
			return False
	return True

def anagramsSearch(pat,txt):
	global MAX
	M = len(pat)
	N = len(txt)

	countP = [0 for x in range(MAX)]
	countTW = [0 for x in range(MAX)]

	for i in range(M):
		countP[ord(pat[i])]+=1
		countTW[ord(pat[i])]+=1
	for i in range(M,N):
		if compare(countP,countTW):
			stdout.write(f"Encontrado en el indice {i-M} Anagrama {txt[i-M:i]}")
			stdout.write("\n")
		countTW[ord(txt[i])]+=1
		countTW[ord(txt[i-M])]-=1
	if compare(countP,countTW):
		stdout.write(f"Encontrado en el indice {N-M} Anagrama {txt[N-M:N]}")
		stdout.write("\n")



def main():
	txt = "anitalavalatina"
	pat = "anita"
	anagramsSearch(pat,txt)

if __name__ == '__main__':
	main()
