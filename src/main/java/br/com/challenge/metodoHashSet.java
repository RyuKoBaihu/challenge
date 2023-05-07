package br.com.challenge;

import java.util.Arrays;

public class metodoHashSet {

    private static <T> boolean checkForDuplicates(T... array)
    {
        // ordena o array na ordem natural ou inversa
        Arrays.sort(array);

        // prev armazena o elemento anterior para o elemento atual no array
        T prev = null;

        // faz para cada elemento do array
        for (T e: array)
        {
            // se dois elementos consecutivos forem iguais,
            // uma duplicata é encontrada
            if (e != null && e.equals(prev)) {
                return true;
            }

            // define o elemento atual como anterior
            prev = e;
        }

        // nenhuma duplicata foi encontrada
        return false;
    }
}
