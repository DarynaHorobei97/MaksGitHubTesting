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
//it's a good idea to divide your test for several. 1 - a new issue creation, 2 - an issue edition
//Pls send a pull request for review because I cannot leave comments
//Add intermediate assertions into your methods
