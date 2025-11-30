
class Cursor {
    private int x;         
    private int y;          
    private String shape;   
    private int size;       
    private boolean visible; 

    public Cursor() {
        x = 0;
        y = 0;
        shape = "horizontal";
        size = 1;
        visible = true;
    }
    public Cursor(int x, int y, String shape, int size) {
        this.x = x;
        this.y = y;
        setShape(shape);
        setSize(size);
        visible = true;
    }

    public void setPosition(int x, int y) {
        if (x >= 0 && y >= 0) {
            this.x = x;
            this.y = y;
        } else {
            System.out.println("Coordinates must be positive integers.");
        }
    }

    public void setShape(String shape) {
        if (shape.equalsIgnoreCase("horizontal") || shape.equalsIgnoreCase("vertical")) {
            this.shape = shape.toLowerCase();
        } else {
            System.out.println("Shape must be 'horizontal' or 'vertical'.");
        }
    }

    public void setSize(int size) {
        if (size >= 1 && size <= 15) {
            this.size = size;
        } else {
            System.out.println("Size must be between 1 and 15.");
        }
    }

    public void hide() {
        visible = false;
    }
    public void show() {
        visible = true;
    }

    public void printStatus() {
        System.out.println("Cursor status:");
        System.out.println("Position: (" + x + ", " + y + ")");
        System.out.println("Shape: " + shape);
        System.out.println("Size: " + size);
        System.out.println("Visible: " + visible);
        System.out.println("--------------------------");
    }
}

public class Lab2Part1 {
    public static void main(String[] args) {
        Cursor cursor = new Cursor();
        cursor.printStatus();
        cursor.setPosition(10, 5);
        cursor.setShape("vertical");
        cursor.setSize(8);
        cursor.hide();
        cursor.printStatus();

        cursor.show();
        cursor.printStatus();
    }
}