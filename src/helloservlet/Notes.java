package helloservlet;

public class Notes {

	
	//Server nedir ?
	//Server diyince aklımıza ;
	//1 FİZİKSEL MAKİNE (HARDWARE),
	//2 BİR APPLİCATİON (SOFTWARE),
	//gelir .
	//Serverin görevi nedir ?
	//1-Client/istemcinin isteğini karşılamak (handle request)
	//2-bu issteğe karşılık bir response/cevap oluşturmak ve döndirmek
	//resource --> kaynak (pdf,png, ..)
	
	//Clien/istemci nedir ?
	//1-son kullanıcı 
	//2 browser (chrome ..)
	
	//browserın görevi
	//browserlar , html kodlarını yorumlar ve son kullanıcının anlayacağı şekilde render eder.
	 //http nedir ?
	//hyper text transfer protocol
	//browser ile server arasındaki iletişim(kaynak isteme,cevap dönme),http ile yapılmaktadır .
	//java application serverlar
	//tomcat,weblogic,glassfish,jetty vs ..
	
   	//Servletlerin main metodu yoktur ,bütün kontrol Servlet Container ın sorumluluğu altındadır
	//server a bir istek geldiğinde ,gelen istek eğer bir  servleti yada jsp yi tetikliyorsa bu durumda isteği Servlet Container/Servlet Engine karşılar
	//Communication desteği sağlar(port dinle,stream oluştur,soket aç kapa vs gerekmez)
	//lifecyle management (bütün yaşam döngüsü container sorumluluğu altındadır
	//multithread support (her istek geldiğinde bir tane thread oluşturur .
	//jsp support (jsp dosyalarını trnslte eder )
	
	
}
