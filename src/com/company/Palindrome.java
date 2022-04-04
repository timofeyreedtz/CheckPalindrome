package com.company;


class Palindrome {
    private String numberS;
    boolean isPalindrome;

    public Palindrome() {
        numberS = "00000";
    }

    public Palindrome(String numbers) {
        this.numberS = numbers;
    }

    public String getNumberS() {
        return numberS;
    }

    public void setNumberS(String n) {
        this.numberS = n;
    }

    public void check() {
        String[] number = numberS.split("");
        for (int i = 0; i < number.length; i++) {
            int element = Integer.parseInt(number[i]);
            isPalindrome = element == Integer.parseInt(number[number.length - 1 - i]);
        }
        if (!isPalindrome)
            System.out.println("Данное число не является палиндромом.");
        else System.out.println("Данное число является палиндромом.");
    }
}




