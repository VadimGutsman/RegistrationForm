import controller.Controller;
import model.Notebook;
import view.View;

public class RegistrationForm {
    public static void main(String[] args) {
        View view = new View();
        Notebook notebook = new Notebook();
        Controller controller = new Controller(view, notebook);

        controller.processUser();

    }
}
