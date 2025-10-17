public class Main {
    public static void main(String[] args) {
        GamingLaptop GL = new GamingLaptop();
        BusinessLaptop BL = new BusinessLaptop();

        System.out.println("-------Overriding-------");
        GL.performAction();
        BL.performAction();

        System.out.println("\n-------Overloading-------");
        GL.displayDetails();
        BL.displayDetails("Lightweight, 16GB RAM, Optimized for business task");

        System.out.println("\n-------Polymorphism-------");
        LaptopUtils.useLaptop(GL);
        LaptopUtils.useLaptop(BL);
    }
}
