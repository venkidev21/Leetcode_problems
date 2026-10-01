class Solution(object):
    def isValid(self, s):
        ls=[]
        for i in s:
            if i=='(' or i=='[' or i=='{':
                ls.append(i)
            elif len(ls)>0:
                if i==')' and ls[-1]=='(':
                    ls.pop()
                elif i=='}' and ls[-1]=='{':
                    ls.pop()
                elif i==']' and ls[-1]=='[':
                    ls.pop()
                else :
                    return False
            else :
                return False
        return len(ls)==0
        