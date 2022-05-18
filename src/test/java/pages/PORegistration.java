package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PORegistration {

    CalendarComponent calendarComponent = new CalendarComponent();

    //locators
    private SelenideElement nameInput = $("#firstName");
    private SelenideElement lastNameInput = $("#lastName");
    private SelenideElement emailInput = $("#userEmail");
    private SelenideElement phoneInput = $("#userNumber");
    private SelenideElement addressInput = $("#currentAddress");
    private SelenideElement dataPicker = $("#dateOfBirthInput");
    private SelenideElement blockStateCity = $("#stateCity-wrapper");
    private SelenideElement stateSelect = $("#state");
    private SelenideElement citySelect = $("#city");
    private SelenideElement buttonSubmit = $("#submit");
    private SelenideElement femaleGender = $("#genterWrapper").$(byText("Female"));
    private SelenideElement subjectsInput = $("#subjectsInput");
    private SelenideElement checkboxHobbyMusic = $("#hobbiesWrapper").$(byText("Music"));
    private SelenideElement addFileButton = $("#uploadPicture");
    public static SelenideElement userCardTitle = $("#example-modal-sizes-title-lg");
    public static SelenideElement userCard = $(".table-responsive");

    // const
    private String name = "Hope";
    private String lastName = "Hope";
    private String email = "test@test.test";
    private String phone = "89999999999";
    private String address = "Some_Address";
    private String pathToImage = "img/blog-toughness.jpg";

    //actions

    public PORegistration setName(){
        nameInput.setValue(name);
        return this;
    }

    public PORegistration setLastName(){
        lastNameInput.setValue(lastName);
        return this;
    }

    public PORegistration setEmail(){
        emailInput.setValue(email);
        return this;
    }

    public PORegistration setAddress(){
        addressInput.setValue(address);
        return this;
    }

    public PORegistration setPhone(){
        phoneInput.setValue(phone);
        return this;
    }

    public PORegistration clickButton(){
        buttonSubmit.click();
        return this;
    }

    public PORegistration clickGenderRadiobutton(){
        femaleGender.click();
        return this;
    }

    public PORegistration clickCheckboxHobby(){
        checkboxHobbyMusic.click();
        return this;
    }

    public PORegistration setSubject(String subject){
        subjectsInput.setValue(subject).pressEnter();
        return this;
    }

    public PORegistration addFile(){
        addFileButton.uploadFromClasspath(pathToImage);
        return this;
    }

    public PORegistration setBirthDate(String day, String month, String year) {
        dataPicker.click();
        calendarComponent.setDatePicker(day, month, year);
        return this;
    }

    public PORegistration setLocation(String stateValue, String cityValue) {
        stateSelect.click();
        blockStateCity.$(byText(stateValue)).click();
        citySelect.click();
        blockStateCity .$(byText(cityValue)).click();
        return this;
    }


}
