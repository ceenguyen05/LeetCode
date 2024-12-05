
class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        # if n is one , means it was fully divisable by 4 each time 
        if n == 1 :
            return True 
        # if n is below 1 , the n value is not a perfect divsor 
        # also if it has a remainder , means 4 is not a perfect divsor 
        if n < 1 or n % 4 != 0 :
            return False 
        return self.isPowerOfFour(n // 4)