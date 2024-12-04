
class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        count = 0 
        while (count < 32) :
            if (2 ** count) == n :
                return True 
            count += 1 
        return False 