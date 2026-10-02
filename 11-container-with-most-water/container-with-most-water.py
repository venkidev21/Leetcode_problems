class Solution(object):
    def maxArea(self, height):
        water=0
        l=0
        r=len(height)-1
        while l<r:
            ln=min(height[r],height[l])
            b=r-l
            water=max(water,ln*b)
            if height[l]<height[r]:
                l+=1
            else:
                r-=1
        return water
        