@US03  @runAll
Feature: US_03  Kullanıcı Acentemiz Olun sekmesinden başvuru yapabilmeli

  Background:
    Given GL Web sitesine "url" gidilir
    When  GL Ekrandaki uyarı yazısı kapatılır
    Then GL İş Ortağımız olun sekmesine tıklanır
    And GL Acentemiz olun seceneğine tıklanır
    And GL Hemen Başvur butonuna tıklanır
    And GL Başvuru İli seçilir
    And GL Lokasyon ekle butonuna tıklanır
    And GL 2 saniye beklenir

  Scenario: TC_01 Kullanıcı Acentemiz Olun sekmesinden geçerli bilgiler ile başvuru yapabilmeli
    Given  GL İsim, Soyisim, Yaş, Telefon numarası, E-posta bilgileri girilir
    When GL Egitim durumu seçilir
    And GL sayfa kapatılır


  Scenario: TC_02 Kişisel bilgiler kısmında zorunlu alanlar boş bırakılmamalı
    Given GL İsim, Soyisim, Yaş, Telefon numarası, E-posta, Eğitim durumu, Güvenlik kodu bilgilerini boş bırak
    When GL Başvurunu Gönder butonuna tıklanır
    And GL Lütfen gerekli  hatalı alanları kontrol ediniz uyarısı görülür
    And GL sayfa kapatılır


  Scenario: TC_03 Yaş kutusuna 18 den küçük sayı girildiğinde başvuru işlemi gerçekleşmemeli
    Given GL İsim, Yaş 18 in altında bir sayı yazılır ,Soyisim, Telefon numarası, E-posta bilgileri girilir
    When GL Egitim durumu seçilir
    And GL Minimum 18 karakter olmalıdır. uyarısı gelmeli
    And GL sayfa kapatılır

  Scenario: TC_04 Telefon numarası "05" ile başlamadığında başvuru işlemi gerçekleşmemeli
    Given  GL İsim, Soyisim, Yaş, Telefon numarası 05 ile baslamayan veri gir, E-posta bilgileri girilir
    When GL Egitim durumu seçilir
    And GL Girdiğiniz format hatalı. uyarısı gelmeli
    And GL sayfa kapatılır









