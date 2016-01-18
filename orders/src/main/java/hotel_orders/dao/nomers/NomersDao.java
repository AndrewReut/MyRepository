package hotel_orders.dao.nomers;

import hotel_orders.dto.Nomer.Nomer;
import java.util.ArrayList;

/**
 * Интерфейс для работы с номерами
 *
 * Created by Andrew
 */
public interface NomersDao {

    /**
     * Получение данных по номеру по его ID
     */
    Nomer getNomer(int idNomer);

    /**
     * Получение списка номеров
     */
    ArrayList<Nomer> getNomersList();

}
