def isValid(nums):
    # extract numbers
    nums = [i for i in nums if i != '.']
    return len(nums) == len(set(nums))

class Solution(object):
    def isValidSudoku(self, board):
        # 1st element of the mini-square
        firsts = [(0, 0), (0, 3), (0, 6), 
                  (3, 0), (3, 3), (3, 6), 
                  (6, 0), (6, 3), (6, 6)]
        
        # last element of the mini-square
        lasts = [(2, 2), (2, 5), (2, 8),
                (5, 2), (5, 5), (5, 8),
                (8, 2), (8, 5), (8, 8)]
        
        for i in range(9):
            # we check the rows and the columns
            row = board[i]
            col = [board[j][i] for j in range(9)]
            if not isValid(row) or not isValid(col):
                return False
            
        for (i, j), (n, m) in zip(firsts, lasts):
            nums = []
            # we extract elements from the mini-square
            for k in range(i, n + 1):
                for l in range(j, m + 1):
                    nums.append(board[k][l])
            if not isValid(nums):
                return False
        return True
