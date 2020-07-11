/*
It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue. Initial positions increment by  1 from 1  at the front of the line to n at the back.

Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line. One person can bribe at most two others. For example, if n=8 and 5 bribes 4 , the queue will look like this: .
1,2,3,5,4,6,7,8
Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state!

Function Description

Complete the function minimumBribes in the editor below. It must print an integer representing the minimum number of bribes necessary, or Too chaotic if the line configuration is not possible.

minimumBribes has the following parameter(s):

q: an array of integers
Input Format

The first line contains an integer t , the number of test cases.

Each of the next  pairs of lines are as follows: 
- The first line contains an integer , the number of people in the queue 
- The second line has  space-separated integers describing the final state of the queue.

Constraints

Subtasks

For 60% score 1<=n<=10^3
For 100% score 1<=n<=10^3

Output Format

Print an integer denoting the minimum number of bribes needed to get the queue into its final state. Print Too chaotic if the state is invalid, i.e. it requires a person to have bribed more than  people.

Sample Input

2
5
2 1 5 3 4
5
2 5 1 3 4
Sample Output

3
Too chaotic */

package Practice;

public class NewYearChaos {

    static void minimumBribes(int[] q)
    {
        int bribe = 0;
    boolean chaotic = false;
    int n = q.length;
    for(int i = 0; i < n; i++)
    {
        int a=q[i]-(i+1);
        System.out.print(a+"  ");
        if(a > 2)
        {               
            chaotic = true;
            break;     
        }
        for (int j = Math.max(0, q[i]-2); j < i; j++)
            if (q[j] > q[i]) 
                bribe++;
    }
    if(chaotic)
        System.out.println("Too chaotic");
    else
        System.out.println(bribe);
        
        
    }
    
    public static void main(String[] args) {
        int a[] = new int[] {5, 1, 2, 3, 7, 8, 6, 4};
        minimumBribes(a);
    }
}
