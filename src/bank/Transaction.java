package bank;
public interface Transaction {
public abstract void process(int amt)throws WithDraw;
}
