/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exameninfra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Benjamin Calvo
 */
class ParserProyecto {
    
    File document;

    public ParserProyecto(File f) {
        this.document = f;
    }

    public ArrayList<int[]> generar() {
        ArrayList<int[]> l = new ArrayList();
        try {
            BufferedReader in = new BufferedReader(new FileReader(this.document));
            while (in.ready()) {
                String tmp = in.readLine();
                String[] tmpl = tmp.split(",");
                if (tmpl.length != 2) {
                    return l;
                } else {
                    int[] tmpln = {Integer.parseInt(tmpl[0]), Integer.parseInt(tmpl[1])};
                    l.add(tmpln);
                }
            }
            return l;
        } catch (Exception e) {
            return l;
        }
    }
}
