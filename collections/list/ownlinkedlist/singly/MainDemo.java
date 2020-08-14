package list.ownlinkedlist.singly;

public class MainDemo {
    public static void main(String[] args) {
        OwnLinkedList<String> linkedList = new OwnLinkedList<>();

        linkedList.insert("NodeOne");
        linkedList.insert("NodeTwo");
        linkedList.insert("NodeThree");
        linkedList.insert("NodeFour");

        linkedList.display();

        System.out.println("Found element: " + linkedList.find("NodeOne"));

        if (linkedList.isEmpty() == false) {
            linkedList.delete();
        }
        linkedList.display();

        System.out.println("Found element is: " + linkedList.find("1"));


    }
}
