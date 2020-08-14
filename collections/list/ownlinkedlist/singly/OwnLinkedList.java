package list.ownlinkedlist.singly;

class OwnLinkedList<T> {
    private Link<T> first; // Первый элемент в односвязном списке

    public OwnLinkedList() {
        // Первому элементу присваиваем null,
        // т.к. 1ый элемент должен существовать в связном списке
        first = null;
    }

    public boolean isEmpty() { // проверка списка на пустоту
        return first == null;
    }

    public void insert(T link) { // метод добавления элементов в список
        Link<T> l = new Link<>(link); // передаем параметр в конструктор Link()
        l.setNext(first); // связываем элементы
        this.first = l; // присваиваем first ссылку на новый элемент
    }

    public Link<T> delete() { // метод удаления элемента из списка
       Link<T> temp = first;
       first = first.getNext(); // смотрим существует ли ссылка на следующий элемент
       return temp; // возвращение удаляемого элемента
    }

    public void display() { // метод вывода элементов списка в консоль
        Link<T> current = first;
        while (current != null) { // проходим по списку, пока first не станет null
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public T find(T searchNode) {
        Link<T> findNode = new Link<>(searchNode);
        Link<T> current = first;
        while (current != null) {
            if (current.getValue().equals(findNode.getValue())) { // сравниваем элементы методом equals
                return findNode.getValue();
            }
            current = current.getNext();
        }
        return (T) "Search Node not exists";
    }
}
