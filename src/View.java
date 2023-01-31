public class View implements IView{
    private IPresenter presenter;

    public View(){
        this.presenter = new Presenter(this);
    }

    @Override
    public void displayRotation() {

    }
}
