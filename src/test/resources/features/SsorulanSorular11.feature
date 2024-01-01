@US11 @runAll
Feature: US11 Kullanıcı Is Ortagimiz Olun sekmesindeki Sik Sorulan Sorular sayfasındaki
        kategori-kategori soru ve cevaplari gorebilmeli


        @TestCase1
          Scenario: Kullanici Is Ortağımız Olun sekmesindeki Sik Sorulan Sorular basligini gorebilmelidir.

          Given SG Url'e gidilir
          When  SG Acilan sayfada gelen bilgilendirme ekrani kapatilir
          Then  SG Is Ortagimiz Olun butonunun goruldugu dogrulanir ve tiklanir
          And   SG Acilan sayfada Sik Sorulan Sorular basliginin goruldugu dogrulanir




        @TestCase2
          Scenario: Kullanici ACENTEMİZ OLUN basligini gorebilmeli ve soru-cevaplara erisebilmelidir.

              Given  SG ACENTEMİZ OLUN basliginin goruldugu dogrulanir.
              Then  SG Ilk sorunun ve cevabinin goruldugu Dogrulanir.
              And   SG Ikinci sorunun ve cevabinin goruldugu dogrulanirr.




        @TestCase3
          Scenario: Kullanici ARAS BURASI NOKTASI OLUN basligini gorebilmeli ve soru-cevaplara erisebilmelidir.


            Given  ARAS BURASI NOKTASI OLUN Basliginin gorulldugu dogrulanir.
            Then  Ilk sorunun ve cevabinin gorulldugu Dogrulanir.
            And   Ikinci sorunun ve cevabinin gorulldugu dogrulanirr.


        @TestCase4
          Scenario: Kullanici ESNAF KURYE OLUN basligini gorebilmeli ve soru-cevaplara erisebilmelidir.

            Given SG ESNAF KURYE OLUN basliginin gorulldugu dogrulanir
            Then SG Ilk sorunun ve cevabinin gorulldugu dogrulanir
            And  SG Ikinci sorunun ve cevabinin gorulldugu dogrulanir



        @TestCase5
          Scenario: Kullanici ARACINIZI KIRALAYIN basligini gorebilmeli ve soru-cevaplara erisebilmelidir.

            Given SG ARACINIZI KIRALAYIN basliginiin goruldugu dogrulanir.
            Then  SG Ilk sorunun ve cevabinin goruuldugu dogrulanir.
            And   SG Ikinci sorunun ve cevabinin goruuldugu dogrulanir.

