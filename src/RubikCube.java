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

    enum Colors{ // TODO use all arrays of enums instead of ints for code readability
        BLANK,GREEN,BLUE,RED,ORANGE,YELLOW,WHITE
    }

    public RubikCube(){
        // Initialize the faces of the cube to their initial state
        frontFace = new int[][] {{1,1,1},
                                {1,1,1},
                                {1,1,1}};

        backFace = new int[][] {{2,2,2},
                                {2,2,2},
                                {2,2,2}};

        leftFace = new int[][] {{3,3,3},
                                {3,3,3},
                                {3,3,3}};

        rightFace = new int[][] {{4,4,4},
                                {4,4,4},
                                {4,4,4}};

        topFace = new int[][] {{5,5,5},
                               {5,5,5},
                               {5,5,5}};

        bottomFace = new int[][] {{6,6,6}, // bottomFace[0][0],[0][1],[0][2]
                                  {6,6,6}, // bottomFace[1][0],[1][1],[1][2]
                                  {6,6,6}};// bottomFace[2][0],[2][1],[2][2]

        faces = new int[][][]{frontFace, backFace, leftFace, rightFace, topFace, bottomFace};

    }


    //region Rotations

    // rotate front face clockwise aka F
    public void rotateFrontClockwise(){
        int[][] temp = new int[3][3];
        temp[0][0] = frontFace[0][0];
        temp[0][1] = frontFace[0][1];
        temp[0][2] = frontFace[0][2];
        temp[1][0] = frontFace[1][0];
        temp[1][1] = frontFace[1][1];
        temp[1][2] = frontFace[1][2];
        temp[2][0] = frontFace[2][0];
        temp[2][1] = frontFace[2][1];
        temp[2][2] = frontFace[2][2];

        frontFace[0][0] = temp[2][0];
        frontFace[0][1] = temp[1][0];
        frontFace[0][2] = temp[0][0];
        frontFace[1][0] = temp[2][1];
        frontFace[1][1] = temp[1][1];
        frontFace[1][2] = temp[0][1];
        frontFace[2][0] = temp[2][2];
        frontFace[2][1] = temp[1][2];
        frontFace[2][2] = temp[0][2];

        int[] temp2 = new int[3];
        temp2[0] = topFace[2][0];
        temp2[1] = topFace[2][1];
        temp2[2] = topFace[2][2];

        topFace[2][0] = leftFace[2][0];
        topFace[2][1] = leftFace[2][1];
        topFace[2][2] = leftFace[2][2];

        leftFace[0][2] = bottomFace[0][2];
        leftFace[1][2] = bottomFace[0][1];
        leftFace[2][2] = bottomFace[0][0];

        bottomFace[0][2] = rightFace[2][0];
        bottomFace[0][1] = rightFace[2][1];
        bottomFace[0][0] = rightFace[2][2];

        rightFace[0][0] = temp2[0];
        rightFace[1][0] = temp2[1];
        rightFace[2][0] = temp2[2];
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