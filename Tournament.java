import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class intro_Array 
{

	public static void main(String[] args) 
	{
		String[] country= {"Uruguay","Portugal","France","Argentina","Brasil","Mexico","Belgium","Japan","Spain","Russia","Croatia","Denmark","Sweden","Switzerland","colombia","England"};
		Scanner kb = new Scanner (System.in);
		String[] roundOf16= new String [16] ;
		String[] quarterFinal= new String [8];
		String[] semiFinal= new String [4];
		String[] endResult= new String [2];
		String [] winner=new String [1];
		int [] score= new int [16];
		int [] score1= new int [8];
		int [] score2= new int [4];
		int [] score3= new int [2];
		int tournaments = 1;
		int [] goalTournaments=new int [8];
		int [] goalTournaments2=new int [4];
		int [] goalTournaments3=new int [2];
		int [] goalTournaments4=new int [1];
		int [][] stats=new int [4][];
		int sum=0;
		double average;
		stats[0]= new int[8];
		stats[1]= new int[4];
		stats[2]= new int[2];
		stats[3]= new int[1];
		int min=0;
		int max=5;
		int min2=0;
		int max2=2;
		int number;
		boolean myTeam=true;
		Random generator= new Random();
		String favCountry;
		boolean teamRound16=false;
		System.out.print("Enter your favourite team ");
		favCountry= kb.nextLine();
		
		for (int i=0; i<16 ;i++) 
		{	
			if (favCountry.equalsIgnoreCase(country[i])) 
				{
					teamRound16=true;
				}
			
		}
		
		if (teamRound16==false) 
		{
			System.out.print("Your team is not in the Round of 16 ");
			System.exit(0);
		}
		else
			
					
		{
			do 
			{
				System.out.print("ROUND OF 16 ");	
				for(int i=0,k=1,v=0;i<16&& k<16;) 
				{
					score[i]= generator.nextInt(max-min)+min;
					score[k]=generator.nextInt(max-min)+min;
					roundOf16[v]= ("["+country[i]+" "+score[i]+":"+score[k]+" "+country[k]+"]");
					System.out.print(roundOf16[v]+" ");
					v++;
					i=i+2;
					k=k+2;
				}
				
			
				for (int i=0,v=0,k=1;v<8;v++) 		
				{
					if(score[i]==score[k]) 
					{
						number= generator.nextInt(max2-min2)+min2;
						if(number>0) 
						{
							score[i]+=1;
						}
						else
							score[k]+=1;
					}
					if (score[i]>score[k]) 
					{
						quarterFinal[v]=country[i];
					}
					else if(score[i]<score[k]) 
					{
						quarterFinal[v]=country[k];
					}
					//goalTournaments [v]= score[i]+score[k];
					stats[0][v]=score[i]+score[k];
					i=i+2;
					k=k+2;
					
					
				}
				System.out.print("\nQUARTER-FINALS ");	
				for(int i=0,k=1,v=0;i<8 && k<8;) 
				{
					score1[i]= generator.nextInt(max-min)+min;
					score1[k]=generator.nextInt(max-min)+min;
					semiFinal[v]= ("["+quarterFinal[i]+" "+score1[i]+":"+score1[k]+" "+quarterFinal[k]+"]");
					System.out.print(semiFinal[v]+" ");
					v++;
					i=i+2;
					k=k+2;
				}
				for (int i=0,v=0,k=1;v<4;v++) 
				{
					if(score1[i]==score1[k]) 
					{
						number= generator.nextInt(max2-min2)+min2;
						if(number>0) 
						{
							score1[i]+=1;
						}
						else
							score1[k]+=1;
					}
					if (score1[i]>score1[k]) 
					{
						semiFinal[v]=quarterFinal[i];
					}
					else if(score1[i]<score1[k]) 
					{
						semiFinal[v]=quarterFinal[k];
					}
					//goalTournaments2 [v]= score1[i]+score1[k];
					stats[1][v]=score1[i]+score1[k];
					i=i+2;
					k=k+2;
					
					
				}
				
				
				System.out.print("\nSEMI-FINALS ");	
				for(int i=0,k=1,v=0;i<4 && k<4;) 
				{
					score2[i]= generator.nextInt(max-min)+min;
					score2[k]=generator.nextInt(max-min)+min;
					endResult[v]= ("["+semiFinal[i]+" "+score2[i]+":"+score2[k]+" "+semiFinal[k]+"]");
					System.out.print(endResult[v]+" ");
					v++;
					i=i+2;
					k=k+2;
				}
				for (int i=0,v=0,k=1;v<=1;v++) 
				{
					if(score2[i]==score2[k]) 
					{
						number= generator.nextInt(max2-min2)+min2;
						if(number>0) 
						{
							score2[i]+=1;
						}
						else
							score2[k]+=1;
					}
					if (score2[i]>score2[k]) 
					{
						endResult[v]=semiFinal[i];
					}
					else if(score2[i]<score2[k]) 
					{
						endResult[v]=semiFinal[k];
					}
					//goalTournaments3 [v]= score2[i]+score2[k];
					stats[2][v]=score2[i]+score2[k];
					i=i+2;
					k=k+2;
					
					
				}
				for (int i=2;i<3;i++) 
				{
					for(int j=0;j<2;j++)
					stats[i][j]=goalTournaments3 [j];
				}
				System.out.print("\nFINALS ");	
				for(int i=0,k=1,v=0;i<2 && k<2;) 
				{
					score3[i]= generator.nextInt(max-min)+min;
					score3[k]=generator.nextInt(max-min)+min;
					winner[v]= ("["+endResult[i]+" "+score3[i]+":"+score3[k]+" "+endResult[k]+"]");
					System.out.print(winner[v]+" ");
					v++;
					i=i+2;
					k=k+2;
				}
				for (int i=0,v=0,k=1;v<1;v++) 
				{
					if(score3[i]==score3[k]) 
					{
						number= generator.nextInt(max2-min2)+min2;
						if(number>0) 
						{
							score3[i]+=1;
						}
						else
							score3[k]+=1;
					}
					if (score3[i]>score3[k]) 
					{
						winner[v]=endResult[i];
					}
					else if(score3[i]<score3[k]) 
					{
						winner[v]=endResult[k];
					}
					//goalTournaments4 [v]= score3[i]+score3[k];
					stats[3][v]=score3[i]+score3[k];
					i=i+2;
					k=k+2;
					
					
				}
				
				System.out.println("\nTournaments: "+ tournaments+ " The WINNER is: "+ winner[0]);
				if (favCountry.equalsIgnoreCase(winner[0])&& tournaments<=20 ) 
				{
					System.out.print("It took "  +tournaments+ " tournament(s) of the game for " +favCountry+ " to win!!!");
					myTeam=false;
					
				}
				if (!favCountry.equalsIgnoreCase(winner[0])&& tournaments>=20) 
				{
					System.out.print("Sorry, "+favCountry+  " didn't win in " +tournaments+ " tournaments!");
					myTeam=false;
					System.out.print("\n[Tournament "+tournaments+"]"+"total goals"+"[");
					
					
				}
			
				
				tournaments++;
				stats[0]= new int[8];
				stats[1]= new int[4];
				stats[2]= new int[2];
				stats[3]= new int[1];
			}
				while(myTeam);
			
			
		}

	
	}	
	
}
