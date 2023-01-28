class RubikCube {
// The faces of the cube are represented by six 2D arrays of integers
// The integers represent the color of the face
// 1 - green
// 2 - yellow
// 3 - orange
// 4 - red
// 5 - white
// 6 - blue

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
        GREEN, // front face - 1
        YELLOW, // back face - 2
        ORANGE, //  left face - 3
        RED, // right face - 4
        WHITE, // top face - 5
        BLUE // bottom face - 6
    }
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


    // scramble the cube
    public void scramble(){

    }

    // solve the cube
    public void solve(){

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

}