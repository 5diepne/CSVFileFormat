/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import java.nio.file.Paths;
import java.util.ArrayList;
import model.CSV;
import view.Menu;

/**
 *
 * @author huypd
 */
public class CSVProgram extends Menu<String> {
    static String[] options = {"Import CSV", "Format Address", "Format Name", "Export CSV", "Exit."};
    Algorithm ar;
    ArrayList<CSV> arrCSV;
    public CSVProgram() {
        super("======= Format CSV Program =======", options);
        ar = new Algorithm();
        arrCSV = new ArrayList<>();
    }
    @Override
    public void execute(int n) {
        switch(n) {
            case 1 -> ar.importFile(arrCSV);
            case 2 -> ar.formatAddress(arrCSV);
            case 3 -> ar.formatName(arrCSV);
            case 4 -> ar.exportFile(arrCSV);
            case 5 -> System.exit(0);
        }
    }
}
