package Easy;

public class RichestCustomerWealth {
    /*
    You are given an m x n integer grid accounts where accounts [i][j] is
    the amount of money ith costumer has in the jth bank. Return the
    wealth that the richest customer has

    A customer's wealth is the amount of money they have in all their
    bank accounts. The richest customer is the customer that has the
    maximum wealth.

    Example:
    Input: accounts = [[1,5],[7,3],[3,5]]
    Output: 10
     */

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++) {
            int sum =0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
                if (sum >= max) {
                    max = sum;
                }
            }
        }
        return max;
    }

}
