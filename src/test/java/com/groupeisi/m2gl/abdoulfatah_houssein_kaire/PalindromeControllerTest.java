package com.groupeisi.m2gl.abdoulfatah_houssein_kaire;

import com.groupeisi.m2gl.abdoulfatah_houssein_kaire.controller.PalindromeController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeControllerTest {



    @Test
    public void TestCheckPalindromeWhereTrue(){
        PalindromeController palindromeController = new PalindromeController();
        Mots mots = new Mots("kayak");
        Boolean result = palindromeController.CheckPalindrome(mots);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void TestCheckPalindromeWhereFalse(){
        PalindromeController palindromeController = new PalindromeController();
        Mots mots = new Mots("mugena");
        Boolean result = palindromeController.CheckPalindrome(mots);
        Assertions.assertEquals(false, result);
    }
}
