import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GitHubTest extends  BaseTest{
    @Test
    public void smokeIssuesTab() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("maksimshingelskij@gmail.com", "bywdon-1qeswa-reKmor");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm().goToRepositoriesPage();
        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        repositoriesPage.goToFirstRepository();
        FirstRepositoryPage firstRepositoryPage = new FirstRepositoryPage(driver);
        firstRepositoryPage.goIssuesPage();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.goToNewIssuePage();
        NewIssuePage newIssuePage = new NewIssuePage(driver);
        newIssuePage.createNewIssue("Test title!!!!!!", "Test issue!!!!!!!!!!!!!!");
        CreatedIssuePage createdIssuePage = new CreatedIssuePage(driver);
        createdIssuePage.editIssue("Edit text for issue)))");
        createdIssuePage.closeIssue();
    }
}
