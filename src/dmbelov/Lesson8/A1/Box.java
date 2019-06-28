package dmbelov.Lesson8.A1;


/*1. Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
        Реализовать метод, который возвращает любой элемент массива по индексу.*/


class Box<T> {

    private T [] mas;

    T getMas(int index) {
        return mas[index];
    }

    void setMas(T[] mas) {
        this.mas = mas;
    }
}

