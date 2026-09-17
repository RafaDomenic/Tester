import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> habilidades = new HashMap<>();

        System.out.println("\n-------------------------");
        System.out.println("MAP & HashMap");
        System.out.println("-------------------------\n");

        // Key e Value
        habilidades.put("Patrick", "Manipulação");
        habilidades.put("Dexter", "Cientista");
        habilidades.put("House", "Raciocínio");
        habilidades.put("Hannibal", "Frieza");
        habilidades.put("Walter", "Estrategista");

        // Busca direta pela chave
        String p = habilidades.get("Patrick");
        System.out.println(p);

        // Iterar sobre todos
        for (Map.Entry<String, String> e : habilidades.entrySet()){
            System.out.println(e.getKey() + " > " + e.getValue());
        }

        System.out.println("\n-------------------------");
        System.out.println("HashMap com int");
        System.out.println("-------------------------\n");


        Map<String, String> estrelinhas = new HashMap<>();

        estrelinhas.put("Lucas V", String.valueOf(5));
        estrelinhas.put("Lucas P", String.valueOf(5));
        estrelinhas.put("Thayson", String.valueOf(4));
        estrelinhas.put("Rafael", String.valueOf(5));
        estrelinhas.put("Larissa", String.valueOf(5));

        for (Map.Entry<String, String> e : estrelinhas.entrySet()){
            System.out.println(e.getKey() + " > " + e.getValue());
        }

        System.out.println("\n-------------------------");
        System.out.println("HashSet");
        System.out.println("-------------------------\n");

        Set<String> roster = new HashSet<>();

        roster.add("Patrick");
        roster.add("Dexter");
        roster.add("House");
        roster.add("Hannibal");
        roster.add("Walter");

        // Tentativa duplicada
        roster.add("Dexter");

        System.out.println(roster.size());
        System.out.println(roster.contains("Dexter"));

        roster.remove("Dexter");
        System.out.println(roster.size());

        System.out.println("\n-------------------------");
        System.out.println("Queue");
        System.out.println("-------------------------\n");

        PriorityQueue<Integer> fila = new PriorityQueue<>();

        // Goomba = 10, Piranha = 15, Koopa = 20
        fila.add(10);
        fila.add(20);
        fila.add(15);

        // Peek: quem aparece primeiro? (sem remover)
        System.out.println(fila.peek()); // 10

        // Poll: Goomba entra em cena e sai da fila
        System.out.println(fila.poll()); // 10
        System.out.println(fila.peek()); // 15
        System.out.println(fila.poll()); // 15
        System.out.println(fila.peek()); // 20




    }
}
