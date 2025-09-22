import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class ManicureSalon {

    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> clientsQueue = new LinkedList<>(firstClients);

        while (!clientsQueue.isEmpty()) {
            String currentClient = clientsQueue.poll();
            System.out.println(currentClient + " сделал(а) новый маникюр.");

            if (Math.random() < 0.5) {
                String newClient = "a friend of " + currentClient;
                clientsQueue.add(newClient);
            }
        }
    }
}