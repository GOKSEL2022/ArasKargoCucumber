@us04 @runAll  @smoke

Feature: US_04 kullanici uye girisi butonunu tiklayabilmeli
  Scenario: TC01 kullanici uye girisi butonunu tiklayabilmeli
    Given SO Aras kargo web sitesine gidilir
    When Uye Girisi butonu tiklanir
    Then Kullanici Adi, Sifre textboxlarinin goruntulendigi dogrulanir
    Then Guvenlik Kodu textboxinin goruntulendigi dogrulanir
    Then Giris Yap ve Sifremi Unuttum buttonlarinin goruntulendigi dogrulanir
    And Sayfalari kapatir

