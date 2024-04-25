public class Warehouse {
    private final Material[] materials;
    private final int capacity;

    public Warehouse(int capacity) {
        this.capacity = capacity;
        this.materials = new Material[capacity];
    }

    public void addMaterial(MaterialType materialType, int quantity) {
        int index = getIndex(materialType);
        if (index != -1) {
            Material material = materials[index];
            material.setQuantity(material.getQuantity() + quantity);
        } else {
            System.out.println("Material not found in the warehouse: " + materialType.getName());
        }
    }

    public void removeMaterial(MaterialType materialType, int quantity) {
        int index = getIndex(materialType);
        if (index != -1) {
            Material material = materials[index];
            if (material.getQuantity() >= quantity) {
                material.setQuantity(material.getQuantity() - quantity);
            } else {
                System.out.println("Not enough material in the warehouse for " + materialType.getName());
            }
        } else {
            System.out.println("Material not found in the warehouse: " + materialType.getName());
        }
    }

    public void moveMaterial(MaterialType materialType, int quantity, Warehouse destination) {
        int index = getIndex(materialType);
        if (index != -1) {
            Material material = materials[index];
            if (material.getQuantity() >= quantity) {
                removeMaterial(materialType, quantity);
                destination.addMaterial(materialType, quantity);
            } else {
                System.out.println("Not enough material to move from the warehouse: " + materialType.getName());
            }
        } else {
            System.out.println("Material not found in the warehouse: " + materialType.getName());
        }
    }

    public int getMaterialQuantity(MaterialType materialType) {
        int index = getIndex(materialType);
        return index != -1 ? materials[index].getQuantity() : 0;
    }

    private int getIndex(MaterialType materialType) {
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null && materials[i].getMaterialType().equals(materialType)) {
                return i;
            }
        }
        return -1;
    }

    public void printWarehouseData() {
        System.out.println("Warehouse Capacity: " + capacity);
        System.out.println("Materials:");
        for (Material material : materials) {
            if (material != null) {
                System.out.println(material.getMaterialType().getName() + ": " + material.getQuantity());
            }
        }
    }
}
