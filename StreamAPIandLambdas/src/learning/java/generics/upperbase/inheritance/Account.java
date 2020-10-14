package learning.java.generics.upperbase.inheritance;

import learning.java.generics.base.Acc;

class Account<T>
{
    private T id;

    Account(T id)
    {
        this.id = id;
    }

    public T getId()
    {
        return id;
    }
}

class DepositAccount<T> extends Account<T>{

    DepositAccount(T id)
    {
        super(id);
    }

    public void printDeposit()
    {
        System.out.println("deposit");
    }
}

class ActualAccount extends Account<Integer>
{
    ActualAccount(Integer id)
    {
        super(id);
    }
}


class InheritInGen
{

    public static void main(String[] args)
    {

        DepositAccount<Integer> depositAccount1 = new DepositAccount<>(12);
        System.out.println(depositAccount1.getId());

        DepositAccount<String> depositAccount2 = new DepositAccount<>("13");
        System.out.println(depositAccount2.getId());

        Account<Float> acc1 = new DepositAccount<>(5.3F);
        System.out.println(acc1.getId());

        ActualAccount actualAccount = new ActualAccount(5);
        System.out.println(actualAccount.getId());

        DepositAccount<Integer> depAccount = new DepositAccount(10);
        Account<Integer> account = depAccount;
        System.out.println(account.getId());


    }
}
