class Solution(object):
    def minCost(self, n):
        #   n number n*(n+1)/2;
        # // nrglete 5;
        #  now n*(n-1)/2
        #  sum od n natural number withou n
        return (n*(n+1)//2)-n
        