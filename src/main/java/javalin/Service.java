package javalin;

import io.javalin.Javalin;

public class Service {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);

        app.get("/imena", Controller::getModels);
    }
}
