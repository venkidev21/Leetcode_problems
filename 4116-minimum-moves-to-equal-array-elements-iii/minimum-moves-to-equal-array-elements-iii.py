class Solution(object):
    def minMoves(self, nums):
        n=nums[0]
        for i in nums:
            n=max(n,i)
        ans=0
        for i in nums:
            ans+=(n-i)
        return ans