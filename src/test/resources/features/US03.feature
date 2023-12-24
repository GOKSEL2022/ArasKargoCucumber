Feature: US_03  Kullanıcı Acentemiz Olun sekmesinden başvuru yapabilmeli

    Background: Kullanıcı Acentemiz Olun sekmesinden başvuru yapabilmeli
    Given GL Web sitesine "url" gidilir
    When  GL Ekrandaki uyarı yazısı kapatılır
    Then GL İş Ortağımız olun sekmesine tıklanır
    But GL 2 saniye beklenir
    And GL Acentemiz olun seceneğine tıklanır
    And GL Hemen Başvur butonuna tıklanır
    And GL Başvuru İli seçilir
    And GL Lokasyon ekle butonuna tıklanır

  Scenario: TC_01 Kullanıcı Acentemiz Olun sekmesinden geçerli bilgiler ile başvuru yapabilmeli
    Given  GL İsim, Soyisim, Yaş, Telefon numarası, E-posta bilgileri girilir
    When GL Egitim durumu seçilir
    And GL sayfa kapatılır

  Scenario: TC_02 Kişisel bilgiler kısmında zorunlu alanlar boş bırakılmamalı

    Given GL İsim, Soyisim, Yaş, Telefon numarası, E-posta, Eğitim durumu, Güvenlik kodu bilgilerini boş bırak
    When GL Başvurunu Gönder butonuna tıklanır
    And GL Lütfen gerekli  hatalı alanları kontrol ediniz uyarısı görülür





