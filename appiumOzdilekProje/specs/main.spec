Specification Heading
=====================

This is an executable specification file. This file follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

To execute this specification, run
	gauge specs

ozdilekAppiumTest
-------------------------------------
* "5" saniye bekle
*"com.ozdilek.ozdilekteyim:id/textView" id'li element "Mağazadan Alışveriş" text değerini içerdiğini kontrol et
* "3" saniye bekle
*"com.ozdilek.ozdilekteyim:id/tv_startShoppingStore" id'li elemente tıkla
* "3" saniye bekle
*"com.ozdilek.ozdilekteyim:id/tvMarketName" id'li element "Market" text değerini içerdiğini kontrol et
* "3" saniye bekle
*"com.ozdilek.ozdilekteyim:id/nav_categories" id'li elemente tıkla
* "3" saniye bekle
*"(//*[@text='Kategoriler'])[1]" xpath'li element "Kategoriler" text değerini içerdiğini kontrol et
* "3" saniye bekle
*"//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]" xpath'li elemente tıkla
* "3" saniye bekle
*"//*[@text='Pantolon']" xpath'li elemente tıkla
* "3" saniye bekle
*aşağıya doğru iki kez scroll edilir
* "3" saniye bekle
*random ürün seçilir
* "3" saniye bekle
*"//*[@text='Beden Tablosu']" xpath'li element "Beden Tablosu" text değerini içerdiğini kontrol et
* "3" saniye bekle
*"//*[@text='Listeme Ekle']" xpath'li elemente tıkla
* "3" saniye bekle
*"//*[@text='Facebook ile Bağlan']" xpath'li element "Facebook ile Bağlan" text değerini içerdiğini kontrol et
* "3" saniye bekle
*kullanıcı alanına bilgiler girilir
* "3" saniye bekle
*"com.ozdilek.ozdilekteyim:id/ivBack" id'li elemente tıkla
* "3" saniye bekle
*"com.ozdilek.ozdilekteyim:id/ivBack" id'li elemente tıkla
* "3" saniye bekle
*random ürün seçilir
* "3" saniye bekle
*"//*[@text='40']" xpath'li elemente tıkla
* "3" saniye bekle
*"//*[@text='SEPETE EKLE']" xpath'li elemente tıkla


ozdilekAppiumTestKonsept
----------------------------------------
*Uygulamanın Açıldığı Kontrol Edilir
*Alışverişe Başla Butonuna Tıklanır
*Alışveriş Sayfasının Açıldığı Doğrulanır
*Kategoriler Sayfası Açılır
*Kategoriler Sayfasının Açıldığı Doğrulanır
*Menüden Kadın Seçeneğine Tıklanır
*Pantolon Kategorisi Açılır
*Sayfanın En Aşağısına Doğru İki Kez Scroll Yapılır
*random ürün seçilir
*Ürün Detay Sayfasının Açıldığı Kontrol Edilir
*Favoriler Butonuna Tıklanır
*Giriş Yapma Sayfasının Açıldığı Doğrulanır
*Kullanıcı Adı Alanına Text Bilgisi Girilir,Password Alanına Şifre Yazılır
*Geri Butonuna İki Kere Tıklanır
*Tekrar Random Ürün Seçilir
*Seçilen Ürün Sepete Eklenir






















