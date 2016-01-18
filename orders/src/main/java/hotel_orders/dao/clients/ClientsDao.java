package hotel_orders.dao.clients;

import hotel_orders.dto.Client.Client;
import java.util.ArrayList;

/**
 * Интерфейс для работы с клиентами
 *
 * Created by Andrew
 */
public interface ClientsDao {

    /**
     * Получение данных клиента по его ID
     */
    Client getClient(int idClient);

    /**
     * Получение списка клиентов
     */
    ArrayList<Client> getClientsList();

    /**
     * Добавление нового клиента
     */
    int addClient(Client client);

}
