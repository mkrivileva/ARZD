package com.google.ar.core.examples.java.helloar;

import android.graphics.PointF;

import java.util.ArrayList;
import java.util.List;

public final class TestData {
    private TestData() {}

    public static List<PointF> getNodesList() {
        List<PointF> nodes = new ArrayList<>();

        nodes.add(new PointF(850, 560));
        nodes.add(new PointF(660, 560));
        nodes.add(new PointF(660, 800));
        nodes.add(new PointF(745,850));
        nodes.add(new PointF(515, 560));
        nodes.add(new PointF(515, 810));
        nodes.add(new PointF(515, 200));
        nodes.add(new PointF(210, 560));
        nodes.add(new PointF(210, 800));
        nodes.add(new PointF(210, 300));

        return nodes;
    }

    public static List<PointF> getNodesContactList() {
        List<PointF> nodesContact = new ArrayList<PointF>();
        nodesContact.add(new PointF(0, 1));
        nodesContact.add(new PointF(1, 2));
        nodesContact.add(new PointF(2, 3));
        nodesContact.add(new PointF(1, 4));
        nodesContact.add(new PointF(4, 5));
        nodesContact.add(new PointF(4, 6));
        nodesContact.add(new PointF(4, 7));
        nodesContact.add(new PointF(7, 7));
        nodesContact.add(new PointF(7, 9));

        return nodesContact;
    }

    public static List<PointF> getMarks() {
        List<PointF> marks = new ArrayList<>();
        marks.add(new PointF(850, 560));
        marks.add(new PointF(745,850));
        marks.add(new PointF(515, 810));
        marks.add(new PointF(515, 200));
        marks.add(new PointF(210, 800));
        marks.add(new PointF(210, 300));

        return marks;
    }

    public static List<String> getMarksName() {
        List<String> marksName = new ArrayList<>();
        for (int i = 0; i < getMarks().size(); i++) {
            marksName.add("Shop " + (i + 1));
        }
        return marksName;
    }
}