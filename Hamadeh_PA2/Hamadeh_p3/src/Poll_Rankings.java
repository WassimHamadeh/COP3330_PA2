import java.util.Scanner;

public class Poll_Rankings 
{
	public static void main(String[] args) 
	{
      Scanner scnr = new Scanner(System.in);
      String[] topic = {"Climate Change   ", "Music            ", "UCF Football     ", "Showering        ", "Cars             "};
      int numTopics = 5;
      int row = 5;
      int col = 10;
      int[][] data = new int[row][col];
      String quit = "No";
      int rating;
      int i;
      int j;
      int[] totalR = new int[numTopics];
      double[][] mean = new double[numTopics][2];
      int[] numPeeps = new int[500];
      int maxVal;
      int minVal;
      String maxTopic;
      String minTopic;
      
      System.out.println("Rate the following topics on a scale of 1 (least important) to 10 (most important) on their importance to you: ");
      System.out.println("");
    	 
      while (quit.equals("No") || quit.equals("no"))
      {
	      for (i = 0; i < numTopics; i++)
	      {
	    	  System.out.println(topic[i]);
	    	  rating = scnr.nextInt();
	    	  
	    	  totalR[i] += rating;
	    	  mean[i][0] += rating;
	    	  mean[i][1]++;
	    	 
	    	  data[i][rating - 1]++;
	    	  
	    	  while (rating < 1 || rating > 10)
	    	  {
	    		  System.out.println("Not a valid rating. Try doing it again.");
	    		  rating = scnr.nextInt();
	    	  }
		  }
	      
	      System.out.println("Would you like to quit?");
	      quit = scnr.next();
	      System.out.println("");
      }
          
      System.out.println("Rating:          1   2   3   4   5   6   7   8   9  10       Average:");
      System.out.println("");
      
	      for (i = 0; i < 5; i++)
	      {
	    	 System.out.print(topic[i]);
	    	  
	    	 for(j = 0; j < 10; j++)
	    	 {
	    		 System.out.print(data[i][j] + "   ");
	    	 }
	    	 
	    	 System.out.println("\t" + (mean[i][0] / mean[i][1]));
	    	 System.out.println("");
	      }
	      
	      System.out.println("Wanna know what topic was rated most important?");
	      System.out.println("");
	      
	      maxVal = totalR[0];
	      maxTopic = topic[0];
	      minVal = totalR[0];
	      minTopic = topic[0];
	      
	      for (i = 0; i < numTopics; i++)
	      {
	    	  if (totalR[i] > maxVal)
	    	  {
	    		  maxVal = totalR[i];
	    		  maxTopic = topic[i];
	    	  }
	    	  
	    	  if (totalR[i] < minVal)
	    	  {
	    		  minVal = totalR[i];
	    		  minTopic = topic[i];
	    	  }
	      }
	      
	      System.out.println("It was " + maxTopic + "\nwith " + maxVal + " point(s)!");
	      System.out.println("");
	      
	      System.out.println("Wanna know what topic was rated least important?\nProbably not because it was least important");
	      System.out.println("");
	      System.out.println("It was " + minTopic + "\nwith " + minVal + " point(s)!");
	}
}
