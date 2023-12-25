@US02
Feature:US002_ambalaj_urunleri_test
  Background:
    Given  GC Kullanici "https://www.araskargo.com.tr"  url ye gelir
    When   GC Kullanici anasayfanin acildigini dogrular
    And    GC Kullanici Hizmetlerinmiz basligina gelir
    And    GC Kullanici Ambalaj Urunlerimiz secenegine tiklar
    When   GC Kullanici Ambalaj Urunlerimiz sayfasinda oldugunu dogrular

  Scenario:US002_TC01
    Then   GC Kullanici sayfayi kapatir

  Scenario: US002_TC02
    Given GC Kullanici Kutu_Koli basligini goruntuler
    When  GC Kullanici Kutu_Koli basliginin seceneklerini goruntuler
    And   GC Kullanici Ambalaj fiyatlari alanina tiklar
    And   GC Kullanici Aras Kargo Hizmetler Fiyat Listesini goruntuler
    And   GC Kullanici indirme linkini goruntuler
    When  GC Kullanici yazdirma linkini goruntuler
    Then  GC Kullanici sayfayi kapatir

    @US02_TC03
  Scenario: US002_TC03
    Given GC Kullanici Dosya_Evrak basligina tiklar
    When  GC Kullanici Dosya_Evrak basliginin seceneklerini goruntuler
    And   GC Kullanici Ambalaj fiyatlari alanina tiklar
    And   GC Kullanici Aras Kargo Hizmetler Fiyat Listesini goruntuler
    And   GC Kullanici indirme linkini goruntuler
    When  GC Kullanici yazdirma linkini goruntuler
    Then  GC Kullanici sayfayi kapatir

