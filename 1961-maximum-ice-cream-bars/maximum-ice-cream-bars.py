class Solution(object):
    def maxIceCream(self, costs, coins):
        costs.sort()
        count=0
        for i in costs:
            if coins-i>=0:
                count+=1
                coins-=i
        return count
        