package ejercicios.enciclopedia;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


public class OrganizadorEnciclopedia {

    public List<Integer> ordenar(Deque<Integer> repisa1, Deque<Integer> repisa2) {
        List<Integer> repisa3 = new ArrayList<>();

        while (!repisa1.isEmpty() || !repisa2.isEmpty()) {
            int tomo1 = !repisa1.isEmpty() ? repisa1.peek() : Integer.MAX_VALUE;
            int tomo2 = !repisa2.isEmpty() ? repisa2.peek() : Integer.MAX_VALUE;

            int tomoSeleccionado;
            if (tomo1 < tomo2) {
                tomoSeleccionado = repisa1.pop();
            } else {
                tomoSeleccionado = repisa2.pop();
            }

            insertarOrdenado(repisa3, tomoSeleccionado);
        }

        return repisa3;
    }

    private void insertarOrdenado(List<Integer> lista, int elemento) {
        int i = 0;
        while (i < lista.size() && lista.get(i) < elemento) {
            i++;
        }
        lista.add(i, elemento);
    }
}