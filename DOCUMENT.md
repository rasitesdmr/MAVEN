                           Maven Nedir ?

Java ‘ da uygulama geliştirirken çeşitli kütüphaneler kullanabiliriz.
Kütüphaneleri kullanmak için jar dosyalarını tek tek indirip projeye aktarmamız gerek ve bu jar 
dosyalarını güncellemek istediğimizde bize zorluklar çıkarabilir . 
Bunun yerine maven kullanarak dependencies(bağımlıklar) yöntemiyle basit bir şekilde ekleyebiliriz .
                         
                         Maven LifeCycle ?
 
 Build() yaşam döngüsü

->Clean : Build işlemi sonrasında oluşanları siler.

->Validate(doğrulamak) : Bilgilerin doğruluğunu kontrol eder.

->Compile : Kaynak kodu derler.

->Test : Kodu test eder.

->Package : Derlenmiş kodu paketler

->Verify(Doğrulayın) : Sonuçları kontrol ederek istenilen kriterlerin doğruluğundan emin olur

->Install : Dependency leri local depoya yükler

->Site : Dokümantasyon oluşturur.

->Deploy : Paketleri uzak depoya yükler.

                         What is the Maven pom.xml? 
                         
Maven kullmak için pom.xml dosyasına ihtiyaç duyarız. 
PROJECT OBJECT MODEL (POM)(PROJE NESNE MODELİ)
Proje hakkında bilgileri ,bağımlılıkları ,projeyi derlemek için gerekli komutları 
vb. bilgileri içeren dosyadır . Maven bütün işlemlerini pom.xml dosyasını baz alarak yapar.
                      
