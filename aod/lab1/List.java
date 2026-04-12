package aod.lab1;

/**
 * Ett generiskt interface som beskriver en lista.
 *
 * Innehåller metoder för att lägga till, hämta, ändra
 * och ta bort element i en lista.
 *
 * @param <T> typen av element i listan
 */
public interface List<T> {

    /**
     * Lägger till ett element sist i listan.
     *
     * @param data elementet som ska läggas till
     */
    void add(T data);

    /**
     * Lägger till ett element på ett visst index.
     *
     * @param data elementet som ska läggas till
     * @param index positionen där elementet ska läggas till
     * @throws IndexOutOfBoundsException om index är ogiltigt
     */
    void add(T data, int index);

    /**
     * Hämtar elementet på ett visst index.
     *
     * @param index positionen för elementet
     * @return elementet på angivet index
     * @throws IndexOutOfBoundsException om index är ogiltigt
     */
    T get(int index);

    /**
     * Ändrar värdet på ett visst index.
     *
     * @param data det nya värdet
     * @param index positionen som ska ändras
     * @throws IndexOutOfBoundsException om index är ogiltigt
     */
    void set(T data, int index);

    /**
     * Tar bort sista elementet i listan.
     *
     * @throws IndexOutOfBoundsException om listan är tom
     */
    void remove();

    /**
     * Tar bort elementet på ett visst index.
     *
     * @param index positionen som ska tas bort
     * @throws IndexOutOfBoundsException om index är ogiltigt
     */
    void remove(int index);

    /**
     * Returnerar antalet element i listan.
     *
     * @return listans storlek
     */
    int size();

    /**
     * Tömmer listan.
     */
    void clear();
}