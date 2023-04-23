package com.neznatnov.pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextboxPage {
    SelenideElement UserNameInput = $ ("#userName");
    SelenideElement UserEmailInput = $ ("#userEmail");
    SelenideElement CurrentAddressInput = $ ("#currentAddress");
    SelenideElement PermanentAddressInput = $ ("#permanentAddress");


    public TextboxPage openPage(){
        open("https://demoqa.com/text-box");

        return this;
    }

    public TextboxPage setUserName(String value){
        UserNameInput.setValue(value);

        return this;
    }
    public TextboxPage setUserEmail(String value){
        UserEmailInput.setValue(value);

        return this;
    }
    public TextboxPage setCurrentAddress(String value){
        CurrentAddressInput.setValue(value);

        return this;
    }
    public TextboxPage setPermanentAddress(String value){
        PermanentAddressInput.setValue(value);

        return this;
    }
    public TextboxPage clickSubmit(){
        $("#submit").click();

        return this;
    }

    public TextboxPage verifyResult(String key, String value){
        $("#output").shouldHave(text(key + value));

        return this;
    }

}
