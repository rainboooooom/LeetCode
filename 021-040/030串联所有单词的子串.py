"""

给定一个字符串 s 和一些长度相同的单词 words。

找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置

"""


class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        
        res = []
        if not words:
            return res

        words_count, word_len = len(words), len(words[0]) # 单词个数和每个单词长度
        words_dict, s_len = {}, len(s)

        for word in words:
            words_dict[word] = words_dict.get(word, 0) + 1

        for i in range(word_len):   # 根据单词长度划分几块
            left, right, count, now_dict = i, i, 0, {} # 起始单词位置, 单词数, 单词字典
            while right <= s_len - word_len:
                right_str = s[right:right+word_len]
                if right_str not in words_dict: # 词不在words中, 从right右边重新开始
                    count, now_dict, right = 0, {}, right + word_len
                    left = right
                else:
                    now_dict[right_str] = now_dict.get(right_str, 0) + 1
                    right += word_len
                    count += 1

                    while now_dict[right_str] > words_dict[right_str]:
                        # 谋个词多了, 所以就要把多了的这个词在前面的去掉一个
                        left_str = s[left:left+word_len]
                        now_dict[left_str] -= 1
                        count -= 1
                        left += word_len

                    if count == words_count: #如果 dict 和 count都没有问题, 说明匹配
                        res.append(left) # 之后的left后移一位
                        now_dict[s[left:left+word_len]] -= 1
                        count -= 1
                        left += word_len

        return res


