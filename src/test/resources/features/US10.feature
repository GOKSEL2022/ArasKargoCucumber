@US02
Feature: US10_gelecegin_bizde_onem_tasir_test
  Background:
    Given GC Kullanici "https://www.araskargo.com.tr"  url ye gelir
    When  GC Kullanici anasayfanin acildigini dogrular
    And   GC Kullanici Kariyer basligina gelir
    And   GC Kullanici Gelecegin Bizde Onem Tasir secenegine tiklar
    And   GC Kullanici Gelecegin Bizde Onem Tasir sayfasinda oldugunu dogrular

    Scenario: US10_TC01
      Given GC Kullanici sayfayi kapatir

    Scenario: US10_TC02
      Given GC Kullanici Aras Kargo Is Basvurulari basligini goruntuler
      When  GC Kullanici Aras Kargo Is Basvurulari  altinda aciklamayi goruntuler
      Then  GC Kullanici basvuru seceneklerinin altinda mail adresini goruntuler
      Then  GC Kullanici sayfayi kapatir

    Scenario: US10_TC03
      Given GC Kullanici Aras Kargo Is Basvurulari basligini goruntuler
      When  GC Kullanici Aras Kargo Is Basvurulari  altinda aciklamayi goruntuler
      And   GC Kullanici Linkedin butonuna tiklar
      When  GC Kullanici Aras Kargo Linkedin sayfasinda oldugunu dogrular
      Then  GC Kullanici sayfayi kapatir

    Scenario: US10_TC04
      Given GC Kullanici Aras Kargo Is Basvurulari basligini goruntuler
      When  GC Kullanici Aras Kargo Is Basvurulari  altinda aciklamayi goruntuler
      And   GC Kullanici kariyer.net butonuna tiklar
      When  GC Kullanici Aras Kargo kariyer.net sayfasinda oldugunu dogrular
      Then  GC Kullanici sayfayi kapatir

    Scenario: US10_TC05
      Given GC Kullanici Aras Kargo Is Basvurulari basligini goruntuler
      When  GC Kullanici Aras Kargo Is Basvurulari  altinda aciklamayi goruntuler
      And   GC Kullanici Secretcv butonuna tiklar
      When  GC Kullanici Aras Kargo Secretcv  sayfasinda oldugunu dogrular
      Then  GC Kullanici sayfayi kapatir

    Scenario: US10_TC06
      Given GC Kullanici Aras Kargo Is Basvurulari basligini goruntuler
      When  GC Kullanici Aras Kargo Is Basvurulari  altinda aciklamayi goruntuler
      And   GC Kullanici eleman.net butonuna tiklar
      When  GC Kullanici Aras Kargo eleman.net  sayfasinda oldugunu dogrular
      Then  GC Kullanici sayfayi kapatir



