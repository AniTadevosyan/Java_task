public class WarehouseManagement {
    public static void main(String[] args) {
        MaterialType ironType = new MaterialType("Iron", "Strong metal", "iron_icon", 1000);
        MaterialType copperType = new MaterialType("Copper", "Conductive metal", "copper_icon", 800);

        Material ironMaterial = new Material(ironType, 500);
        Material copperMaterial = new Material(copperType, 300);

        Warehouse warehouse1 = new Warehouse(1000);
        Warehouse warehouse2 = new Warehouse(800);

        warehouse1.addMaterial(ironType, 200);
        warehouse1.addMaterial(copperType, 400);
        warehouse2.addMaterial(ironType, 100);
        warehouse2.addMaterial(copperType, 200);


        System.out.println("Warehouse 1:");
        warehouse1.printWarehouseData();
        System.out.println("Warehouse 2:");
        warehouse2.printWarehouseData();

        warehouse1.moveMaterial(ironType, 150, warehouse2);
        warehouse2.moveMaterial(copperType, 300, warehouse1);


        System.out.println("Warehouse 1 after moving materials:");
        warehouse1.printWarehouseData();
        System.out.println("Warehouse 2 after moving materials:");
        warehouse2.printWarehouseData();
    }
}
