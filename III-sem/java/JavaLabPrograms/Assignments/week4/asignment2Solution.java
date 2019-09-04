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
	protected int adjacencyMatrix[][];
    
    Graph()
	{
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Enter no. of vertices : ");
        n = scan.nextInt();
        adjacencyMatrix = new int[n][n];
    }
    
	Graph(int n)        // no of vextex
	{
		adjacencyMatrix = new int [n][n];   // by default its initialized to 0
    }

    public void input()
    {
        Scanner scan = new Scanner(System.in);

 
        for(int i = 0 ; i < adjacencyMatrix.length ; i++)
        {
            for(int j = 0 ; j < adjacencyMatrix.length ; j++)
            {
                if(i == j)
                    adjacencyMatrix[i][j] = 0;
                else
                {
                    System.out.print("V(" + (i + 1) + ", " + (j + 1) + ") : ");
                    adjacencyMatrix[i][j] = scan.nextInt();
                }
            }
            System.out.println();
        }
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

	public boolean isConnected()
    {  
        int temp[][] = new int[adjacencyMatrix.length][adjacencyMatrix.length];
            // copy 
        for(int i = 0 ; i < temp.length ; i++)
            for(int j = 0 ; j < temp.length ; j++)
                temp[i][j] = adjacencyMatrix[i][j];

        for(int k = 0 ; k < temp.length ; k ++)
            for(int i = 0 ; i < temp.length ; i++)
                for(int j = 0 ; j < temp.length ; j++)
                    if(temp[i][k] == 1 && temp[k][j] == 1)
                        temp[i][j] = 1;
   
        for(int i = 0 ; i < temp.length ; i++)
             for(int j = 0 ; j < temp.length ; j++)
                    if(temp[i][j] == 0)
                        return false; 
          return true;
    }
}

class DirectedGraph extends Graph
{
    DirectedGraph()
    {
        super();
    }

    DirectedGraph(int n)
    {
        super(n);
    }

	public int[] indegree()
	{
        int sum, degree[] = new int[adjacencyMatrix.length];

		for(int i = 0 ; i < adjacencyMatrix.length; i++)
		{
			sum = 0;
            for( int j = 0 ; j < adjacencyMatrix.length; j++)
                sum += adjacencyMatrix[j][i];                //sum of cols
            degree[i] = sum;
        }
        
        return degree;
    }
    
	
	public int[] outdegree()
	{
        int sum, degree[] = new int[adjacencyMatrix.length];

		for(int i = 0 ; i < adjacencyMatrix.length; i++)
		{
			sum = 0;
            for( int j = 0 ; j < adjacencyMatrix.length; j++)
                sum += adjacencyMatrix[i][j];                 //sum of rows
            degree[i] = sum;
        }   
        return degree;
    }
}

public class asignment2Solution
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		DirectedGraph directedGraph;
        int n;
        int degree[];

        // Directed Grap
        System.out.println("****************");
        System.out.println("*DIRECTED GRAPH*");
        System.out.println("****************\n");
		
        System.out.print("Enter no. of vertices : ");
        n = scan.nextInt();
        
        degree = new int[n];
        
        directedGraph = new DirectedGraph(n);
        System.out.println("Press 1 iff V(i, j) adjacent otherwise 0:\n");
        directedGraph.input();

        System.out.println("Adjacency Matrix is as follows : ");
        directedGraph.display();

        System.out.println();
        degree = directedGraph.indegree();
		for( int i = 0 ; i < degree.length; i++ ) System.out.println("In-degree  of vertex " + (i + 1) + " : " + degree[i] );

        System.out.println();
        degree = directedGraph.outdegree();
		for( int i = 0 ; i < degree.length; i++ ) System.out.println("Out-degree of vertex " + (i + 1) + " : " + degree[i] );

        System.out.println();
        if(directedGraph.isConnected())
           System.out.println("Graph is connected");
        else
           System.out.println("Graph is not connected");


/*
        System.out.println("****************");
        System.out.println("*WEIGHTED GRAPH*");
        System.out.println("****************\n");

        System.out.print("Enter no. of vertices : ");
        n = scan.nextInt();
        
        
        weightedGraph = new WeightedGraph(n);
        System.out.println("Press W(V(i, j)) iif they are adjacent otherwise -1:\n");
        weightedGraph.input();

        System.out.println("Adjacency Matrix is as follows : ");
        weightedGraph.display();
*/
	}
}