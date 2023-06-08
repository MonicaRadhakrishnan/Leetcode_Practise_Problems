package com.problems.practise;

public class RichestCustomerWealth_1672 {

	public static void main(String[] args) {
		RichestCustomerWealth_1672 rc = new RichestCustomerWealth_1672();
		int[][] accounts = {{7,1,3},{2,8,7},{1,9,5}};
		System.out.println("RichestCustomerWealth= " +rc.maximumWealth(accounts));
	}
	public int maximumWealth(int[][] accounts) {
        int maxWealth =0;
        for(int[] customer : accounts){
            int currCustomer = 0;
            for(int bank : customer){
                currCustomer += bank;
            }
            maxWealth = Math.max(maxWealth,currCustomer);
        }
        return maxWealth;
    }
}
