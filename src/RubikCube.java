class RubikCube {
// The faces of the cube are represented by six 2D arrays of integers
// The integers represent the color of the face

// 1 - GREEN
// 2 - BLUE
// 3 - RED
// 4 - ORANGE
// 5 - YELLOW
// 6 - WHITE
    public static final String RESET = "\033[0m"; // Text Reset // Regular Colors

    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String ORANGE = "\033[0;35m";  // ORANGE


    private int[][] frontFace;
    private int[][] backFace;
    private int[][] leftFace;
    private int[][] rightFace;
    private int[][] topFace;
    private int[][] bottomFace;
    private int[][][] faces;

    public RubikCube(){
        // Initialize the faces of the cube to their initial state
        frontFace = new int[][] {{1,1,1}, {1,1,1}, {1,1,1}};
        backFace = new int[][] {{2,2,2}, {2,2,2}, {2,2,2}};
        leftFace = new int[][] {{3,3,3}, {3,3,3}, {3,3,3}};
        rightFace = new int[][] {{4,4,4}, {4,4,4}, {4,4,4}};
        topFace = new int[][] {{5,5,5}, {5,5,5}, {5,5,5}};
        bottomFace = new int[][] {{6,6,6}, {6,6,6}, {6,6,6}};
        faces = new int[][][]{frontFace, backFace, leftFace, rightFace, topFace, bottomFace};

    }

    enum Colors {
        GREEN, // 1
        BLUE, // 2
        RED, // 3
        ORANGE, // 4
        YELLOW, // 5
        WHITE // 6
    }
    //region Rotations
    // rotate front face clockwise
    public void rotateFrontClockwise(){



    }

    // rotate front face counter-clockwise
    public void rotateFrontCounterClockwise(){

    }

    // rotate back face clockwise
    public void rotateBackClockwise(){

    }

    // rotate back face counter-clockwise
    public void rotateBackCounterClockwise(){

    }

    // rotate left face clockwise
    public void rotateLeftClockwise(){


    }

    // rotate left face counter-clockwise
    public void rotateLeftCounterClockwise(){



    }

    // rotate right face clockwise
    public void rotateRightClockwise(){

    }

    // rotate right face counter-clockwise
    public void rotateRightCounterClockwise(){

    }

    // rotate top face clockwise
    public void rotateTopClockwise(){

    }

    // rotate top face counter-clockwise
    public void rotateTopCounterClockwise(){

    }

    // rotate bottom face clockwise
    public void rotateBottomClockwise(){

    }

    // rotate bottom face counter-clockwise
    public void rotateBottomCounterClockwise(){

    }
    //endregion


    //region Getters
    public int[][] getFrontFace(){
        return frontFace;
    }

    public int[][] getBackFace(){
        return backFace;
    }

    public int[][] getLeftFace(){
        return leftFace;
    }

    public int[][] getRightFace(){
        return rightFace;
    }

    public int[][] getTopFace(){
        return topFace;
    }

    public int[][] getBottomFace(){
        return bottomFace;
    }
    //endregion


    // scramble the cube
    public void scrambleCube(){

    }

    // solve the cube
    public void solveCube(){

    }

    // check if the cube is solved
    public boolean isSolved(){
        for(int[][] face : faces){
            for (int i = 0; i < face.length; i++) {
                for (int j = 0; j < face[i].length; j++) {
                    if (face[i][j] != face[0][0]) {
                        return false;
                    }
                }
            }
        }
        return true;
    } // Tested and working

    //Prints cube with colors for each face , white is presented as default color and orange is presented as purple.
    public void printCube(){

        for(int[][] face : faces){
            for (int i = 0; i < face.length; i++) {
                for (int j = 0; j < face[i].length; j++) {
                    switch (face[i][j]){
                        case 1:
                            System.out.print(GREEN + face[i][j] + RESET + " ");
                            break;
                        case 2:
                            System.out.print(BLUE + face[i][j] + RESET + " ");
                            break;
                        case 3:
                            System.out.print(RED + face[i][j] + RESET + " ");
                            break;
                        case 4:
                            System.out.print(ORANGE + face[i][j] + RESET + " ");
                            break;
                        case 5:
                            System.out.print(YELLOW + face[i][j] + RESET + " ");
                            break;
                        case 6:
                            System.out.print(face[i][j] + RESET + " ");
                            break;
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    // Initialize the faces of the cube to their initial state
    public void initializeCube(){
        frontFace = new int[][] {{1,1,1}, {1,1,1}, {1,1,1}};
        backFace = new int[][] {{2,2,2}, {2,2,2}, {2,2,2}};
        leftFace = new int[][] {{3,3,3}, {3,3,3}, {3,3,3}};
        rightFace = new int[][] {{4,4,4}, {4,4,4}, {4,4,4}};
        topFace = new int[][] {{5,5,5}, {5,5,5}, {5,5,5}};
        bottomFace = new int[][] {{6,6,6}, {6,6,6}, {6,6,6}};
        faces = new int[][][]{frontFace, backFace, leftFace, rightFace, topFace, bottomFace};

    }
}