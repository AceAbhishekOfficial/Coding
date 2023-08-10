

//User function Template for Java

class Solution
{
    static long largestPrimeFactor(int N) 
    {
        int largestPrime = N;

        while (N % 2 == 0) {
            largestPrime = 2;
            N /= 2;
        }

        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            while (N % i == 0) {
                largestPrime = i;
                N /= i;
            }
        }

        if (N > 2) {
            largestPrime = N;
        }

        return largestPrime;
    }
}