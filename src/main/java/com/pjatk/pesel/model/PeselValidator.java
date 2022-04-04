package com.pjatk.pesel.model;
public class PeselValidator {

    public static boolean isValid(String pesel) {

        /* Algorytm sprawdzający czy nr pesel jest prawidłowym numerem PESEL
        (sprawdzić poprzez wyrażenie regularne oraz sumę kontrolną) */
        if (pesel.matches("^\\d{11}$")) {
            char[] PeselCh = pesel.toCharArray();

            int[] PeselInt = new int[PeselCh.length];

            for (int i = 0; i < PeselCh.length; i++) {
                PeselInt[i] = Integer.parseInt(PeselCh[i] + "");
            }

            int[] Numbers = new int[10];
            Numbers[0] = 1;
            Numbers[1] = 3;
            Numbers[2] = 7;
            Numbers[3] = 9;
            Numbers[4] = 1;
            Numbers[5] = 3;
            Numbers[6] = 7;
            Numbers[7] = 9;
            Numbers[8] = 1;
            Numbers[9] = 3;

            int Sum = 0;

            for (int i = 0; i < Numbers.length; i++) {

                Sum = Sum + ((PeselInt[i] * Numbers[i]) % 10);
            }

            int SumModulo = Sum % 10;

            int result = 10 - SumModulo;

            return result == PeselInt[10];
        }
        return false;
    }
}