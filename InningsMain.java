package com.edtech;
import java.util.*;
public class InningsMain {
	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)){
			Innings innings=new Innings();
			System.out.println("Enter the team name:");
			String teamname=sc.nextLine();
			innings.setTeamname(teamname);

			System.out.println("Enter session:");
			String inningsname=sc.nextLine();
			innings.setInningsname(inningsname);
			
			System.out.println("Enter score:");
			int runs=sc.nextInt();
			innings.setRuns(runs);
			innings.displayInningsDetails();
		}
		}
		
	}



