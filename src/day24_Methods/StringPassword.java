package day24_Methods;

import sun.security.util.Password;

public class StringPassword {
   /* 1. Write a return method that can verify if a password is valid or not.

    requirements:

            1. Password MUST be at least have 6 characters and should not contain space

2. PassWord should at least contain one upper case letter

3. PassWord should at least contain one lowercase letter

4. Password should at least contain one special characters

5. Password should at least contain a digit



if all requirements above are met, the method returns true, otherwise returns  false
*/

    public static boolean PassWordValidation(String password) {

        String lowercase="(.*[a-z].*)";

        String uppercase="(.*[A-Z].*)";

        String numbers="(.*[0-9].*)";

        String specialChars="(.*[ -/, :-@].*)";



        boolean  HasLower = password.matches(lowercase),

                HasUppere = password.matches(uppercase),

                HasDigits = password.matches(numbers),

                HasSpecial = password.matches(specialChars),

                Valid = false;



        if(password.length() >= 6 && !password.contains(" "))

            if( HasLower && HasUppere && HasDigits && HasSpecial)

                Valid = true;

        return Valid;

    }

    public static void main(String[] args) {
        System.out.println(PassWordValidation("Papylya2")); // false
    }
}
