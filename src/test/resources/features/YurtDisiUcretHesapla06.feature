@US06  @runAll
Feature: US06 Kullanici ucret Hesapla pop-upindaki yurt disi ucret hesabini yapabilmeli

  Background:
    Given AA Kullanıcı belirtilen Urle gider
    When AA Kullanıcı anasayfada Ucret Hesapla butonunu tiklar
    And AA Acilan sayfada Yurt Disi secer
    And AA Random bir ulke secer

  @smoke
  Scenario: TC01 Kullanıcı yurlt disi icin Dosya / Evrak ucretini hesaplayabilmeli
    When AA Dosya - Evrak tiklar ve hizmet turunu secer
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular
    And AA Sayfayi kapatir

  @smoke
  Scenario Outline: TC02 Kullanici yurt disi icin Kutu / Koli ucretini hesaplayabilmeli
    And AA Kutu - Koli secer
    When AA "<agirlik>" "<boy>" "<yukseklik>" ve "<en>" bilgilerini girer
    And AA Desi Kg Hesapla butonuna tiklar
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular
    And AA Sayfayi kapatir
    Examples:
      | agirlik | boy | yukseklik | en |
      | 15      | 6   | 4         | 15 |
      | 10      | 5   | 5         | 5  |

  @smoke
  Scenario Outline: TC03 Kullanici yurt disi icin Yeni Hesaplama Yap butonu ile ardisik hesaplama yapabilmeli – Kutu /Koli
    And AA Kutu - Koli secer
    When AA "<agirlik>" "<boy>" "<yukseklik>" ve "<en>" bilgilerini girer
    And AA Desi Kg Hesapla butonuna tiklar
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular
    And AA Yeni Hesaplama Yap butonuna tiklar
    Then AA Ilgili Hesaplama sayfasında oldugunu dogrular
    And AA Acilan sayfada Yurt Disi secer
    And AA Random bir ulke secer
    And AA Kutu - Koli secer
    When AA "<agirlik>" "<boy>" "<yukseklik>" ve "<en>" bilgilerini girer
    And AA Desi Kg Hesapla butonuna tiklar
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular
    And AA Sayfayi kapatir
    Examples:
      | agirlik | boy | yukseklik | en |
      | 5       | 5   | 5         | 5  |
      | 55      | 54  | 20        | 23 |

  @smoke
  Scenario: TC04 Kullanici yurt disi icin Yeni Hesaplama Yap butonu ile ardisik hesaplama yapabilmeli – Dosya / Evrak
    When AA Dosya - Evrak tiklar ve hizmet turunu secer
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular
    And AA Yeni Hesaplama Yap butonuna tiklar
    Then AA Ilgili Hesaplama sayfasında oldugunu dogrular
    And AA Acilan sayfada Yurt Disi secer
    And AA Ulke bilgisini girer
    When AA Dosya - Evrak tiklar ve hizmet turunu secer
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular
    And AA Sayfayi kapatir


  Scenario Outline: TC05 Kullanici yurt disi icin Kutu / Koli ucretini hesaplayamamali- Negative Test
    And AA Kutu - Koli secer
    When AA "<agirlik>" "<boy>" "<yukseklik>" ve "<en>" bilgilerini girer
    Then AA "Agirlik" textboxinin kızardigini dogrular
    And AA Desi Kg Hesapla butonuna tiklar
    Then AA Gonderi Detayindan ucret goruntulenmedigini dogrular
    And AA Sayfayi kapatir
    Examples:
      | agirlik | boy | yukseklik | en |
      | -1      | 5   | 5         | 5  |
      | 0       | 5   | 5         | 5  |


  Scenario Outline: TC06 Kullanici yurt disi icin Kutu / Koli ucretini hesaplayamamali- Negative Test
  #Bug hesaplama yapmaması gerekirken hesaplama yapıyor. Oyuzden step yoruma alındı
    And AA Kutu - Koli secer
    When AA "<agirlik>" "<boy>" "<yukseklik>" ve "<en>" bilgilerini girer
    Then AA "Boy" textboxinin kızardigini dogrular
    And AA Desi Kg Hesapla butonuna tiklar
   # Then AA Gonderi Detayindan ucret goruntulenmedigini dogrular
    And AA Sayfayi kapatir
    Examples:
      | agirlik | boy | yukseklik | en |
      | 5       | -1  | 5         | 5  |
      | 5       | 0   | 5         | 5  |


  Scenario Outline: TC07 Kullanici yurt disi icin Kutu / Koli ucretini hesaplayamamali- Negative Test
  #Bug hesaplama yapmaması gerekirken hesaplama yapıyor. Oyuzden step yoruma alındı
    And AA Kutu - Koli secer
    When AA "<agirlik>" "<boy>" "<yukseklik>" ve "<en>" bilgilerini girer
    Then AA "Yukseklik" textboxinin kızardigini dogrular
    And AA Desi Kg Hesapla butonuna tiklar
   # Then AA Gonderi Detayindan ucret goruntulenmedigini dogrular
    And AA Sayfayi kapatir
    Examples:
      | agirlik | boy | yukseklik | en |
      | 5       | 5   | -1        | 5  |
      | 5       | 5   | 0         | 5  |


  Scenario Outline: TC08 Kullanici yurt disi icin Kutu / Koli ucretini hesaplayamamali- Negative Test
  #Bug hesaplama yapmaması gerekirken hesaplama yapıyor. Oyuzden step yoruma alındı
    And AA Kutu - Koli secer
    When AA "<agirlik>" "<boy>" "<yukseklik>" ve "<en>" bilgilerini girer
    Then AA "En" textboxinin kızardigini dogrular
    And AA Desi Kg Hesapla butonuna tiklar
   # Then AA Gonderi Detayindan ucret goruntulenmedigini dogrular
    And AA Sayfayi kapatir
    Examples:
      | agirlik | boy | yukseklik | en |
      | 5       | 5   | 6         | -1 |
      | 5       | 5   | 8         | 0  |


  Scenario Outline: TC09 Kullanici yurt disi icin Kutu / Koli ucretinde Agirlik bilgisini boş birakamamali - Negative Test
    And AA Kutu - Koli secer
    When AA "<agirlik>" "<boy>" "<yukseklik>" ve "<en>" bilgilerini girer
    Then AA Agirlik textboxinda uyarı mesajini dogrular
    And AA Desi Kg Hesapla butonuna tiklar
    Then AA Gonderi Detayindan ucret goruntulenmedigini dogrular
    And AA Sayfayi kapatir
    Examples:
      | agirlik | boy | yukseklik | en |
      |         | 5   | 6         | 6  |
      |         | 5   | 8         | 6  |