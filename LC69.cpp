// Newton-Raphson method
class Solution {
public:
    // edge cases 
    int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x ;
        }

        // set precision 
        double prec = .000001 ;
        // intial guess 
        double guess = x / 2 ;
        // formula , keeps going until in range 
        while (abs(guess * guess - x) > prec) {
            guess = (guess + x / guess) / 2 ;
        }
        return static_cast<int>(guess) ;
    }
};