package brain;

import java.util.Scanner;

public class BrainDelegate {

	private RightLobe rightLobe;
	private LeftLobe leftLobe;
	
	public BrainDelegate(){
		rightLobe = new RightLobe();
		leftLobe = new LeftLobe();
	}
	
	public BrainDelegate(int random){
		rightLobe = new RightLobe((int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100));
		leftLobe = new LeftLobe((int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100));
	}
	
	public String toString(){
		String toReturn = "";
		toReturn = toReturn + "LeftLobe: " + leftLobe;
		toReturn = toReturn + " \nRightLobe: " + rightLobe;
		return toReturn;
	}
	
	public static void main(String[] args){
		BrainDelegate b = new BrainDelegate(1);
		//System.out.print(b);
		Scanner kb = new Scanner(System.in);
		while(true){
		System.out.println("Enter target string: ");
		String target = kb.nextLine();
		System.out.println("Enter pattern: ");
		String pattern = kb.nextLine();
		int index = find(target, pattern);
		System.out.println("Found at: " + index);
		}
	}
		
	
	private static int find(String target, String pattern){
		int startIT, indexT, indexP;
		startIT = 0;
		while(startIT<target.length()){
			indexT = startIT;
			indexP = 0; 
			while(indexP<pattern.length()){
				char currTarg = target.charAt(indexT);
				char currPat = pattern.charAt(indexP);
				if(currTarg != currPat)break;
				indexT++;
				indexP++;
			}
			if(indexP==pattern.length()){
				return startIT;
			}
			startIT++;
		}
		return -1;
	}
	
}
