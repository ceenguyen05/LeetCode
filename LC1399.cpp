
class Solution {
public:
    int countLargestGroup(int n) {
        std::unordered_map<int, int> groupCount;
        
        // Calculate the digit sum for each number from 1 to n and count the groups
        for (int i = 1; i <= n; ++i) {
            int digitSum = sumOfDigits(i);
            groupCount[digitSum]++;
        }
        
        // Find the largest group size
        int maxSize = 0;
        for (const auto& entry : groupCount) {
            maxSize = std::max(maxSize, entry.second);
        }
        
        // Count how many groups have the maximum size
        int count = 0;
        for (const auto& entry : groupCount) {
            if (entry.second == maxSize) {
                count++;
            }
        }
        
        return count;
    }
    
private:
    int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
};