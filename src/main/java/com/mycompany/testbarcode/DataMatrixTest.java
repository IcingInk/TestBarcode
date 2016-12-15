
package com.mycompany.testbarcode;

/**
 *
 * @author ingimar
 */
//import java.awt.image.BufferedImage;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStream;
//
//import org.apache.avalon.framework.configuration.Configuration;
//import org.apache.avalon.framework.configuration.ConfigurationException;
//
//import org.apache.avalon.framework.configuration.DefaultConfiguration;
//import org.krysalis.barcode4j.BarcodeException;
//import org.krysalis.barcode4j.BarcodeGenerator;
//import org.krysalis.barcode4j.BarcodeUtil;
//import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

public class DataMatrixTest {

  /**
   * http://bethecoder.com/applications/tutorials/barcodes/barcode4j/datamatrix-barcode.html
   * @param args
   * @throws BarcodeException 
   * @throws ConfigurationException 
   * @throws IOException 
   */
//  public static void main(String[] args) throws ConfigurationException, BarcodeException, IOException {

//    BarcodeUtil util = BarcodeUtil.getInstance();
//    BarcodeGenerator gen = util.createBarcodeGenerator(buildCfg("datamatrix"));
//
//    OutputStream fout = new FileOutputStream("datamatrix.jpg");
//    int resolution = 200;
//    BitmapCanvasProvider canvas = new BitmapCanvasProvider(
//        fout, "image/jpeg", resolution, BufferedImage.TYPE_BYTE_BINARY, false, 0);
//
//    gen.generateBarcode(canvas, "be the coder");
//    canvas.finish();
//  }
//
//  private static Configuration buildCfg(String type) {
//    DefaultConfiguration cfg = new DefaultConfiguration("barcode");
//
//    //Bar code type
//    DefaultConfiguration child = new DefaultConfiguration(type);
//      cfg.addChild(child);
//    
//      //Human readable text position
//      DefaultConfiguration attr = new DefaultConfiguration("human-readable");
//      DefaultConfiguration subAttr = new DefaultConfiguration("placement");
//        subAttr.setValue("bottom");
//        attr.addChild(subAttr);
//        
//        child.addChild(attr);
//    return cfg;
//  }
}
