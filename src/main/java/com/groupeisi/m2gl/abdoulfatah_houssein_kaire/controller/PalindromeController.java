package com.groupeisi.m2gl.abdoulfatah_houssein_kaire.controller;

import com.groupeisi.m2gl.abdoulfatah_houssein_kaire.Mots;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class PalindromeController {

    private Boolean isPalindrome = null;

    @PostMapping("checkpalindrome")
    public Boolean CheckPalindrome(@RequestBody Mots mots){
        System.out.println(mots.getMotAverifier());

        String str = mots.getMotAverifier(), reverseStr = "";
        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
            isPalindrome = true;
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
            isPalindrome = false;
        }

        return isPalindrome;
    }
}
