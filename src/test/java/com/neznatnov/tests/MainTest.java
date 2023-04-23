package com.neznatnov.tests;

import com.neznatnov.pages.TextboxPage;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void textBox(){
        TextboxPage textBoxPage = new TextboxPage();

        textBoxPage.openPage()
                .setUserName("Veronika Iatckaia")
                .setUserEmail("neznatnov@gmail.com")
                .setCurrentAddress("Street 1")
                .setPermanentAddress("Street 2")
                .clickSubmit();
        textBoxPage.verifyResult("Name:","Veronika Iatckaia")
                .verifyResult("Email:","neznatnov@gmail.com")
                .verifyResult("Current Address :","Street 1")
                .verifyResult("Permananet Address :","Street 2");
    }

}