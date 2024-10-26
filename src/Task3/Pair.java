package Task3;

/*
Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
а также переопределение метода toString(), возвращающее строковое представление пары. Работу сдать в виде ссылки на гит репозиторий.
 */

public class Pair<T, V> {
    T t;
    V v;

    public Pair(T t, V v){
        this.t = t;
        this.v = v;
    }

    public T getFirst(){
        return t;
    }

    public V getSecond(){
        return v;
    }

    @Override
    public String toString() {
        return t.toString() + "\n" + v.toString();
    }
}
