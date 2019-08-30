/*
  Define a class Graph that should model a Graph data structure and store its adjacency matrix, and have default (adjacency matrix 
  should be a null matrix) as well as parameterized constructors. Graph class also has two method display() that displays the adjacency 
  matrix, and isConnected() as predicate method that checks whether given graph is connected or not. Create two another classes namely 
  DirectedGraph and WeightedGraph, both inherits Graph. DirectedGraph has two methods indegree() and outdegree() that calculates and 
  indegree and outdegree of each node in the DirectedGraph. Similarly, WeightedGraph has a method shortestPath() that finds the shortest 
  path between two given nodes using any of the algorithm known to you.
 
  Write a Test program to demonstrate the working of all the three classes in your main program.
*/
import java.util.Scanner;

class Graph
{
	private int adjacencyMatrix[][];

	Graph()
	{

	}

	Graph(int n) // no of vextex
	{
		adjacencyMatrix = new int [n][n]; // by default its initialized to 0
	}

	public void display()
	{
		for(int i = 0 ; i < adjacencyMatrix.length; i++)
		{
			for( int j = 0 ; j < adjacencyMatrix.length; j++)
				System.out.print(adjacencyMatrix[i][j] + " ");
	        System.out.println();
		}
	}

	public void isConnected()
    {  
		System.out.println("isConnected");    	
	}
}

class DirectedGraph extends Graph
{
	public void indegree()
	{

		for(int i = 0 ; i < adjacencyMatrix.length; i++)
		{
			System.out.print("OutDegree of vertex " + (i + 1) + " : " );
			sum = 0;
			for( int j = 0 ; j < adjacencyMatrix.length; j++)
				sum = sum + adjacencyMatrix[i][j]; //sum of rows 
		    
		    System.out.println(sum);
		}
	}
	public void outdegree()
	{
		for(int i = 0 ; i < adjacencyMatrix.length; i++)
		{
			System.out.print("OutDegree of vertex " + (i + 1) + " : " );
			sum = 0;
			for( int j = 0 ; j < adjacencyMatrix.length; j++)
				sum = sum + adjacencyMatrix[j][i]; //sum of cols 
		    
		    System.out.println(sum);
		}
	}
}

public class asignment2Solution
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		DirectedGraph dg;
		int n;

		System.out.print("Enter no. of vertices : ");
		n = scan.nextInt();

		dg = new DirectedGraph(n);
		System.out.println("adjacencyMatrix of undirected graph is as follows : ");

		dg.display();
		dg.isConnected();
		dg.indegree();
		dg.outdegree();
	}
}