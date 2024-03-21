class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        setf1 = set(nums)
        if len(setf1) < len(nums):
            return True
        else:
            return False
