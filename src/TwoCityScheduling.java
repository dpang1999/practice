//https://leetcode.com/problems/two-city-scheduling/description/
import java.util.ArrayList;
import java.util.PriorityQueue;
public class TwoCityScheduling {
    public static void main(String[] args) {
        int[][] costs = new int[5][2];
        //whatever the problem gives you actually, I don't have any, but the below works!

        PriorityQueue<Integer> q = new PriorityQueue<>();
        int costDiff[] = new int[costs.length];
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i=0; i<costs.length;i++)
        {
            costDiff[i]=costs[i][0]-costs[i][1];
            q.add(costDiff[i]);
            indices.add(i);
        }

        int n = costs.length/2;
        int totalCost=0;

        int value;
        for (int i=0; i<n; i++)
        {
            value=q.poll();
            for (int x=0;x<indices.size();x++)
            {
                int j=indices.get(x);
                if(value==costDiff[j])
                {
                    totalCost+=costs[j][0];
                    indices.remove(Integer.valueOf(j));
                    x=indices.size();
                }
            }
        }
        for(Integer i: indices)
        {
            totalCost+=costs[i][1];

        }




        //return totalCost;
    }
}

