from collections import defaultdict
 
class AssignCap: 
    def __init__(self): 
        self.allmask = 0
        self.total_caps = 100
        self.caps = defaultdict(list) 

    def countWaysUtil(self, dp, mask, cap_no): 
        if mask == self.allmask: 
            return 1
        if cap_no > self.total_caps: 
            return 0
        if dp[mask][cap_no] != -1: 
            return dp[mask][cap_no] 
        ways = self.countWaysUtil(dp, mask, cap_no + 1)  
        if cap_no in self.caps: 
            for ppl in self.caps[cap_no]: 
                if mask & (1 << ppl): continue
                ways += self.countWaysUtil(dp, mask | (1 << ppl), cap_no + 1) 
                ways = ways % (10 ** 9 + 7)  
        dp[mask][cap_no] = ways 
        return dp[mask][cap_no] 
    def countWays(self, N): 
        for ppl in range(N): 
            cap_possessed_by_person = map(int, raw_input().strip().split()) 
            for i in cap_possessed_by_person: 
                self.caps[i].append(ppl) 
        self.allmask = (1 << N) -1
        dp = [[-1 for j in range(self.total_caps + 1)] for i in range(2 ** N)] 
        print self.countWaysUtil(dp, 0, 1, ) 

def main(): 
    No_of_people = input()  
    AssignCap().countWays(No_of_people) 
main() 

