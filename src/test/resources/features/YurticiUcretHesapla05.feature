@US05 @runAll
Feature: Ucret hesapla pop-up'ina ulasilabilmelidir.


  @TestCase1
    Scenario: Ücret hesapla pop-up'ina ulasilabilmelidir.

         Given Url'e gidilir.
         Then Acilan sayfada gelen bilgilendirme ekrani kapatilir.
         And Sayfayi asagi kaydirarak Ucret Hesapla pop-up'inin goruldugu dogrulanir ve tiklanir.

    @TestCase2
    Scenario: Yurt ici fiyat listesine ulasilabilmelidir.
      Given Url'e gidilir.
      When Acilan sayfada gelen bilgilendirme ekrani kapatilir.
      Then Sayfayi asagi kaydirarak Ucret Hesapla pop-up'inin goruldugu dogrulanir ve tiklanir.
      Then Yurt ici pop-upinin acildigi dogrulanir.
      Then Acilan pop-up'ta Yurt ici fiyatlarina ulasmak icin tiklayiniz butonunun goruldugu dogrulanir ve tiklanir.
      Then Standart Fiyat Listesi butonunun goruldugu dogrulanir ve tiklanir.
      And Yurt ici fiyat listesinin acildigi dogrulanir.




