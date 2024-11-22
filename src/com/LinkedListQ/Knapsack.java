package com.LinkedListQ;
public class Knapsack {
        static int knapSack(int W, int[] wt, int[] val, int n)
        {
            int[] dp = new int[W + 1];

            for (int i = 1; i < n + 1; i++) {
                for (int w = W; w >= 0; w--) {

                    if (wt[i - 1] <= w)
                        dp[w]  = Math.max(dp[w], dp[w - wt[i - 1]] + val[i - 1]);
                }
            }
            return dp[W];
        }

        public static void main(String[] args)
        {
            int[] profit = { 50, 130, 100 };
            int[] weight = { 10, 20, 30 };
            int W = 50;
            int n = profit.length;
            System.out.print("Maximum profit: ");
            System.out.print(knapSack(W, weight, profit, n));
        }
    }

    // COMPLEXITY 0(N*W)
    // space O(W)