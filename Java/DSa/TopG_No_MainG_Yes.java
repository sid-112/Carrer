package com.DSa;

public class TopG_No_MainG_Yes {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addNode(new AdjencencyMatrix('A'));
        graph.addNode(new AdjencencyMatrix('B'));
        graph.addNode(new AdjencencyMatrix('C'));
        graph.addNode(new AdjencencyMatrix('D'));
        graph.addNode(new AdjencencyMatrix('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();




    }
}
