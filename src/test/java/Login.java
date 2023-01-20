import Actions.LoginActions;
import Actions.ProductsActions;
import org.testng.annotations.Test;

public class Login extends HooksMain{

    LoginActions loginActions;
    ProductsActions productsActions;
    @Test
    public void test() throws InterruptedException{
        loginActions = new LoginActions();
        productsActions = new ProductsActions();

        loginActions.sendUserName();
        loginActions.sendPassword();
        loginActions.clickLogin();
        productsActions.assertSwagLogo();
    }

}
