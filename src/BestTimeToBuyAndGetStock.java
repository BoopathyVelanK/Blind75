import java.util.*;
public class BestTimeToBuyAndGetStock{
    public static int  maxProfit(int[] prices){
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            profit=Math.max(profit,prices[i]-min);

        }
        return profit;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] prices=new int[n];

        for(int i=0;i<n;i++)
            prices[i]=g.nextInt();

        System.out.print(maxProfit(prices));
    }
}
