package hotel_orders.dao.requests;

import hotel_orders.dto.Request.Request;

import java.util.ArrayList;

/**
 * Интерфейс для работы с заявками
 *
 * Created by Andrew
 */
public interface RequestsDao {

    /**
     * Получение данных по заявке по ее ID
     */
    Request getRequest(int idRequest);

    /**
     * Получение списка заявок
     */
    ArrayList<Request> getRequestsList();

    /**
     * Добавление новой заявки
     */
    int addRequest(Request request);

    /**
     * Удаление заявки
     */
    void addRequest(int idRequest);

    /**
     * Редактирование заявки
     */
    void updRequest(int idRequest);

}
