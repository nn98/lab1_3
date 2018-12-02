package lab1_3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("lab1_3: ±èÀ±¼­\n");
		Random r=new Random();
		int c[]=new int[11];
		int co[]={0,0,0,0};
		
		System.out.print("·£´ý ³Ñ¹ö = ");
		for(int i=0;i<10;i++) {
			c[i]=r.nextInt(4)+1;
			System.out.print(c[i]+" ");
		}
		for(int i=0;i<10;i++) {
			if(c[i]==1) {
				co[0]++;
			}
			if(c[i]==2) {
				co[1]++;
			}
			if(c[i]==3) {
				co[2]++;
			}
			if(c[i]==4) {
				co[3]++;
			}
		}
		for (int i=0;i<4;i++) {
			System.out.print("\n"+(i+1)+"ÀÇ °¹¼ö = "+co[i]);
		}
	}

}
