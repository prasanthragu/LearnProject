package LearnJavaPrograms;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BombGame {
	
	public int returnRandomNumber(int min, int max) {
		
//		return ThreadLocalRandom 
//	            .current() 
//	            .nextInt(min, max + 1);
		
		Random random = new Random();
	    return random.nextInt(max-min) + min;
	}
	
	public static void main(String[] args) {
		
		BombGame bg= new BombGame();
		int min=1,max=16,j=0;
		int BombPlaced = bg.returnRandomNumber(min, max);
		System.out.println("BombPlaced: "+BombPlaced);
		int[] arr=new int[max];
		arr[BombPlaced-1]=1;
		int clickAnyBox;
//		for(int i=0; i<max;i++) {
//			System.out.println(arr[i]);
//		}
		for(int i=0; i<max;i++) {
			
			while(true){
				
				clickAnyBox=bg.returnRandomNumber(min, max);
				if(arr[clickAnyBox-1]!=2) {
					break;
				}
			}
			System.out.println(clickAnyBox);
			if(arr[clickAnyBox-1]==1) {
				break;
			}
			else {
				
				arr[clickAnyBox-1]=2;
				j++;
			}
			
			
			
		}
		
		if(j==max-2) {
			System.out.println("You Won the Game");
		}
		else {
			System.out.println("You Loss the Game");
		}
		
		
	}

}
