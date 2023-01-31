public class Presenter implements IPresenter{
    private IView view;
    private RubikCube cube;

    public Presenter(IView view){
        this.view = view;
        this.cube = new RubikCube();
    }

    @Override
    public void solveCube() {

    }

    @Override
    public void initializeCube() {
        this.cube.initializeCube();
        //TODO Add code to display the initialized cube on the view
    }

    @Override
    public void scrambleCube() {
        this.cube.scrambleCube();
        //TODO Add code to display the scramble on the view
    }
}
