package dmbelov.Lesson8.A2;

/*2. Написать ф-ю, которая сохранит содержимое каталога в список и выведет первые 5 элементов на экран.*/

import java.util.ArrayList;

class Box<T> {
    private ArrayList<T> arrayList;

    void setArrayList(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    void outPrintFiveElements(ArrayList<T> arrayList){
        this.arrayList = arrayList;
        int size = this.arrayList.size();
        for(int i=0; i<size && i<5; i++){
            System.out.print(this.arrayList.get(i)+" ");
        }
    }
}
