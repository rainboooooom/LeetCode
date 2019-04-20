"""

编写一个程序，通过已填充的空格来解决数独问题。

"""

class Solution:
    def __init__(self) -> None:
        self.rows = [{} for i in range(9)]
        self.cols = [{} for i in range(9)]
        self.boxes = [{} for i in range(9)]
        self.empty = []

    def solveSudoku(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        for i in range(9):
            for j in range(9):
                num = board[i][j]
                if num != '.':
                    num = int(num)
                    box_index = (i // 3) * 3 + j // 3

                    self.rows[i][num] = self.rows[i].get(num, 0) + 1
                    self.cols[j][num] = self.cols[j].get(num, 0) + 1
                    self.boxes[box_index][num] = self.boxes[box_index].get(num, 0) + 1
                else:
                    self.empty.append((i, j))
    
        self.completeSudoku(board)
    
    def completeSudoku(self, board) -> None:
        """
        填写数独
        """
        if not self.empty:
            return 

        i, j  = self.empty[-1] # 获取未填写列表的最后一个
        box_index = (i // 3) * 3 + j // 3
        
        nums = self.getFillInNums(i, j) # 获取可以填写的数字生成器

        for n in nums:
            board[i][j] = str(n)
            
            self.rows[i][n] = 1
            self.cols[j][n] = 1
            self.boxes[box_index][n] = 1

            e = self.empty.pop() 
            self.completeSudoku(board)

            if not self.empty:
                return

            del self.rows[i][n]
            del self.cols[j][n]
            del self.boxes[box_index][n]
            self.empty.append(e)

        board[i][j] = '.'

    def getFillInNums(self, i, j):
        """返回可填数字生成器"""
        box_index = (i // 3) * 3 + j // 3
        for num in range(1, 10): # 看1~9是否可以填写到这个位置上
            if num in self.rows[i] or num in self.cols[j] or num in self.boxes[box_index]:
                continue
            else:
                yield num


