package com.epam.maven_task;

import java.util.*;

public class Sweet{
    String name;
    int cost;
    int weight;
    int sweetfactor;
    Sweet(String n,int c,int w,int sf){
        name = n;
        cost = c;
        weight = w;
        sweetfactor = sf;
    }
}

class Sortedoncost implements Comparator <Sweet> {
    public int compare(Sweet s1,Sweet s2){
        return s1.cost - s2.cost;
    }
}

class Sortedonweight implements Comparator <Sweet> {
    public int compare(Sweet s1,Sweet s2){
        return s1.weight - s2.weight;
    }
}

class Sortedonfactor implements Comparator <Sweet> {
    public int compare(Sweet s1,Sweet s2){
        return s1.sweetfactor - s2.sweetfactor;
    }
}

