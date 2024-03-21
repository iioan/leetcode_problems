class Solution(object):
    def isAnagram(self, s, t):
        count1 = [0] * 26
        for i in range(0, len(s)):
            pos = ord(s[i]) - ord('a')
            count1[pos] += 1
        for i in range(0, len(t)):
            pos = ord(t[i]) - ord('a')
            count1[pos] -= 1
        for i in range(0, 26):
            if count1[i] != 0:
                return False
        return True
         
        