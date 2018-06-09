package com.company;

public class Nude {
    private int visit;
    private Nude nexNude;
    private Nude edgeNude;
    private int tag;

    public Nude() {
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getTag() {
        return tag;
    }

    public Nude getEdgeNude() {
        return edgeNude;
    }

    public void setEdgeNude(Nude edgeNude) {
        this.edgeNude = edgeNude;
    }

    public Nude getNexNude() {
        return nexNude;
    }

    public void setNexNude(Nude nexNude) {
        this.nexNude = nexNude;
    }

    public int getVisit() {
        return visit;
    }

    public void setVisit(int visit) {
        this.visit = visit;
    }
}
