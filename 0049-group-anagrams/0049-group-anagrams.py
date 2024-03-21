class Solution(object):
    def groupAnagrams(self, strs):
        dict = {}
        for s in strs:
            sorted_s = sorted(s)
            sorted_s = "".join(sorted_s)
            if sorted_s in dict.keys():
                dict[sorted_s].append(s)
            else:
                dict[sorted_s] = [s]
        result = [dict[elem] for elem in dict] 
        return result