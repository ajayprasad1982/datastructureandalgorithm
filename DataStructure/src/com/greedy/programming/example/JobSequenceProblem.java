/**
 * 
 */
package com.greedy.programming.example;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author aprasa03
 *
 *         Feb 19, 2015
 */
public class JobSequenceProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Job arrayJob[] = { new Job('a', 2, 100), new Job('b', 1, 19),
				new Job('c', 2, 27), new Job('d', 1, 25), new Job('e', 3, 15) };
		char result[] = new char[arrayJob.length];
		boolean slot[] = new boolean[arrayJob.length];

		Collections.sort(Arrays.asList(arrayJob));
		for (int i = 0; i < arrayJob.length; i++) {
			Job job = arrayJob[i];
			//System.out.println(job.getId() + " " + job.profit);
		}
		getJobSequence(arrayJob);
		jobSequence(arrayJob, result, slot, 0);
		for(int i=0;i<arrayJob.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}

	private static void getJobSequence(Job arrayJob[]) {
		char result[] = new char[arrayJob.length];
		boolean slot[] = new boolean[arrayJob.length];

		for (int i = 0; i < arrayJob.length; i++) {
			int j=arrayJob[i].getDeadLine()-1;
			while(j>=0)
			{
			if (slot[j]==false) {
				result[j] = arrayJob[i].getId();
				slot[j] = true;
            break;
			}
			j--;
			}
		}
		
		for(int i=0;i<arrayJob.length;i++)
		{
			System.out.print(result[i]+" ");
		}
		

	}
private static void jobSequence(Job arrayJob[],char result[],boolean slot[],int i){
	
	if(i>=arrayJob.length)
		return;
	int j=arrayJob[i].getDeadLine()-1;
	while(j>=0)
	{
	if (slot[j]==false) {
		result[j] = arrayJob[i].getId();
		slot[j] = true;
     //jobSequence(arrayJob,result,slot,i+1);
		break;
	}
	j--;
	}
	jobSequence(arrayJob,result,slot,i+1);	

	
}
	

}
