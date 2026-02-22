package Dsa.Graphs;

import java.util.*;

public class DFS {


    public static void main(String[] args) {

        //adjacency list
        List<List<Integer>> graph=new ArrayList<>();

        //input the graph and then call the dfs function
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //node
        int m=sc.nextInt(); //edge

        //initialize the graph
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }

        //input the edges
        for(int i=0;i<m;i++){
            int u=sc.nextInt(); //from
            int v=sc.nextInt(); //to

            //add edge to the graph
            graph.get(u).add(v); //directed graph
            //if undirected graph then also add the reverse edge
            // graph.get(v).add(u);

        }

        boolean[] visited =new boolean[n+1];


        dfs(1,graph,visited); //start dfs from node 1

        for(int i=1;i<=n;i++){
            if(visited[i]){
                System.out.println(i+" is visited");
            }else{
                System.out.println(i+" is not visited");
            }
        }

        System.out.println("Number of components in the graph: "+NumberOfComponents(graph));



    }

    //this work for connected graph if the graph is not connected then we have to call dfs for every unvisited node in the graph

    public static void dfs(int node , List<List<Integer>> graph, boolean[] visited){

        visited[node]=true;//mark the neighbour as visited

        for(int neighbour:graph.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour,graph,visited); //recursive call to dfs for the neighbour
            }
        }
    }


    public static int NumberOfComponents(List<List<Integer>> graph){
        int n=graph.size();
        boolean[] visited =new boolean[n+1];
        int count=0;
        for(int i=1;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(i,graph,visited);
            }
        }
        return count;
    }



}

//input example: connected graph
// 5 4 node and edge
// 1 2
// 1 3
// 2 4
// 3 5

//input example: disconnected graph
// 5 4 node and edge
// 1 2
// 1 1
// 2 4
// 3 5
