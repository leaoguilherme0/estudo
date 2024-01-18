package br.com.alura.screenmatch.exercicios.aula5_final;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Utils {
    public static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static Gson getGson() {
        return gson;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static String lerLinha(String texto) {
        System.out.println(texto);
        return scanner.nextLine();
    }
    public static void fecharScanner() {
        scanner.close();
    }

}