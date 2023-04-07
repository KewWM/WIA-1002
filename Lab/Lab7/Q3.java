
package Lab7;

import java.util.Scanner;

public class Q3 
{
    public static void main(String[] args) 
    {
        MyQueue<Integer> shareQ = new MyQueue<>();
        MyQueue<Integer> priceQ = new MyQueue<>();
        Scanner ya = new Scanner(System.in);
        
        int gainLoss = 0, numShare = 0, sellAmount = 0;
        
        do
        {
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            String[] input = ya.nextLine().split(" ");
            input[4] = input[4].substring(1);
            
            switch (input[0])
            {
                case "Buy" -> 
                {
                    System.out.println("Buying now...");
                    shareQ.enqueue(Integer.parseInt(input[1]));
                    priceQ.enqueue(Integer.parseInt(input[4]));
                }
                case "Sell" -> 
                {
                    System.out.println("Selling the shares now...");
                    numShare = Integer.parseInt(input[1]);
                    sellAmount = Integer.parseInt(input[4]);

                    while (numShare > 0)
                    {
                        if (shareQ.peek() <= numShare)
                        {
                            gainLoss += shareQ.peek() * (sellAmount - priceQ.dequeue());
                            numShare -= shareQ.dequeue();
                            System.out.println("Total Capital Gain / Loss: " + gainLoss);
                        }
                        else
                        {
                            gainLoss += numShare * (sellAmount - priceQ.peek());
                            
                            
                            //Update first element in shareQ
                            int temp = shareQ.dequeue() - numShare;
                            shareQ.enqueue(temp);
                            if (shareQ.getSize() > 1)
                            {
                                for (int i = 0; i < shareQ.getSize() - 1; i++) 
                                {
                                    shareQ.enqueue(shareQ.dequeue());
                                }
                            }
                            numShare = 0;
                            System.out.println("Total Capital Gain / Loss: " + gainLoss);
                        }
                        
                        if (shareQ.isEmpty() || priceQ.isEmpty()) 
                        {
                            System.out.println("No shares to sell!");
                            break;
                        }
                    }
                }  
                
            }
            
            System.out.println("Queue for Share: Queue: " + shareQ.toString());
            System.out.println("Queue for Price: Queue: " + priceQ.toString());
            
        } while (!(shareQ.isEmpty() || priceQ.isEmpty()));
        
        System.out.println("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
        System.out.println("Final Capital Gain / Loss: " + gainLoss);
    }
}
