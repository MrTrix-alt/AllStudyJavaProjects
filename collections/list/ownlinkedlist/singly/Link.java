package list.ownlinkedlist.singly;

class Link<T> {
    private T link; // Элемент списка
    private Link<T> next; // Ссылка на следующий элемент

    public Link(T link) {
        this.link = link;
    }

    public Link<T> getNext() { // возвращает следующий индекс
        return next;
    }

    public void setNext(Link<T> next) { // переводим с нынешнего индекса на следующий
        this.next = next;
    }

    public T getValue() { // получение элемента
        return link;
    }
}
