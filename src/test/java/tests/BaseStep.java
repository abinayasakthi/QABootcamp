package tests;

import pages.*;

/**
 * Created by thivyalakshimi on 25/06/17.
 */
public class BaseStep extends BasePage {
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    ClientsPage clientsPage = new ClientsPage(driver);
    EditClientDetailsPage editClientDetailsPage = new EditClientDetailsPage(driver);

}
