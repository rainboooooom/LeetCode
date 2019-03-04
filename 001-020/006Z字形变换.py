"""

将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。


"""


class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s;

        rows = []
        for i in range(min(numRows, len(s))):
            rows.append("")
        c_row = 0 # 记录当前要记录字符得到行数
        go_down = False # 记录行之间移动的方向
        for c in s:
            rows[c_row]+=c
            if(c_row == 0 or c_row == numRows - 1):
                go_down = not go_down
            curRow += 1 if go_down else - 1

        return "".join(rows)
