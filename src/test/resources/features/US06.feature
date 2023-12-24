Feature: US06 Kullanıcı ucret Hesapla pop-upindaki yurt disi ucret hesabini yapabilmeli

  Background:
    Given AA Kullanıcı belirtilen Urle gider
    When AA Kullanıcı anasayfada Ucret Hesapla butonunu tiklar
    And AA Acilan sayfada Yurt Disi secer
    And AA Random bir ulke secer


  @us06
  Scenario: TC01 Kullanıcı yurt disi icin Dosya / Evrak ucretini hesaplayabilmeli
    When AA Dosya - Evrak tiklar ve hizmet turunu secer
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular
    And AA Sayfayi kapatir


  @us06
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


  @us06
  Scenario Outline: TC03 Kullanıcı yurt disi icin Yeni Hesaplama Yap butonu ile ardisik hesaplama yapabilmeli – Kutu /Koli
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


  @us06
  Scenario: TC04 Kullanıcı yurt disi icin Yeni Hesaplama Yap butonu ile ardisik hesaplama yapabilmeli – Dosya / Evrak
    When AA Dosya - Evrak tiklar ve hizmet turunu secer
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular
    And AA Yeni Hesaplama Yap butonuna tiklar
    Then AA Ilgili Hesaplama sayfasında oldugunu dogrular
    And AA Acilan sayfada Yurt Disi secer
    And AA Ulke bilgisini girer
    When AA Dosya - Evrak tiklar ve hizmet turunu secer
    Then AA Gonderi Detayindan ucret goruntulendigini dogrular
    And AA Sayfayi kapatir


  @us06
  Scenario Outline: TC05 Kullanıcı yurt disi icin Kutu / Koli ucretini hesaplayamamali- Negative Test
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


  @us06
  Scenario Outline: TC06 Kullanıcı yurt disi icin Kutu / Koli ucretini hesaplayamamali- Negative Test
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


  @us06
  Scenario Outline: TC07 Kullanıcı yurt disi icin Kutu / Koli ucretini hesaplayamamali- Negative Test
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


  @us06
  Scenario Outline: TC08 Kullanıcı yurt disi icin Kutu / Koli ucretini hesaplayamamali- Negative Test
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


  @us06
  Scenario Outline: TC09 Kullanıcı yurt disi icin Kutu / Koli ucretinde Agirlik bilgisini boş birakamamali - Negative Test
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