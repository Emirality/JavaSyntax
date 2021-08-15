package CloneEx;

public class TestClone {
    public static void main(String[] args) {
        Human human1 = new Human(1,2,new Money(1000));
        Human human2 = human1.clone();

        System.out.println("human1 money ="+human1.getMoney().getSalary());
        System.out.println("human2 money ="+human2.getMoney().getSalary());

        human1.getMoney().setSalary(1500);

        System.out.println("human1 money ="+human1.getMoney().getSalary());
        System.out.println("human2 money ="+human2.getMoney().getSalary());
    }
}

class Money{
    private int salary;
    Money(int salary){
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Human implements Cloneable{
    private int a;
    private int b;
    private Money money;

    Human(int a, int b, Money money){
        this.a = a;
        this.b = b;
        this.money = money;
    }

    @Override
    public Human clone() {
        try {
            Human clone = (Human) super.clone();
            clone.setMoney(new Money(this.money.getSalary()));
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }
}