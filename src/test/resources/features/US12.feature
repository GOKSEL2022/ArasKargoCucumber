Feature:US12_SSS(sik_sorulan_sorular)_sayfa_test
  Background:
    Given GC Kullanici https://www.araskargo.com.tr/  url ye gelir
     When GC Kullanici anasayfanin acildigini dogrular
     And  GC Kullanici Müsteri İliskileri basligina gelir
     And  GC Kullanici SSS secenegine tiklar
     When GC Kullanici Sik Sorulan Sorular sayfasinda oldugunu dogrular

  Scenario: US12_TC01
    Given GC Kullanici sayfayi kapatir

  Scenario: US12_TC02
    Given GC Kullanici sayfadaki ilk soruyu goruntuler
    When  GC Kullanici sayfadaki son soruyu goruntuler
    Then  GC Kullanici sayfayi kapatir

  Scenario: US12_TC03
    Given GC Kullanici sayfadaki ilk soruya tiklar
    When  GC Kullanici ilk soru ile ilk cevabin ilgili oldugunu dogrular
    And   GC Kullanici sayfadaki ikinci soruya tiklar
    And   GC Kullanici ikinci soru ile ikinci cevabin ilgili oldugunu dogrular
    And   GC Kullanici son soruyu tiklar
    When  GC Kullanici son soru ile son cevabin ilgili oldugunu dogrular
    Then  GC Kullanici sayfayi kapatir

  Scenario: US12_TC04
    Given GC Kullanici sayfadaki ilk soruya tiklar
    When  GC Kullanici cevapta belirtilen mobil uygulamalardan GooglePlay e tiklar
    And   GC Kullanici GooglePlay sayfasina yonlendirildigini dogrular
    Then  GC Kullanici sayfayi kapatir

  Scenario: US12_TC05
    Given GC Kullanici sayfadaki ilk soruya tiklar
    When  GC Kullanici cevapta belirtilen mobil uygulamalardan AppStore a tiklar
    And   GC Kullanici AppStore  sayfasina yonlendirildigini dogrular
    Then  GC Kullanici sayfayi kapatir

  Scenario: US12_TC05
    Given GC Kullanici sayfadaki ilk soruya tiklar
    When  GC Kullanici cevapta belirtilen mobil uygulamalardan AppGallery e tiklar
    And   GC Kullanici AppGallery sayfasina yonlendirildigini dogrular
    Then  GC Kullanici sayfayi kapatir






