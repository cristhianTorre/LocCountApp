package edu.escuelaing.arsw.loccount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Loc {

    private long cantidad = Long.valueOf(0);

    public Loc(String fileName){
        Path path = Paths.get(fileName);
        try (Stream<String> stream = Files.lines(path)) {
            for (String str: stream.collect(Collectors.toList())){
                System.out.println(str);//sout
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public long getCantidad(){
        return cantidad;
    }
}
