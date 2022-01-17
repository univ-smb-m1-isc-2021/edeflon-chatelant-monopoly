import java.security.SecureRandom;

public class LesDes {
    private int val1;
    private int val2;

    // Constructeur
    public LesDes() {
        lancerDes();
    }

    // Getters - Setters
    public int getVal1() {
        return this.val1;
    }

    public int getVal2() {
        return this.val2;
    }

    public void setVal1(int value) {
        this.val1 = value;
    }

    public void setVal2(int value) {
        this.val2 = value;
    }

    // Methodes
    public void lancerDes() {
        SecureRandom r = new SecureRandom();
        setVal1( (1 + (r.nextInt(6))));
        setVal2( (1 + (r.nextInt(6))));
        System.out.println("Des 1 : " + val1 + "     Des 2 : " + val2);
    }

    public int getTotalDes() {
        return getVal1() + getVal2();
    }

    public boolean estDouble(){
        return getVal1() == getVal2();
    }
}
