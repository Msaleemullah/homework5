package staticvaribaleNmethod;

public class TestGarage {
    public static void main(String[] args) {
        SaleemGarage saleemGarage = new SaleemGarage();
        saleemGarage.setGarageSize(12);
        System.out.println(saleemGarage.getGarageSize());


        SaleemGarage adnanGarage = new SaleemGarage();
        adnanGarage.setGarageSize(14);
        System.out.println(adnanGarage.getGarageSize());

        System.out.println(saleemGarage.getGarageSize());
    }
}
