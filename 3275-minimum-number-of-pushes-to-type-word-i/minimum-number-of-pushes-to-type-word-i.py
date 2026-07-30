class Solution(object):
    def minimumPushes(self, word):
        i=1
        ans=0
        n=len(word)
        while(n>=8):
            n-=8
            ans+=(8*i)
            i+=1
        ans+=(n*i)
        return ans

        