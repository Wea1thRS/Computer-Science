/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import ProvidedClasses.Tool;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Ethan
 */
public class Crow extends Bird {

    ArrayList<Tool> ToolKnown = new ArrayList<Tool>(0);

    public Crow() {
        name = "Jacob";
        birthYear = 2008;
        featherColor = Color.BLACK;
        ToolKnown.add(Tool.CHAINSAW);
    }

    public void addTool(Tool tool) {
        ToolKnown.add(tool);
    }

    public ArrayList<Tool> getToolsUsed() {
        ArrayList<Tool> tools = new ArrayList(0);
        for (int i = 0; i < ToolKnown.size(); i++) {
            tools.add(ToolKnown.get(i));
        }
        return tools;
    }

    @Override
    public String toString() {
        String str = super.toString() + ", ";
        for (Tool currentTool : ToolKnown) {
            str += currentTool;
        }
        return str;
    }
}
