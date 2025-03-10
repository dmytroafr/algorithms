import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

class UCDemo{
	public static void main(String[] args) throws Exception{
		int c;
		URL hp = new URI("https://e-chem.com.ua/").toURL();
		URLConnection hpCon = hp.openConnection();;
		// get Date
		long d = hpCon.getDate();
		if(d == 0){
			System.out.println("Bo date information.");
		} else{
			System.out.println("Date: " + new Date(d));
		}
		// get content type
		System.out.println("Conten-Type: " + hpCon.getContentType());
		// get expiration date
		d = hpCon.getExpiration();
		if(d == 0){
			System.out.println("No expiration information.");
		} else {
			System.out.println("Expires: " + new Date(d));
		}
		// get last-modified date
		d = hpCon.getLastModified();
		if(d == 0){
			System.out.println("No Last-Modified information.");
		} else {
			System.out.println("Last-Modified: " + new Date(d));
		}
		// get Content Length
		long len = hpCon.getContentLengthLong();
		if(len == -1){
			System.out.println("Content-Length unavailable.");
		} else {
			System.out.println("Content-Length: " + len);
		}
		if(len != 0){
			System.out.println("=== Conten ===");
			InputStream input =  hpCon.getInputStream();
			while((c = input.read()) != -1){
				System.out.print((char) c);
			}
			input.close();
		} else {
			System.out.println("No content available.");
		}
	}
}