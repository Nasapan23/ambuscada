package ambuscada;

import java.util.Scanner;

public class rau {
	static Scanner input = new Scanner(System.in);
	static int[] Soldati;
	public static void main(String[] args) {
		int	N = input.nextInt();
		int	M = input.nextInt();
		int	V = input.nextInt();
		Sold(N,M,V);
	}
	public static void Sold(int N,int M,int V) {
		Soldati= new int[N+1];
		for(int i=1;i<=N;i++) {
			Soldati[i]=V;
		}
		damage(N,Soldati,M);
	}
	public static void damage(int N,int[] Soldati,int M) {
		for(int x=1;x<=M;x++) {
		int i=input.nextInt();
		int j=input.nextInt();
		int k=input.nextInt();
			for(int x1=i;x1<=j;x1++) {
				Soldati[x1]=Soldati[x1]-k;
			}
		}
		afisare(N,Soldati);
	}
	public static void afisare(int N, int[] Soldati) {
		int cnt=0;
		for(int i=1;i<=N;i++) {
			if(Soldati[i]>0) {
				cnt++;
			}
		}
		System.out.println("Numarul de soldati ramasi in viata sunt "+cnt);
	}
}