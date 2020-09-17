package ru.learning.basepatterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Does developer know Java Core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer know Java EE: " + isJavaEEDeveloper.interpret("Java Spring"));


    }

    private static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore =  new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);

    }

    private static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
