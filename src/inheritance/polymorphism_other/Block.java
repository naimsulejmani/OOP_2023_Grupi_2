package inheritance.polymorphism_other;

public final class Block {
    private final int BLOCK_ID;
    private static final int STATIC_BLOCK_ID;
    private int weight;
    private int width;
    private int height;

    //static initializer block
    static {
        STATIC_BLOCK_ID = 1;
    }

    //instance initializer block
    {
        BLOCK_ID = 2;
        weight = 2;
        System.out.println("Instance Initializer block - 1" + weight);
    }


    public Block(int weight, int width, int height) {
        this.weight = weight;
        this.width = width;
        this.height = height;
        System.out.println("Block Constructor is called!");
    }

    {
        weight++;
        System.out.println("Instance Initializer block - 2" + weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weight) {
//        ++weight;
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(final int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }
}
