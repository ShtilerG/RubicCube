public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        RubikCube cube = new RubikCube();
        cube.printCube();
        System.out.println(cube.isSolved());
    }
}