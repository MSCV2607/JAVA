import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Pila vacia " + pila);
        //isEmpty() para saber si esta vacia
        System.out.println("Esta vacia? " + pila.isEmpty());

        //Agregar elementos
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        pila.push(7);
        pila.push(8);

        for(Integer pilita : pila) {
            System.out.println(pilita);
        }

        System.out.println("Pila vacia " + pila);
        //isEmpty() para saber si esta vacia
        System.out.println("Esta vacia? " + pila.isEmpty());

        pila.pop(); //Elimina el ultimo registro que ingreso a la pila

        //Para buscar un elemento en particular de la lista .search(elemento) y si no encuentra lanza -1 y si encuentra pone un numero positivo
        System.out.println("Esta el 3? " + pila.search(3));

        //Para ver el ultimo elemento agregado
        System.out.println("El ultimo agregado es: " + pila.peek());
    }
}