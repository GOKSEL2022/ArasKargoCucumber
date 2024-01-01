@US01  @smoke   @runAll
Feature:Ana_Sayfadaki_Butonlarin_Tiklanmasi
  @anasayfadaki_butonlarin_testi #
  Scenario:Ana_Sayfadaki_Butonlarin_Tiklanmasi US01_TC01
    Given MS Kullanici ana sayfaya  gider
    When  MS Ana sayfayi dogrular
    And   MS Hakkimizda butonuna tiklar
    And   MS Hakkimizda sayfanin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Hizmetlerimiz butonuna tiklar
    And   MS Hizmetlerimiz sayfanin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Kariyer butonuna tiklar
    And   MS Kariyer sayfanin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Surdurebilirlik butonuna tiklar
    And   MS Surdurebilirlik sayfanin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS isOrtagimizOlun butonuna tiklar
    And   MS isOrtagimizOlun sayfanin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Musteriliskileri butonuna tiklar
    And   MS Musteriliskileri sayfanin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS ArasKargoSporKulubu butonuna tiklar
    And   MS ArasKargoSporKulubu sayfanin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS BizeUlasin butonuna tiklar
    And   MS BizeUlasin sayfanin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    Then  MS Kullanici sayfayi kapatir

  @HakkimizdeSecenekleri #
  Scenario:Hakkimizde Secenekleri Testi US01_TC02
    Given MS Kullanici ana sayfaya  gider
    When  MS Ana sayfayi dogrular
    And   MS Hakkimizda butonunun ustune gelir
    And   MS Acilan Drapdawn menude Vizyon Misyon Politikalar butonuna tiklar
    And   MS VizyonMisyonPolitikalar sayfanin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Hakkimizda butonunun ustune gelir
    And   MS Acilan Drapdawn menude YonetimEkibimiz butonuna tiklar
    And   MS YonetimEkibimiz sayfanin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Hakkimizda butonunun ustune gelir
    And   MS Acilan Drapdawn menude HaberDuyurular butonuna tiklar
    And   MS HaberDuyurular sayfanin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Hakkimizda butonunun ustune gelir
    And   MS Acilan Drapdawn menude Reklamlarimiz butonuna tiklar
    And   MS Reklamlarimiz sayfanin acildigini dogrular
    Then  MS Kullanici sayfayi kapatir

  @HizmetlerimizSecenekleri #
  Scenario: Hizmetlerimiz Secenekleri Testi US01_TC03
    Given MS Kullanici ana sayfaya  gider
    When  MS Ana sayfayi dogrular
    And   MS Hizmetlerimiz butonunun ustune gelir
    And   MS Acilan Drapdawn menude Bireysel Hizmetlerimiz butonuna tiklar
    And   MS Bireysel Hizmetlerimiz sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Hizmetlerimiz butonunun ustune gelir
    And   MS Acilan Drapdawn menude Kurumsal Hizmetlerimiz butonuna tiklar
    And   MS Kurumsal Hizmetlerimiz sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Hizmetlerimiz butonunun ustune gelir
    And   MS Acilan Drapdawn menude Ambalaj Urunlerimiz butonuna tiklar
    And   MS Ambalaj Urunlerimiz sayfasinin acildigini dogrular
    Then  MS Kullanici sayfayi kapatir

  @KariyerSecenekleri #
  Scenario: Kariyer Secenekleri Testi US01_TC04
    Given MS Kullanici ana sayfaya  gider
    When  MS Ana sayfayi dogrular
    And   MS Kariyer butonunun ustune gelir
    And   MS Acilan Drapdawn menude  Araslar Bizde Önem Tasir butonuna tiklar
    And   MS Araslar Bizde Önem Tasir sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Kariyer butonunun ustune gelir
    And   MS Acilan Drapdawn menude Gelecegin Bizde Onem Tasir butonuna tiklar
    And   MS Gelecegin Bizde Onem Tasir sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Kariyer butonunun ustune gelir
    And   MS Acilan Drapdawn menude Iyi Bir Dunya Bizde Onem Tasir butonuna tiklar
    And   MS Iyi Bir Dunya Bizde Onem Tasir sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Kariyer butonunun ustune gelir
    And   MS Acilan Drapdawn menude Teknoloji Bizde Onem Tasir butonuna tiklar
    And   MS Teknoloji Bizde Onem Tasir sayfasinin acildigini dogrular
    Then  MS Kullanici sayfayi kapatir

  @SurdurulebilirlikSecenekleri #
  Scenario: Surdurulebilirlik Secenekleri Testi US01_TC05
    Given MS Kullanici ana sayfaya  gider
    When  MS Ana sayfayi dogrular
    And   MS Surdurulebilirlik butonunun ustune gelir
    And   MS Acilan Drapdawn menude Surdurulebilirlik Rotasi butonuna tiklar
    And   MS Surdurulebilirlik Rotasi sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Surdurulebilirlik butonunun ustune gelir
    And   MS Acilan Drapdawn menude Sosyal Sorumluluk Platformlarimiz butonuna tiklar
    And   MS Sosyal Sorumluluk Platformlarimiz sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Surdurulebilirlik butonunun ustune gelir
    And   MS Acilan Drapdawn menude Kalite Yönetim Sistemi butonuna tiklar
    And   MS Kalite Yönetim Sistemi sayfasinin acildigini dogrular
    Then  MS Kullanici sayfayi kapatir

  @IsOrtagimizOlunSecenekleri #
  Scenario: Is Ortagimiz Olun Secenekleri Testi US01_TC06
    Given MS Kullanici ana sayfaya  gider
    When  MS Ana sayfayi dogrular
    And   MS Is Ortagimiz Olun butonunun ustune gelir
    And   MS Acilan Drapdawn menude Acentemiz Olun butonuna tiklar
    And   MS Acentemiz Olun sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Is Ortagimiz Olun butonunun ustune gelir
    And   MS Acilan Drapdawn menude Aras Burasi Noktasi Olun butonuna tiklar
    And   MS Aras Burasi Noktasi Olun sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Is Ortagimiz Olun butonunun ustune gelir
    And   MS Acilan Drapdawn menude Esnaf Kurye Olun butonuna tiklar
    And   MS Esnaf Kurye Olun sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Is Ortagimiz Olun butonunun ustune gelir
    And   MS Acilan Drapdawn menude Aracinizi Kiralayin butonuna tiklar
    And   MS Aracinizi Kiralayin sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Is Ortagimiz Olun butonunun ustune gelir
    And   MS Acilan Drapdawn menude Sik Sorulan Sorular butonuna tiklar
    And   MS Sik Sorulan Sorular sayfasinin acildigini dogrular
    Then  MS Kullanici sayfayi kapatir

  @MusteriIliskileriSecenekleri #
  Scenario: Musteri Iliskileri Secenekleri Testi US01_TC07
    Given MS Kullanici ana sayfaya  gider
    When  MS Ana sayfayi dogrular
    And   MS Musteri Iliskileri butonunun ustune gelir
    And   MS Acilan Drapdawn menude Arasa Sor butonuna tiklar
    And   MS Arasa Sor sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Musteri Iliskileri butonunun ustune gelir
    And   MS Acilan Drapdawn menude Cagri Merkezi butonuna tiklar
    And   MS Cagri Merkezi sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Musteri Iliskileri butonunun ustune gelir
    And   MS Acilan Drapdawn menude Hasar Tazmin butonuna tiklar
    And   MS Hasar Tazmin sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Musteri Iliskileri butonunun ustune gelir
    And   MS Acilan Drapdawn menude Geri Bildirim Formu butonuna tiklar
    And   MS Geri Bildirim Formu sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Musteri Iliskileri butonunun ustune gelir
    And   MS Acilan Drapdawn menude SSS butonuna tiklar
    And   MS SSS sayfasinin acildigini dogrular
    Then  MS Kullanici sayfayi kapatir

  @ArasKargoSporKulubuSecenekleri #
  Scenario: Aras Kargo Spor Kulubu Secenekleri Testi US01_TC08
    Given MS Kullanici ana sayfaya  gider
    When  MS Ana sayfayi dogrular
    And   MS Aras Kargo Spor Kulubu butonunun ustune gelir
    And   MS Acilan Drapdawn menude Aras Kargo Spor Kulubu butonuna tiklar
    And   MS Aras Kargo Spor Kulubu sayfasinin acildigini dogrular
    And   MS Kullanici sayfayi kapatir

  @BizeUlasinSecenekleri
  Scenario: Bize Ulasin Secenekleri Testi US01_TC09
    Given MS Kullanici ana sayfaya  gider
    When  MS Ana sayfayi dogrular
    And   MS Bize Ulasin butonunun ustune gelir
    And   MS Acilan Drapdawn menude Iletisim butonuna tiklar
    And   MS Iletisim sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Bize Ulasin butonunun ustune gelir
    And   MS Acilan Drapdawn menude Genel Mudurluk butonuna tiklar
    And   MS Genel Mudurluk sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Bize Ulasin butonunun ustune gelir
    And   MS Acilan Drapdawn menude Bolge Mudurluklerimiz butonuna tiklar
    And   MS Bolge Mudurluklerimiz sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Bize Ulasin butonunun ustune gelir
    And   MS Acilan Drapdawn menude Subelerimiz butonuna tiklar
    And   MS Subelerimiz sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Bize Ulasin butonunun ustune gelir
    And   MS Acilan Drapdawn menude Aras Burasi Noktalarimiz butonuna tiklar
    And   MS Aras Burasi Noktalarimiz sayfasinin acildigini dogrular
    And   MS Kullanici iki saniye bekler
    And   MS Bize Ulasin butonunun ustune gelir
    And   MS Acilan Drapdawn menude Musterimiz Olun butonuna tiklar
    And   MS Musterimiz Olun sayfasinin acildigini dogrular
    And   MS Kullanici sayfayi kapatir