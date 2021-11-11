package models.interfaces;

public interface ITaxes {
    public static final double TAX = 0.15;

    double applyTax(double loan);
}
