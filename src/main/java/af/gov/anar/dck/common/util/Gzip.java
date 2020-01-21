package af.gov.anar.dck.common.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Gzip {

	public static byte[] compress(String data) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream(data.length());
		GZIPOutputStream gzip = new GZIPOutputStream(bos);
		gzip.write(data.getBytes());
		gzip.close();
		byte[] compressed = bos.toByteArray();
		bos.close();
		return compressed;
	}
	
    public String decompress(String str) throws IOException { 
        if (str == null || str.length() == 0) { 
           return str; 
        } 
        System.out.println("Input String length : " + str.length()); 
        GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(Base64.decodeBase64(str))); 
        String outStr = ""; 
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[256];
        int n;
        while ((n = gis.read(buffer)) >= 0) {
            out.write(buffer, 0, n);
        }
        System.out.println("Output String lenght : " + outStr.length()); 
        return new String(out.toByteArray()); 
 } 
    
    public String de_compress(final byte[] compressed) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(compressed);
        GZIPInputStream gis = new GZIPInputStream(bis);
        byte[] bytes = IOUtils.toByteArray(gis);
        return new String(bytes, "UTF-8");
    }
}