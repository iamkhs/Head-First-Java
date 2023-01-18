package chapter_18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class RyanAndMonicaTest {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        RyanAndMonicaJob ryan = new RyanAndMonicaJob("Ryan", account, 50);
        RyanAndMonicaJob monica = new RyanAndMonicaJob("Monica", account, 100);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(ryan);
        executor.execute(monica);
        executor.shutdown();

    }
}

class RyanAndMonicaJob implements Runnable{
    private final String name;
    private final BankAccount account;
    private final int amountToSpend;

    public RyanAndMonicaJob(String name, BankAccount account, int amountToSpend) {
        this.name = name;
        this.account = account;
        this.amountToSpend = amountToSpend;
    }

    @Override
    public void run() {
        goShopping (amountToSpend);
    }

    private void goShopping(int amount){
        System.out.println(name + " is about to spend");
        account.spend(name, amount);
        System.out.println(name + " finishes spending");
    }
}

class BankAccount {
    private final AtomicInteger balance = new AtomicInteger(100);
    public int getBalance() {
        return balance.get();
    }

    public void spend(String name, int amount){
        int initialBalance = getBalance();
        if (initialBalance >= amount){
            boolean success = balance.compareAndSet(initialBalance, initialBalance - amount);

            if (!success){
                System.out.println("Sorry " + name + ", you haven't spent the money.");
            }
        }
        else {
            System.out.println("Sorry, not enough for " + name);
        }
    }
}
