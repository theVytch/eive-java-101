package br.com.m11h.feedbox;

public class App {

    public static void main(String[] args) {

        Collaborator eduardo = new Collaborator("Melentovytch", "Eduardo");
        Collaborator igor = new Collaborator("Salviano", "Igor");

        eduardo.sendFeedback(igor, "você é ruim no valorant");


    }
}
