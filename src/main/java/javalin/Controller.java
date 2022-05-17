package javalin;

import io.javalin.http.Context;

public class Controller {
    public static String[] modeli = {"Robert", "Milos", "Nenad"};

    public static void getModels(Context context) {
        context.json(modeli);
    }
}
