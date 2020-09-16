from collections import deque
MAXS = 500
MAXC = 26
out = []
f = []
g = []

def buildMatchingMachine(arr,k):
	global MAXS
	global MAXC
	global out
	global g
	global f
	out = [0 for x in range(MAXS)]
	g = [[-1 for y in range(MAXC)] for x in range(MAXS)]
	states = 1
	for i in range(k):
		word = arr[i]
		currentState = 0
		for j in range(len(word)):
			ch = ord(word[j]) - ord('a')
			if g[currentState][ch] == -1:
				states = states + 1
				g[currentState][ch] = states
			currentState = g[currentState][ch]
		out[currentState] |= (1 << i)
	for ch in range(MAXC):
		if g[0][ch] == -1:
			g[0][ch] = 0
	f = [-1 for x in range(MAXS)]
	q = deque()
	for ch in range(MAXC):
		if g[0][ch] != 0:
			f[g[0][ch]] = 0
			q.append((g[0][ch]))
	while not len(q) == 0:
		state = q.pop()
		for ch in range(MAXC):
			if g[state][ch] != -1:
				failure = f[state]
				while g[failure][ch] == -1:
					failure = f[failure]
				failure = g[failure][ch]
				f[g[state][ch]] = failure
				out[g[state][ch]] |= out[failure]
				q.append(g[state][ch])
	return states

def findNextState(currentState, nextInput):
	global MAXS
	global MAXC
	global out
	global g
	global f
	answer = currentState
	ch = int(ord(nextInput) - ord('a'))
	while g[answer][ch] == -1:
		answer = f[answer]
	return g[answer][ch]

def searchWords(arr,k,text):
	global MAXS
	global MAXC
	global out
	global g
	global f
	buildMatchingMachine(arr,k)
	currentState = 0
	for i in range(len(text)):
		currentState = findNextState(currentState, text[i])
		if out[currentState] == 0:
			continue
		for j in range(k):
			aux = (out[currentState] & (1 << j))
			if aux > 0:
				print("la palabra ",arr[j]," aparece de ",((i - len(arr[j])) + 1) , " a " , i)

if __name__ == '__main__':
	arr = ["he", "she", "hers", "his"]
	text = "ahishers"
	k = len(arr)
	searchWords(arr,k,text)
