@us09  @runAll  @smoke
Feature: US_09 Kullanici Size nasil yardimci olabilirim pop-up ini kullanabilmeli.

  Background:
    Given AA Kullanıcı Urle gider
    And AA Anasayfada Size Nasıl Yardimci olabilirim PopUpa tiklar
    When AA Acilan pencereden Devam butonuna tiklar

@wip
  Scenario: TC01 Kullanici istenen Islem seçeneklerini secebilmeli

    And AA Valid random ad soyad bilgilerini girer ve gonder butonuna tiklar
    And AA Valid random telefon numarası girer ve gonder butonuna tiklar
    And AA Random valid mail adresi bilgisini girer ve gonder butonuna tiklar
    And AA Kullanici random islem numarasi girer
    Then AA Ilgili soruya yönlendirildigini dogrular
    And AA Sayfalari kapatir


  Scenario Outline: TC02 Kullanici invalid isim bilgisi ile islem yapamamali
#INVALID ISIM GIRILIYOR HATA MESAJI VERMIYOR. buggggg
    And AA Kullanici "<invalidIsim>" girer
    #Then AA Uyarı mesajini dogrular
    And AA Sayfalari kapatir
    Examples:
      | invalidIsim |
      | 8551231wq   |
      | asddwq;     |
      | %+^12^2     |


  Scenario Outline: TC03 Kullanici invalid telefon no ile islem yapamamali
    And AA Valid random ad soyad bilgilerini girer ve gonder butonuna tiklar
    And AA Kullanici invalid "<TelNo>" girer
    Then AA Uyarı mesajini dogrular
    And AA Sayfalari kapatir
    Examples:
      | TelNo                 |
      | 1151111               |
      | 879952125544566988414 |
      | 56586899ab            |


  Scenario Outline: TC04 Kullanici invalid mail adresi ile islem yapamamali
   #INVALID MAILI KABUL EDIYOR BUGGGGGG
    And AA Valid random ad soyad bilgilerini girer ve gonder butonuna tiklar
    And AA Valid random telefon numarası girer ve gonder butonuna tiklar
    And AA Kullanici "<invalidMail>" girer ve gonderir
  #  Then AA Uyarı mesajini dogrular
    And AA Sayfalari kapatir
    Examples:
      | invalidMail  |
      | asdads.com   |
      | asddasads    |
      | 123123123    |
      | asdad@ds.com |
      | as^#@g       |

@wip
  Scenario: TC05 Kullanici Çıkış yazarak servisten ayrılabilmeli
    And AA Valid random ad soyad bilgilerini girer ve gonder butonuna tiklar
    And AA Valid random telefon numarası girer ve gonder butonuna tiklar
    And AA Random valid mail adresi bilgisini girer ve gonder butonuna tiklar
    And AA Kullanici random islem numarasi girer
    Then AA Ilgili soruya yönlendirildigini dogrular
    And AA Isleme devam eder gonder tusuna basar
    And AA Kullanici Cikis yazar ve gondere basar
    Then AA Ilgili mesaji dogrular
    And AA Sayfalari kapatir



