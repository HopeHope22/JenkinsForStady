package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public static SelenideElement yearDP = $(".react-datepicker__year-select");
    public static SelenideElement monthDP = $(".react-datepicker__month-select");
    
    public CalendarComponent setDatePicker(String day, String month, String year) {
        monthDP.selectOption(month);
        yearDP.selectOption(year);
        $("[aria-label$='" + month + " " + day + "th, " + year + "']").click();
        return this;
    }
}
