package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.PORegistration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static pages.PORegistration.userCard;
import static pages.PORegistration.userCardTitle;

public class FirstJUnitTest {

    PORegistration poRegistration = new PORegistration();

    @BeforeEach
    void openBrowser() {
        Configuration.browserSize = "1920x1080";
        open("https://demoqa.com/automation-practice-form");
    }

    @Test
    void simpleTest() {
        poRegistration
                .setName()
                .setLastName()
                .setEmail()
                .setPhone()
                .setAddress()
                .clickGenderRadiobutton()
                .setBirthDate("30", "April", "1997")
                .setSubject("History")
                .clickCheckboxHobby()
                .addFile()
                .setLocation("Uttar Pradesh", "Agra")
                .clickButton();
        userCardTitle.shouldBe(text("Thanks for submitting the form"));
        userCard.shouldHave(
                text("Hope Hope"),
                text("test@test.test"),
                text("Female"),
                text("Mobile 8999999999"),
                text("30 April,1997"),
                text("History"),
                text("Music"),
                text("blog-toughness.jpg"),
                text("Some_address"),
                text("Uttar Pradesh"),
                text("Agra"));
    }
}