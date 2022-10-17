package CS176L;
//Amani Minaya Assignment 3
public class assignment3 {
	//math of stair method
	public static int Stairs (int num) {
		if (num<=1) {
			return 1;
		}
		int[] staircase = new int [num+1];
		staircase[0]=1;
		staircase[1]=1;
		for(int i=2; i<=num; i++) {
			staircase[i]= staircase[i-1] + staircase[i-2];
		}
		return staircase[num];
    }
    public static void main(String[] args) {
		int steps = 2;		                        
		System.out.println("The amount of ways you can climb to the top: "+Stairs(steps));
}
}