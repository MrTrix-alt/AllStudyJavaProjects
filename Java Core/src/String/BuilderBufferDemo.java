package String;


// Изучение классов StringBuffer и StringBuilder
public class BuilderBufferDemo {
    public static void main(String[] args) {
        /*
            Отличие StringBuilder от StringBuffer:
            StringBuilder работает быстрее, но не является потокобезопасным.

            Класс String является immutable - Вы не можете модифицировать объект String,
            но можете заменить его созданием нового экземпляра.
            Создание нового экземпляра обходится дороговато.

            StringBuffer/StringBuilder
            Класс StringBuffer является mutable - использовать StringBuffer или StringBuilder следует тогда,
            когда хотим модифицировать содержимое.
         */

        // конструкторы по умолчанию автоматически резервирует память
        // под 16 символов
        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();

        System.out.println("Default capacity StringBuilder: " + builder.capacity());
        System.out.println("Default capacity StringBuffer: " + buffer.capacity());

        String c = "Java";
        String c1 = "Spring";

        System.out.println(builder.append(c));
        System.out.println(buffer.append(c1));

        System.out.println(c.concat(" " + buffer.toString()));
        System.out.println("Reversed builder: " + buffer.append(c).reverse());
    }
}
