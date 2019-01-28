package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
import java.awt.Color;

public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testStripe()
  {
	  Picture glitch = new Picture("CursedImage4.png");
	  glitch.explore();
	  glitch.stripe(-200, 50,50, 100,100);
	  glitch.explore();
			  
  }
  public static void testSteganography()
  {
	  Picture source = new Picture("CursedImage3.png");
	  Picture message = new Picture("BlackandWhitePic.png");
	  source.explore();
	  message.explore();
	  source.hidePicture(message);
	  source.explore();
	  source.revealPicture();
	  source.explore();
  }
  public static void testChromakey()
  {
	  Picture source = new Picture("SmolCat.jpg");
	  Picture background = new Picture("CuteBackground.jpg");
	  source.explore();
	  background.explore(); 
	  source.chromakey(background, Color.WHITE);
	  source.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture glitched = new Picture("caterpillar.jpg");
    glitched.explore();
    glitched.mirrorVertical();
    glitched.explore();
  }
  public static void testRandomColor()
  {
	  Picture butterfly1 = new Picture ("butterfly1.jpg");
	  butterfly1.explore();
	  butterfly1.randomColor(); 
	  butterfly1.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testNegate()
  {
	  Picture negate = new Picture("CursedImage4.png");
	  negate.explore();
	  negate.negate();
	  negate.explore();
  }
  public static void testRandomize()
  {
	  Picture random = new Picture("CursedImage3.png");
	  random.explore();
	  random.randomize(0, 0, 50, 50);
	  random.explore();
	  
  }
  public static void testGlitching()
  {
	  Picture cursed = new Picture("CursedImage4.png");
	  cursed.explore();
	  cursed.negate();
	  cursed.mirrorVertical();
	  cursed.randomize(0, 0, cursed.getWidth(), cursed.getHeight());
	  
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
//     uncomment a call here to run a test
//     and comment out the ones you don't want
//     to run
	  testGlitching();
//    testZeroBlue();
//	  testStripe();
//    testKeepOnlyBlue();
//    testKeepOnlyRed();
//    testKeepOnlyGreen();
//    testNegate();
//	  testRandomize();
//    testGrayscale();
//	  testRandomColor();
//    testFixUnderwater();
//    testMirrorVertical();
//    testMirrorTemple();
//    testMirrorArms();
//    testMirrorGull();
//    testMirrorDiagonal();
//    testCollage();
//	  testSteganography();
//    testCopy();
//    testEdgeDetection();
//    testEdgeDetection2();
//    testChromakey();
//	  testRandomColor();
//    testEncodeAndDecode();
//    testGetCountRedOverValue(250);
//    testSetRedToHalfValueInTopHalf();
//    testClearBlueOverValue(200);
//    testGetAverageForColumn(0);
  }
}