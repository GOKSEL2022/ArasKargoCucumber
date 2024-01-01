@US13  @runAll
Feature: US_13 Kullanici Surdurulebilirlik sekmesindeki -Kalite Yonetim Sistemi- ndeki belgeleri goruntuleyebilmeli
  Scenario: TC01 Kullanici Surdurulebilirlik sekmesindeki -Kalite Yonetim Sistemi- ndeki belgeleri goruntuleyebilmeli
    Given SO Kullanici urle gider
    When SO Kullanici Surdurulebilirlik sekmesinden Kalite Yonetim Sistemini tiklar
    Then SO Kullanici 11 tane Belge goruntulendigini dogrular
    And SO Sayfayi kapatir


