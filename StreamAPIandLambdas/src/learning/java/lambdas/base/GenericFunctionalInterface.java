package learning.java.lambdas.base;

@FunctionalInterface
public interface GenericFunctionalInterface<T>
{
    T calculate(T x, T y);
}

