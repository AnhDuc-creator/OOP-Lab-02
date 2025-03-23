public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // ==== Display the cart before removal ====
        System.out.println("Cart Items Before Removal:");

        anOrder.displayCart();

        System.out.printf("Total Cost: %.2f\n", anOrder.totalCost());

        // ==== Display the cart after removal (dvd1) ====
        anOrder.removeDigitalVideoDisc(dvd1);

        System.out.println("Cart Items After Removal:");

        anOrder.displayCart();

        System.out.printf("Total Cost: %.2f\n", anOrder.totalCost());
    }
}
