package com.company;

public class Matrix {
    private int[][] graph;
    private int visit;

    public Matrix(int n) {
        this.graph = new int[n][n];
    }

    public int getGraph(int i, int j) {
        return graph[i][j];
    }

   public void setEdge(int i,int j){
        this.graph[i][j]= 1;
        this.graph[j][i]=1;
   }
    public void removeEdge(int i,int j){
        this.graph[i][j]= 0;
        this.graph[j][i]=0;
    }

    public int getVisit() {
        return visit;
    }

    public void setVisit(int visit) {
        this.visit = visit;
    }
}
