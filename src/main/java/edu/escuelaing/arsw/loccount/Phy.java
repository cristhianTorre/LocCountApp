package edu.escuelaing.arsw.loccount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Phy {

    private Long count = Long.valueOf(0);

    public Phy(String fileName){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            String texto = br.readLine();
            while(texto != null)
            {
                System.out.println(texto);
                texto = br.readLine();
                count +=1;
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (br != null)
                    br.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }

    public Long getCount(){
        return count;
    }

}
