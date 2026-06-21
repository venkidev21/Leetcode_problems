class Solution(object):
    def maxIceCream(self, costs, coins):
        costs.sort()
        max=0
        for i in costs:
            if coins-i>=0:
                coins-=i
                max+=1
        return max
        