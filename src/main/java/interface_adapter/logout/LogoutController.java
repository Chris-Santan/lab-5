package interface_adapter.logout;

import use_case.logout.LogoutInputBoundary;
import use_case.logout.LogoutInputData;

/**
 * The controller for the Logout Use Case.
 */
public class LogoutController {

    // Save the interactor in an instance variable
    private final LogoutInputBoundary logoutUseCaseInteractor;

    // Constructor to save the LogoutInputBoundary interactor
    public LogoutController(LogoutInputBoundary logoutUseCaseInteractor) {
        this.logoutUseCaseInteractor = logoutUseCaseInteractor;
    }

    /**
     * Executes the Logout Use Case.
     * @param username the username of the user logging out
     */
    public void execute(String username) {
        // Instantiate the LogoutInputData, which contains the username
        final LogoutInputData logoutInputData = new LogoutInputData(username);
        // Tell the Interactor to execute the use case
        logoutUseCaseInteractor.execute(logoutInputData);
    }
}
