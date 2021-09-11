package day51_Lambda;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class lambdaFile07 {
    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("C:\\Users\\LENOVO\\IdeaProjects\\PrpjeSummer2021\\src\\day51_Lambda\\lambdaFile")).forEach(t-> System.out.println(t));
        } catch (IOException e) {
            System.out.println(e);
        }
// tum harfler buyuk olsun
        try {
            Files.lines(Paths.get("C:\\Users\\LENOVO\\IdeaProjects\\PrpjeSummer2021\\src\\day51_Lambda\\lambdaFile")).map(String::toUpperCase).forEach(t-> System.out.println(t));
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            Files.lines(Paths.get("C:\\Users\\LENOVO\\IdeaProjects\\PrpjeSummer2021\\src\\day51_Lambda\\lambdaFile")).map(t->t.split(" ")).flatMap(Arrays::stream).map(t->t.replaceAll("\\W","")).distinct().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }
        // metinde "e" içeren tüm kelimeleri yazdırın. (sayısınıda yazdırabilirsin)
        try {
            Files.lines(Paths.get("C:\\Users\\LENOVO\\IdeaProjects\\PrpjeSummer2021\\src\\day51_Lambda\\lambdaFile")).map(t->t.split(" ")).flatMap(Arrays::stream).filter(t->t.contains("e")).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);;
        }
    }
}
