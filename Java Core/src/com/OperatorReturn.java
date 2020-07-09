package com;

public class OperatorReturn {
    public static void main(String[] args) {
        // Оператор return служит для выполнения
        // явного выхода из метода, т.е. снова передает
        // управление объекту, который вызвал данный метод.

        boolean t = true;
        System.out.println("До возврата");
        if (t)  /*наличие этого оператор обязательно в этой примере,
                т.к. без него компилятор Java сигнализировал бы об ошибке
                типа "unreachable code/statement(в моей версии IDE)" (недостижимый код),
                поскольку он выяснил бы, что последний вызов метода println()
                вообще не будет выполняться. Для того воспользовались
                оператором if, чтобы ввести комплиятор в заблуждение */
            return; // возврат в вызывающий код (метод main)
        System.out.println("Этот оператор выполняться не будет!");


    }
}
