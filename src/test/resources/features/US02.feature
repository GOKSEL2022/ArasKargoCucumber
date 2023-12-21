@US02
Feature:ambalaj_urunleri
  Scenario:ambalaj_urunleri_test
    Given  GC Kullanici "https://www.araskargo.com.tr"  url ye gelir
    When   GC Kullanici anasayfanin acildigini dogrular
    And    GC Kullanici Hizmetlerinmiz basligina gelir
    And    GC Kullanici Ambalaj Urunlerimiz secenegine tiklar
    When   GC Kullanici Ambalaj Urunlerimiz sayfasinda oldugunu dogrular
    Then   GC Kullanici sayfayi kapatir
