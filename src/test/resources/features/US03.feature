Feature: US_03  Kullanıcı Acentemiz Olun sekmesinden başvuru yapabilmeli
  @US03
  Scenario: Kullanıcı Acentemiz Olun sekmesinden geçerli bilgiler ile başvuru yapabilmeli
    Given GL Web sitesine "url" gidilir
    When  GL Ekrandaki uyarı yazısı kapatılır
    Then GL İş Ortağımız olun sekmesine tıklanır
    But GL 2 saniye beklenir
    And GL Acentemiz olun seceneğine tıklanır
    And GL Hemen Başvur butonuna tıklanır
    And GL Başvuru İli seçilir
    And GL Lokasyon ekle butonuna tıklanır
    And GL İsim, Soyisim, Yaş, Telefon numarası, E-posta bilgileri girilir
    And GL Egitim durumu seçilir
    And GL sayfa kapatılır


