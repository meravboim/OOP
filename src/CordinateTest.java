import static org.junit.Assert.*;

import org.junit.Test;

public class CordinateTest {

	@Test
	public void testCordinate() {
		Cordinate core = new Cordinate();
		if(core.getAlt()!=-1 || core.getLat()!=-1 || core.getLon()!=-1)
			fail("there is a problem with the  empty constractur");
	}

	@Test
	public void testCordinateDoubleDoubleDouble() {
		Cordinate core = new Cordinate(1,2,3);
		if(core.getLat()!=1 || core.getLon()!=2 || core.getAlt()!=3)
			fail("there is a problem with the  constractur");
	}

	@Test
	public void testCordinateCordinate() {
		Cordinate cord = new Cordinate(4,5,6);
		Cordinate core = new Cordinate(cord);
		if(core.getLat()!=4 || core.getLon()!=5 || core.getAlt()!=6)
			fail("there is a problem with the copy constractur");
	}



	@Test
	public void testGetLon() {
		Cordinate cord = new Cordinate(4,5,6);
		if(cord.getLon()!=5)
			fail("there is a problem with the method GetLon");
	}

	@Test
	public void testSetLon() {
		Cordinate cord = new Cordinate(4,5,6);
		cord.setLon(7);
		if(cord.getLon()!=7)
			fail("there is a problem with the method SetLon");
	}

	@Test
	public void testGetLat() {
		Cordinate cord = new Cordinate(4,5,6);
		if(cord.getLat()!=4)
			fail("there is a problem with the method GetLat");
	}

	@Test
	public void testSetLat() {
		Cordinate cord = new Cordinate(4,5,6);
		cord.setLat(8);
		if(cord.getLat()!=8)
			fail("there is a problem with the method SetLat");
	}

	@Test
	public void testGetAlt() {
		Cordinate cord = new Cordinate(4,5,6);
		if(cord.getAlt()!=6)
			fail("there is a problem with the method GetAlt");
	}

	@Test
	public void testSetAlt() {
		Cordinate cord = new Cordinate(4,5,6);
		cord.setAlt(9);
		if(cord.getAlt()!=9)
			fail("there is a problem with the method SetAlt");
	}

	@Test
	public void testEqual() {
		Cordinate cord = new Cordinate(4,5,6);
		Cordinate core = new Cordinate(4,5,6);
		if(!cord.equal(cord, core))
			fail("there is a problem with the method equals");
	}
	@Test
	public void testDistance() {
		Cordinate	a= new Cordinate(3.4,5,9)	;
		Cordinate	b= new Cordinate(8.4,9,9)	;
		if (a.distance(a,b) != Math.sqrt(41))
			fail("There is a broblem with the method Distance");
	}


}
