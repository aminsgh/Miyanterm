package com.company;

public class CycleTree {
    private int[][] cycle;
    private int[][] graph;
    private int[] degree;
    private int n;


    public CycleTree(int[][] graph, int n) {
        this.graph = new int[n][n];
        this.cycle = new int[n][n];
        this.degree = new int[n];
        this.n = n;
        this.graph = graph;
        mult(n);
        finalC(n);
        setDegree();
    }

    public void mult(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    this.cycle[i][j] += this.graph[i][k] * this.graph[k][j];

                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    this.cycle[i][j] += this.cycle[i][k] * this.graph[k][j];

                }
            }
        }
    }

    public int min(int i, int j) {
        int min = i;
        if (j < min) {
            min = j;
        }
        return min;

    }

    public void finalC(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cycle[i][j] = (cycle[i][j] + 1) / min(degree[i], degree[j])-1;

            }

        }
    }

    public void setDegree() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                degree[i] += graph[i][j];
            }
        }
    }
}


