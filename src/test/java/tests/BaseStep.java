package tests;

import pages.*;

/**
 * Created by thivyalakshimi on 25/06/17.
 */
public class BaseStep extends BasePage {
    HomePage homePage = new HomePage(driver);
    ClientsPage clientsPage = new ClientsPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    EditClientDetailsPage editClientDetailsPage = new EditClientDetailsPage(driver);

}
