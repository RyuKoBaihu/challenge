package br.com.challenge;

public class ChallengeTest {
    private static String frase = "Hello: hello my fellow candidate";

    public static void main(String args[]) throws Exception {
        int espaco = frase.indexOf(" ");
        String primeiraPalavra = frase.substring(0, espaco).toLowerCase();
        String palavraEditada = primeiraPalavra.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(palavraEditada);

    }
}
