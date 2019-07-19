package controller;

public interface Regex {
    String NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String SURNAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String PATRONYMIC_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
//    String COMMENT_UKR;
    String CITY_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String STREET_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";

    String NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String SURNAME_LAT = "^[A-Z][a-z]{1,20}$";
    String PATRONYMIC_LAT = "^[A-Z][a-z]{1,20}$";
    String NICKNAME = "^[\\S\\w-\\\\.&&[^=\\\\^(){}&$:;*?!+@#%~<>,|/\\\\₴]]{6,20}$";
    String COMMENT = "\\b[\\w\\s-\\\\.(){}&$:=;*?!+@#%~\\\\^<>,|/\\\\₴]+\\b";
    String HOME_PHONE_NUMBER = "^[(]\\d{3}[)]\\d{3}[-]\\d{2}[-]\\d{2}$";
    String FIRST_MOBILE_NUMBER = "^[+]\\d{12}$";
    String SECOND_MOBILE_NUMBER = "^[+]\\d{12}$";
    String EMAIL = "^[-\\w\\S\\\\.&&[^=\\\\^(){}&$:;*?!+@#%~<>,|/\\\\₴]]+@[a-z]+\\.[a-z]+$";
    String SKYPE = "[a-z][a-zA-Z0-9[-_%$@+=*]]{4,}";
    String POSTAL_CODE = "[0-9]{5}";
    String CITY_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String STREET_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String HOUSE_NUMBER = "[0-9]{1,3}";
    String FLAT_NUMBER = "[0-9]{1,3}";
}
