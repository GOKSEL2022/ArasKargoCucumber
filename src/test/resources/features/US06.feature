Feature: US06 Kullanıcı ucret Hesapla pop-upindaki yurt disi ucret hesabini yapabilmeli

  Background:
    Given AA Kullanıcı belirtilen Urle gider
    When AA Kullanıcı anasayfada Ucret Hesapla butonunu tiklar
    And AA Acilan sayfada Yurt Disi secer
    And AA Random bir ulke secer


  @wip
  Scenario: TC01 Kullanıcı yurt disi icin Dosya / Evrak ucretini hesaplayabilmeli
    When AA Dosya - Evrak tiklar ve hizmet turunu secer
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular
    And AA Sayfayi kapatir


  Scenario Outline: TC02 Kullanıcı yurt disi icin Kutu / Koli ucretini hesaplayabilmeli
    And AA Kutu - Koli secer
    When AA "<agirlik>" "<boy>" "<yukseklik>" ve "<en>" bilgilerini girer
    And AA Desi Kg Hesapla butonuna tiklar
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular
    And AA Sayfayi kapatir
    Examples:
      | agirlik | boy | yukseklik | en |
      | 15      | 6   | 4         | 15 |
      | 10      | 5   | 5         | 5  |


  Scenario Outline: TC03 Kullanıcı yurt disi icin Yeni Hesaplama Yap butonu ile ardisik hesaplama yapabilmeli – Kutu /Koli
    And AA Kutu - Koli secer
    When AA "<agirlik>" "<boy>" "<yukseklik>" ve "<en>" bilgilerini girer
    And AA Desi Kg Hesapla butonuna tiklar
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular
    And AA Yeni Hesaplama Yap butonuna tiklar
    Then AA Ilgili Hesaplama sayfasında oldugunu dogrular
    And AA Random bir ulke secer
    And AA Kutu - Koli secer
    When AA "<agirlik>" "<boy>" "<yukseklik>" ve "<en>" bilgilerini girer
    And AA Desi Kg Hesapla butonuna tiklar
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular
    Examples:
      | agirlik | boy  | yukseklik | en   |
      | 5       | 5    | 5         | 5    |
      | 5555    | 5555 | 5555      | 5555 |


  Scenario: TC04 Kullanıcı yurt disi icin Yeni Hesaplama Yap butonu ile ardisik hesaplama yapabilmeli – Dosya / Evrak
    When AA Dosya - Evrak tiklar ve hizmet turunu secer
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular
    And AA Yeni Hesaplama Yap butonuna tiklar
    Then AA Ilgili Hesaplama sayfasında oldugunu dogrular
    And AA Ulke bilgisini girer
    When AA Dosya - Evrak tiklar ve hizmet turunu secer
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular


    Scenario: TC05 Kullanıcı yurt disi icin Kutu / Koli ucretini hesaplayamamali- Negative Test


      And AA Kutu - Koli secer
      When AA "<agirlik>" "<boy>" "<yukseklik>" ve "<en>" bilgilerini girer
      Then AA Agirlik textboxinin kızardigini dogrular
      And AA Desi Kg Hesapla butonuna tiklar
      Then AA Gonderi Detayindan ucret goruntulenmedigini doğrular

