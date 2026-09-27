class Solution(object):
    def reverseParentheses(self, s):
        """
        :type s: str
        :rtype: str
        """
        ls=[]
        for c in s:
            if(c!=")"):
                ls.append(c)
            else:
                st=""
                while ls and ls[-1]!="(":
                    st+=(ls[-1][::-1])
                    ls.pop()
                ls.pop()
                ls.append(st)
        return "".join(ls)


        