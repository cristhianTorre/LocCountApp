package edu.escuelaing.arsw.loccount;

/**
 * This program counts lines in source code files.
 *
 *Usage:
 *  To count physical lines:
 *          $ java Countlines phy [sourcefile]
 *  To count Lines of Code (LOC)
 *          $ java Countlines loc [sourcefile]
 *
 */
public class Countlines
{
    public static void main( String[] args )
    {
        String typeOfcount = args[0];
        String fileName = args[1];

        System.out.println("Type of count: " + typeOfcount);
        System.out.println("File name: " + fileName);
        if(typeOfcount.toLowerCase().equals("loc")){
            Loc l = new Loc(fileName);
            l.getCantidad();
        }else if(typeOfcount.toLowerCase().equals("phy")){
            Phy p = new Phy(fileName);
            p.getCount();
        }
    }
}
