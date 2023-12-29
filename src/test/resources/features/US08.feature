@US08 @goksel
Feature: dashboarddaki_kategori_secenekleri_testi
  Background:
    Given EK Kullanici verilen URL'e gider
    When  EK Kullanici anasayfanin acildigini dogrular
    When  EK Kullanici cikan popupi kapatir
    And   EK Kullanici dashboarddaki Musteri Iliskileri kisminin goruldugunu dogrular
    And   EK Kullanici dashboarddaki Musteri Iliskileri kismina tiklar
    And   EK Kullanici iki saniye bekler
    And   EK Kullanici Geri Bildirim Formu kisminin altindaki Sayfaya Git yazisina tiklar
    And   EK Kullanici Geri Bildirim Formu sayfasinin acildigini dogrular
    And   EK Kullanici Bireysel kismina tiklar
    And   EK Kullanici iki saniye bekler
    And   EK Kullanici Kategori Secin yazisi gozukene kadar sayfayi asagi kaydirir
    And   EK Kullanici iki saniye bekler
    And   EK Kullanici Kategori Secin yazisina tiklar

    @US08_TC01
  Scenario: US08_TC01
    Given EK Kullanici acilan dropdowndaki BILGI butonuna tiklar
    And   EK Kullanici iki saniye bekler
    And   EK KUllanici konu basligi dropdowna tiklar
    And   EK Kullanici iki saniye bekler
    And   EK Kullanici eOdemeBilgisi secenegini tiklar
    And   EK Kullanici iki saniye bekler
    When  EK Kullanici dropdown icinde BILGI secildigini dogrular
    And   EK Kullanici iki saniye bekler
    Then  EK Kullanici sayfayi kapatir

    @US08_TC02
  Scenario: US08_TC02
    Given EK Kullanici acilan dropdowndaki ISLEM_TALEP butonuna tiklar
    And   EK Kullanici iki saniye bekler
    And   EK KUllanici konu basligi dropdowna tiklar
    And   EK Kullanici iki saniye bekler
    And   EK Kullanici acentelik talebi secenegini tiklar
    And   EK Kullanici iki saniye bekler
    When  EK Kullanici dropdown icinde ISLEM_TALEP secildigini dogrular
    And   EK Kullanici iki saniye bekler
    Then  EK Kullanici sayfayi kapatir

    @US08_TC03
  Scenario: US08_TC03
    Given EK Kullanici acilan dropdowndaki ONERI butonuna tiklar
    And   EK Kullanici iki saniye bekler
    And   EK KUllanici konu basligi dropdowna tiklar
    And   EK Kullanici iki saniye bekler
    And   EK Kullanici diger secenegini tiklar
    And   EK Kullanici iki saniye bekler
    When  EK Kullanici dropdown icinde ONERI secildigini dogrular
    And   EK Kullanici iki saniye bekler
    Then  EK Kullanici sayfayi kapatir

    @US08_TC04
  Scenario: US08_TC04
    Given EK Kullanici acilan dropdowndaki SIKAYET_PROBLEM butonuna tiklar
    And   EK Kullanici iki saniye bekler
    And   EK KUllanici konu basligi dropdowna tiklar
    And   EK Kullanici iki saniye bekler
    And   EK Kullanici adresten alim yapilmamasi secenegini tiklar
    And   EK Kullanici iki saniye bekler
    When  EK Kullanici dropdown icinde SIKAYET_PROBLEM secildigini dogrular
    And   EK Kullanici iki saniye bekler
    Then  EK Kullanici sayfayi kapatir

   @US08_TC05
  Scenario: US08_TC05
    Given EK Kullanici acilan dropdowndaki TESEKKURLER butonuna tiklar
    And   EK Kullanici iki saniye bekler
    And   EK KUllanici konu basligi dropdowna tiklar
    And   EK Kullanici iki saniye bekler
    And   EK Kullanici bolge personeli secenegini tiklar
    And   EK Kullanici iki saniye bekler
    When  EK Kullanici dropdown icinde TESEKKURLER secildigini dogrular
   # And   EK Kullanici iki saniye bekler
    Then  EK Kullanici sayfayi kapatir
